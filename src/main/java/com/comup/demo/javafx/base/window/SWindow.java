package com.comup.demo.javafx.base.window;

import java.util.Locale;
import java.util.ResourceBundle;

public enum SWindow {
    LOGIN("/fxml/login.fxml");

    private ResourceBundle resourceBundle = ResourceBundle.getBundle("i18n.Login", Locale.getDefault());

    private String fxmlPath;

    SWindow(String fxmlPath) {
        this.fxmlPath = fxmlPath;
    }

    public String getTitle() {
        return resourceBundle.getString("title");
    }

    public String getFxmlPath() {
        return fxmlPath;
    }

    public ResourceBundle getResourceBundle() {
        return resourceBundle;
    }
}
