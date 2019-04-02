package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Main.Icon;
import Main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class UebersichtController implements Initializable{
	@FXML private Button taschenrechner;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Main.setTitle("Übersicht");
	}
	
	@FXML
	private void handleTaschenrechnerButton(ActionEvent event) throws IOException {
		Stage newWindow = new Stage();
		Icon icon = new Icon();
		icon.setIcon(newWindow);
		newWindow.setTitle("Taschenrechner");
		
		newWindow.initModality(Modality.APPLICATION_MODAL);
		
		Parent geschlechtWahlFXML = FXMLLoader.load(getClass().getResource("/geschlechtWahl.fxml"));
		
		Scene geschlechtWahl = new Scene(geschlechtWahlFXML);
		
		newWindow.setScene(geschlechtWahl);
		newWindow.showAndWait();
	}
}
