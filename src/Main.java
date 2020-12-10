import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainmenu.fxml"));
        primaryStage.setTitle("Monopoly Game");
        primaryStage.setScene(new Scene(root, 1920, 1080));

        //primaryStage.setMaximized( true);
        //primaryStage.setFullScreen(true);

        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}