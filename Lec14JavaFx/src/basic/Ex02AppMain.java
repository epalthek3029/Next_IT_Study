package basic;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex02AppMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		VBox root = new VBox();	// root 컨테이너
		root.setPrefWidth(300);	// 폭
		root.setPrefHeight(500);	// 높이
		root.setAlignment(Pos.CENTER);	// 정중앙 정렬
		root.setSpacing(10);	// ctrl간의 간격
		
		Label label = new Label();
		label.setFont(new Font(30));	// 폰트 사이즈
		
		label.setText("JavaFX Application");
		
		Button button = new Button();
		button.setText("Ok");
		/*
		// 이벤트 핸들링
		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println(">>> 프로그램 종료 <<<");
				//System.exit(0);
				Platform.exit();
			}
		});
		*/
		// 람다식
		button.setOnAction((event) -> {
				System.out.println(">>> 프로그램 종료 <<<");
				//System.exit(0);
				Platform.exit();
		});
		
		root.getChildren().add(label);	//루트컨테이너 안에 숑
		root.getChildren().add(button);
		
		Scene scene = new Scene(root);	// root 컨테이너
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("JavaFX Application");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
