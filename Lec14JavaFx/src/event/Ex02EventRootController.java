package event;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class Ex02EventRootController implements Initializable{
	
	@FXML Button btn1;	// 객체 주입(DI)
	@FXML Button btn2;
	@FXML Button btn3;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 이벤트 핸드러 등록, UI 컴트롤 초기화, 속성 감시 및 바인딩.
		
		// 이벤트 핸들러 등록
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("버튼 1번 클릭됨..");
			}
		});
		
		btn2.setOnAction((event)->handleBtn2Action(event));
		
//		btn3.setOnAction((event)->handleBtn2Action(event));
	}
	
	public void handleBtn2Action(ActionEvent event) {
		System.out.println("버튼 2번 클릭됨....");
		
	}
	
	public void handleBtn3Action(ActionEvent event) {
		System.out.println("버튼 3번 클릭됨....");
		
	}
	
}
