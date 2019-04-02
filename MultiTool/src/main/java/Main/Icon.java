package Main;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Icon {
	
	// setzt das Icon neben dem Titel und in der Taskbar ein
	public void setIcon(Stage primaryStage) {
		Image applicationIcon = new Image("file:Icon.png");
		primaryStage.getIcons().add(applicationIcon);
	}
	
	// setzt das Logo ein
	public static void setLogo(ImageView im, Image bild) {
		im.setImage(bild);
	} 
}
