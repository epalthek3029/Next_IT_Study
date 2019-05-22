package concurrent;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class Ex03ServiceRootController implements Initializable {

	@FXML	ProgressBar progressBar;
	@FXML 	Label lblprogress;
	@FXML	Label lblResult;

	TimeService timeService;
	
	class TimeService extends Service<Integer>{
		
		@Override
		protected Task<Integer> createTask() {
			
			Task<Integer> task = new Task<Integer>() {
				
				@Override
				protected Integer call() throws Exception {
					
					int result = 0;
					
					for(int i = 1; i <= 100; i++) {
						
						if(isCancelled()) {
							break;
						}
						
						result += i;
						
						updateProgress(i, 100);
						updateMessage(i + "");
						
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {}
					}
					return result;
				}
				
				// 작업 상태별 콜백 메서드
				@Override
				protected void succeeded() {
					System.out.println("=====  succeeded =====");
					lblResult.setText(getValue() + "");
				}
				
				@Override
				protected void cancelled() {
					System.out.println("=====  cancelled =====");
					lblResult.setText("취소됨");
				}
				
				@Override
				protected void failed() {
					System.out.println("=====  failed =====");
					lblResult.setText("실패됨");
				}
				
			};
			
			// 속성 바인딩.
			progressBar.progressProperty().bind(task.progressProperty());
			lblprogress.textProperty().bind(task.messageProperty());
			
			return task;
		}
		
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		timeService = new TimeService();
		timeService.start();
	}

	public void handleStart(ActionEvent evet) {
		
		lblResult.setText("진행중");
		timeService.restart();
		
	}

	public void handleStop(ActionEvent evet) {
		timeService.cancel();
	}
}
