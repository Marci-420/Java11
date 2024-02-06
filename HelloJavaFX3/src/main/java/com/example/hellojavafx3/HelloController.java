package com.example.hellojavafx3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    TextField nameField;

    @FXML
    private Label counter;


    int count = 0;
    @FXML
    protected void onHelloButtonClick() {
        String name = nameField.getText();
        count++;
        counter.setText(Integer.toString(count));

        if(name.isEmpty() || name.equals("Enter your name")){
            welcomeText.setText("Hello Anonymus!");

        }else{
            welcomeText.setText("Hello " + name +"!");
        }



    }
}