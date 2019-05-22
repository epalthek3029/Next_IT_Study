package concurrent;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class Ex01RunLaterRootController implements Initializable{

	@FXML Label lblTime;
	
	boolean stop = false;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	public void handleStart(ActionEvent event) {
		
		System.out.println(Thread.currentThread().getName() + "===== handleStart 시작 =====");
		
		stop = false;
		
		// Worker Thread
		Thread thread = new Thread(){
			
		
			public void run() {
				
				SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
				
				while(stop == false) {
					
					
					String strTime = dateFormat.format(new Date());
					
					// public void run(){}
					Platform.runLater(()->{
						// UI 병경 및 생성
						lblTime.setText(strTime);
					});
					
					System.out.println(strTime);
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
					
					}
				}
			}
		};
		
		thread.setDaemon(true);
		thread.start();
	}
	
	public void handleStop(ActionEvent event) {
		stop = true;
	}
	
}
