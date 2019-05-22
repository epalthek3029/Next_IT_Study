

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class TimeController implements Initializable{

	@FXML private Button newBtn;
	@FXML private Button pauseBtn;
	@FXML private Button reStartBtn;
	@FXML private Label timeLabel;
	 private Boolean isStart = false;
	 private Timeline timeLine; 
	 private DoubleProperty timeSeconds = new SimpleDoubleProperty();
	 private Duration time = Duration.ZERO;
	 
	 
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		timeLine = new Timeline(); 
        timeLine.setCycleCount(Timeline.INDEFINITE);
        timeLine.play();
		
	}
	
	public void newButton(ActionEvent event){
		timeLine.stop(); 
    	time = Duration.ZERO;
    	timeLabel.textProperty().bind(timeSeconds.asString());
    	isStart=true; 
    	if(isStart == true){ 
        	 if (timeLine == null) {
             } else {
                 timeLine = new Timeline(
                     new KeyFrame(Duration.millis(10),
                     new EventHandler<ActionEvent>() {
                         @Override
                         public void handle(ActionEvent t) {
                             Duration duration = ((KeyFrame)t.getSource()).getTime();
                             time = time.add(duration);
                             timeSeconds.set(time.toSeconds());
                          }
                     })
                 );
                 timeLine.setCycleCount(Timeline.INDEFINITE);
                 timeLine.play();
             }
        }
	}
	public void pauseButton(ActionEvent event){
		timeLine.stop();
	}
	public void reStartButton(ActionEvent event){
		timeLine.play(); 
	}
//	public void allStopButton(ActionEvent event){
//		timeLine.
//	}
}
