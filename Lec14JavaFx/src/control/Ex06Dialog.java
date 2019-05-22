package control;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ex06Dialog extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Ex06DialogRoot.fxml"));
		
		Parent root =loader.load();
		
		Ex06DialogRootController controller = loader.getController();
		
		controller.setPrimaryStage(primaryStage);
		
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Ex06Dialog");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
