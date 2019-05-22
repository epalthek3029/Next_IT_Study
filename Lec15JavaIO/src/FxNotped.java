import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxNotped extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("FxNotpedRoot.fxml"));

		Parent root = loader.load();
		
		FxNotpedRootController controller = loader.getController();
		
		controller.setPrimaryStage(primaryStage);
		
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("FxNotped");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
