package com.example.autok_03_11;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class HelloController {
    @FXML
    public TextField marka, tipus, henger, szemelyek, rendszam;




    @FXML
    protected void onHelloButtonClick() {
        ArrayList<String> adatok = new ArrayList<>();

        String mark = marka.getText();
        String tip = tipus.getText();
        double heur = Double.parseDouble(henger.getText());
        int szszsz = Integer.parseInt(szemelyek.getText());
        String rendsz = rendszam.getText();

        if (!(marka.equals("") || tipus.equals("") || heur <= 0 || szszsz <= 0 || rendszam.equals(""))) {
            Auto a1 = new Auto(mark, tip, heur, szszsz, rendsz);
        }
    }
}