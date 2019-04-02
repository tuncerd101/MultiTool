package Main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	private static Stage primaryStage;
	private static final Path PATH = Paths.get(System.getProperty("user.home"));
	private static String pfad = PATH.toString(); 
	 
	public static void main(String[] args) {
		creatDictonaries();
		launch(args);
	}
	
	// start Anwendung in der Uebersicht
	@SuppressWarnings("static-access")
	@Override
	public void start(Stage primaryStage) throws Exception {
	
		this.primaryStage = primaryStage;
		Icon icon = new Icon();
		icon.setIcon(primaryStage);
		
		if(!checkIfSaveFileExist()){
		//	slist = new Schuhliste(new ArrayList<Schuh>());
		//	Store.write(slist); 
		}
		
		Parent uebersichtFXML = FXMLLoader.load(getClass().getResource("/uebersicht.fxml"));

		Scene uebersicht = new Scene(uebersichtFXML);
		
		primaryStage.setScene(uebersicht);
		primaryStage.show();
	} 

	public static Stage getPrimaryStage() {
		return primaryStage;
	}
	
	public static void setTitle(String title) {
		getPrimaryStage().setTitle(title);
	}
	
	private static boolean checkIfSaveFileExist() {
		File f = new File(System.getProperty("user.home"), "/MultiTool/MultiTool - Daten.json");
		
		if(f.exists() && !f.isDirectory()) {
			return true;
		}
		return false;
	}
	
	private static void creatDictonaries() {
		new File(pfad, "MultiTool").mkdirs();
		new File(pfad, "/MultiTool/Pics").mkdirs();
		//TODO Icon.png zu pics als  default.png
	}
	
	public void backToUebersicht() throws IOException {
		Stage stage = getPrimaryStage();
		Parent root = FXMLLoader.load(getClass().getResource("/uebersicht.fxml"));
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	
}
