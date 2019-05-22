package control;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class Ex04MediaRootController implements Initializable{

	@FXML MediaView mediaView;
	
	MediaPlayer mediaPlayer;
	
	@FXML Button btnPlay;
	@FXML Button btnPause;
	@FXML Button btnStop;
	
	boolean endOfMedia = false;
	
	@FXML Label lblTime;
	@FXML ProgressBar progressBar;
	@FXML ProgressIndicator progressIndicator;
	@FXML Slider slider;
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// File medaiFile = new File("media/StayWithMeMV2.m4v");
		// File medaiFile = new File("media/076 Shawn Mendes - Theres Nothing Holdin Me Back.mp3");
		 File medaiFile = new File("media/KDA-POPSTARS.mp4");
		
		
		String source = medaiFile.toURI().toString();
		
		Media media = new Media(source);
		
		mediaPlayer = new MediaPlayer(media);
		
		mediaView.setMediaPlayer(mediaPlayer);
		
		// 미디어 상태에 따른 제어
		mediaPlayer.setOnReady(new Runnable() {
			@Override
			public void run() {
				System.out.println("setOnReady =========");
				
				// 미디어의 현재시간 속성 감시
				mediaPlayer.currentTimeProperty().addListener(new ChangeListener<Duration>() {

					@Override
					public void changed(ObservableValue<? extends Duration> observable, Duration oldValue,
							Duration newValue) {
						
						// 진행상태
						double progress = mediaPlayer.getCurrentTime().toSeconds() / mediaPlayer.getTotalDuration().toSeconds();
						progressBar.setProgress(progress);		//0 ~ 1
						progressIndicator.setProgress(progress);
						
						lblTime.setText((int)mediaPlayer.getCurrentTime().toSeconds() +  "/" + (int)mediaPlayer.getTotalDuration().toSeconds() + " sec");
						
					}
					
					
				});
				
				
				btnPlay.setDisable(false);	// 활성
				btnPause.setDisable(true);
				btnStop.setDisable(true);
			}
		});
		
		mediaPlayer.setOnPlaying(()-> {
				System.out.println("setOnPlaying =========");
				
				btnPlay.setDisable(true);		// 비활성화
				btnPause.setDisable(false);	
				btnStop.setDisable(false);
			});
		
		mediaPlayer.setOnPaused(()-> {
				System.out.println("setOnPaused =========");
				
				btnPlay.setDisable(false);
				btnPause.setDisable(true);
				btnStop.setDisable(false);
			});
		
		mediaPlayer.setOnStopped(()-> {
				System.out.println("setOnStopped =========");
				
				btnPlay.setDisable(false);
				btnPause.setDisable(true);
				btnStop.setDisable(true);
			});
		
		mediaPlayer.setOnEndOfMedia(()-> {
				System.out.println("setOnEndOfMedia =========");
				
				endOfMedia =true;
				
				progressBar.setProgress(1.0);
				progressIndicator.setProgress(1.0);
				
				btnPlay.setDisable(false);
				btnPause.setDisable(true);
				btnStop.setDisable(false);	// Play가 끝난것과 다시 시작하는것은 의미가 다르다
			});
		
		// 이벤트 핸들러 등록
		btnPlay.setOnAction((event)->{
			
			if(endOfMedia) {
				mediaPlayer.stop();
				mediaPlayer.seek(mediaPlayer.getStartTime());
			}
			mediaPlayer.play();
		});
		
		btnPause.setOnAction(event-> mediaPlayer.pause());
		
		btnStop.setOnAction(event->mediaPlayer.stop());
		
		// 볼륨 조절
		slider.setMin(0.0);
		slider.setMax(1.0);
		slider.setValue(0.5);
		
		slider.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				mediaPlayer.setVolume(newValue.doubleValue());	// 0.0 ~ 1.0
			}
			
		});
		
		
				
	}
}
