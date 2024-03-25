package com.example.orvosinobeldijasokgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField age;

    @FXML
    private TextField name;

    @FXML
    private TextField szh;
    @FXML
    private TextField country;

    @FXML
    private Label error;

    @FXML
    private Label error2;


    @FXML
    private void onSave (ActionEvent actionEvent){
        if(age.getText() == ""){
            error.setText("Töltsön ki minden mezőt!");
        }
        if(name.getText() == ""){
            error.setText("Töltsön ki minden mezőt!");
        }
        if(szh.getText() == ""){
            error.setText("Töltsön ki minden mezőt!");
        }
        if(country.getText() == ""){
            error.setText("Töltsön ki minden mezőt!");
        }
        if(Integer.parseInt(age.getText()) > 1989){
            error2.setText("Hiba! Az évszám nem megfelelő");
        }
    }






}