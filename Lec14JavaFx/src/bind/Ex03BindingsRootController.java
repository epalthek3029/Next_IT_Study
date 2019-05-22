package bind;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class Ex03BindingsRootController implements Initializable{

	@FXML AnchorPane root;
	@FXML Circle circle;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// 속성 바인딩.
		circle.centerXProperty().bind(Bindings.divide(root.widthProperty(), 2));
		circle.centerYProperty().bind(Bindings.divide(root.heightProperty(), 2));
	}
}
