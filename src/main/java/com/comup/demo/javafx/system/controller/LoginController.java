package com.comup.demo.javafx.system.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    private TextField _usernameTxt;
    @FXML
    private TextField _passwordTxt;

    private Map<String,Object> params;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        _usernameTxt.setOnAction(event -> _passwordTxt.requestFocus());
        _passwordTxt.setOnAction(event -> System.out.println("登录中...."));
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
}
