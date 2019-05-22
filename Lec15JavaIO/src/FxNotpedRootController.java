import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FxNotpedRootController implements Initializable {

	@FXML
	TextArea txtDocument;
	private Stage primaryStage;

	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	public void handleNew(ActionEvent event) {
		primaryStage.setTitle("noname");
		txtDocument.clear();
	}

	public void handleOpen(ActionEvent event) {
		FileChooser chooser = new FileChooser();

		chooser.showOpenDialog(primaryStage);

		File selectedFile = chooser.showSaveDialog(primaryStage);

		if (selectedFile != null) {

			primaryStage.setTitle(selectedFile.getPath());
			txtDocument.clear();

			Thread thread = new Thread() {
				@Override
				public void run() {
					BufferedReader reader = null;

					try {
						reader = new BufferedReader(new FileReader(selectedFile));

						while (true) {
							String str = reader.readLine();
							if (str == null) {
								break;
							}
							
							Platform.runLater(()->{
								txtDocument.appendText(str + "\n");
							});
							
							try {
								Thread.sleep(200);
							} catch (InterruptedException e) {}
						}
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							if (reader != null)
								reader.close();
						} catch (IOException e) {
						}
					}
				}
			};
			
			thread.setDaemon(true);
			thread.start();
		}
	}

	public void handleSave(ActionEvent event) {
		FileChooser chooser = new FileChooser();
		
		File selecetFile = chooser.showSaveDialog(primaryStage);
		
		if(selecetFile != null) {
			
			primaryStage.setTitle(selecetFile.getPath());
			
			PrintWriter writer = null;
			
			try {
				writer = new PrintWriter(new FileWriter(selecetFile));
				
				writer.print(txtDocument.getText());
				writer.flush();
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if(writer != null) writer.close();
			}
		}
	}

	public void handleExit(ActionEvent event) {
		Platform.exit();
	}

	public void handleCut(ActionEvent event) {
		txtDocument.cut();
	}

	public void handleCopy(ActionEvent event) {
		txtDocument.copy();
	}

	public void handlePaste(ActionEvent event) {
		txtDocument.paste();
	}
}
