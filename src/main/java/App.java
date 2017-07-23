import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        Application.launch(App.class, args);
    }

    public void start(Stage primaryStage) throws Exception {
        com.comup.demo.javafx.base.window.FXMLLoader.mStage =primaryStage;
        Scene scene = new Scene(FXMLLoader.load(App.class.getResource("/fxml/loading.fxml")));
        primaryStage.setTitle("System Loading");
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.getIcons().add(new Image(this.getClass().getResourceAsStream("/image/favicon.png")));
        primaryStage.show();
    }
}