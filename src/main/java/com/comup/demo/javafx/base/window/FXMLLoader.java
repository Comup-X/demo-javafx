package com.comup.demo.javafx.base.window;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class FXMLLoader extends javafx.fxml.FXMLLoader {

    private static final Logger logger = LoggerFactory.getLogger(FXMLLoader.class);

    /**
     * 当前界面
     */
    public static Stage mStage;
    /**
     * 即将需要显示的界面
     */
    private static Stage nStage;

    public static <T> SC<T> loadStage(Stage current, SWindow window, Class<T> clz) {
        javafx.fxml.FXMLLoader fxmlLoader = new javafx.fxml.FXMLLoader(FXMLLoader.class.getResource(window.getFxmlPath()), window.getResourceBundle());
        Parent root = null;
        try {
            root = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        T controller = fxmlLoader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle(window.getTitle());
        stage.setScene(scene);
        return new SC<T>(current, stage, controller);
    }
}

