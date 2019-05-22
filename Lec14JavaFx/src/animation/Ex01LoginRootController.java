package animation;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class Ex01LoginRootController implements Initializable{

	@FXML Button btnMain;
	@FXML BorderPane login;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	public void handleShowMain(ActionEvent event) {
		
		StackPane root = (StackPane)btnMain.getScene().getRoot();
		
//		root.getChildren().remove(login);
		
		// 애니메이션 효과 주기
		KeyValue keyValue = new KeyValue(login.translateXProperty(), root.getPrefWidth());
		KeyFrame keyFrame = new KeyFrame(new Duration(2000), new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("===== 애니메이션 종료 =====");
				root.getChildren().remove(login);
			}
		} ,keyValue);
		
		Timeline timeline = new Timeline();
		timeline.getKeyFrames().add(keyFrame);
		timeline.play();
	}
}
