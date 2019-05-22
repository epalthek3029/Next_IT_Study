package basic;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex03Layout extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		HBox root = new HBox();
		root.setPadding(new Insets(30, 30, 30, 30));	// 안쪽 여백
		root.setSpacing(10);	// 컨트롤 간 간격
		
		TextField textField = new TextField();
		textField.setPrefWidth(10);	// 텍스트 필드 크기
		
		Button btnOk = new Button();
		btnOk.setText("확인");
		
		root.getChildren();
		
		ObservableList<Node> children = root.getChildren();
		children.add(textField);
		children.add(btnOk);
		
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Ex03Layout");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
