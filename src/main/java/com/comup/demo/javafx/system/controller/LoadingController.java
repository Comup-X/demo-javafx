package com.comup.demo.javafx.system.controller;

import com.comup.demo.javafx.base.util.CycleList;
import com.comup.demo.javafx.base.window.FXMLLoader;
import com.comup.demo.javafx.base.window.SC;
import com.comup.demo.javafx.base.window.SWindow;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class LoadingController implements Initializable {

    @FXML
    private Label _loadingLabel;
    @FXML
    private ImageView _loadingImage;

    private CycleList<String> points = new CycleList<>(".", "..", "...");

    private ScheduledExecutorService executor = new ScheduledThreadPoolExecutor(1);

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        _loadingImage.setImage(new Image(this.getClass().getResourceAsStream("/image/loading.gif")));
        final String baseLoadingString = _loadingLabel.getText();
        executor.scheduleWithFixedDelay(() -> Platform.runLater(()
                        -> _loadingLabel.setText(baseLoadingString + points.getNext())),
                0, 1, TimeUnit.SECONDS);
        _loadingImage.setOnMouseClicked(event -> {
            SC<LoginController> sc = FXMLLoader.loadStage(FXMLLoader.mStage, SWindow.LOGIN, LoginController.class);
            LoginController controller = sc.getController();
            sc.getnStage().setOnShown(event1 -> {
                Map<String, Object> objectObjectHashMap = new HashMap<>();
                objectObjectHashMap.put("One", 1);
                controller.setParams(objectObjectHashMap);
            });
            sc.getmStage().close();
            sc.getnStage().show();
        });
    }
}