package event;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01Event extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {

		HBox root = new HBox();
		root.setPrefSize(200, 150);
		root.setPadding(new Insets(10));	// 상하좌우
		root.setSpacing(10);	// 간격
		root.setAlignment(Pos.CENTER);
		
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		
		root.getChildren().addAll(btn1, btn2);
		
		// 이벤트 핸들러 등록		
		btn1.setOnAction( new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("버튼 1번 클릭....");
			}
		});
		
		// 람다식, 1.8버전 이후
		btn2.setOnAction((event)->System.out.println("버튼 2번 클릭...."));
		
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Ex01Event");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
