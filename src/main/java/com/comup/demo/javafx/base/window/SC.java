package com.comup.demo.javafx.base.window;

import javafx.stage.Stage;

public class SC<T> {
    private Stage mStage;
    private Stage nStage;
    private T controller;

    public SC(Stage mStage, Stage nStage, T controller) {
        this.mStage = mStage;
        this.nStage = nStage;
        this.controller = controller;
    }

    public Stage getmStage() {
        return mStage;
    }

    public Stage getnStage() {
        return nStage;
    }

    public T getController() {
        return controller;
    }
}
