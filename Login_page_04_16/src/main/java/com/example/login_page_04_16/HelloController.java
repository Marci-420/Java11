package com.example.login_page_04_16;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Label error, error2;

    @FXML
    protected void onLoginButtonClick() throws Exception{
        HelloApplication main = new HelloApplication();

        if (username.getText().equals("marci") && password.getText().equals("panda")) {
            main.changeScene("info-view.fxml");
        }
        if(!(username.getText().equals("marci"))){
            error.setText("A felhasználónév vagy e-mail nem egyezik!");
        }
        if(!(password.getText().equals("panda"))){
            error2.setText("A jelszó nem egyezik!");
        }
    }
}