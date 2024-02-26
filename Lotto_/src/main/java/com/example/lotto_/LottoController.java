package com.example.lotto_;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LottoController {

    private final int MIN =1;
    private final int MAX =90;

    @FXML
    private TextField Rbox1, Rbox2, Rbox3, Rbox4, Rbox5;


    @FXML
    protected void Random() {


    }

    int getRandomNumber() {
        int Random = (int) Math.random() + MAX + MIN;
        if (Random == Integer.parseInt(String.valueOf(Rbox1))|| Random == Integer.parseInt(String.valueOf(Rbox2)) || Random == Integer.parseInt(String.valueOf(Rbox3)) || Random == Integer.parseInt(String.valueOf(Rbox4))|| Random == Integer.parseInt(String.valueOf(Rbox5))){
            return getRandomNumber();
        }
        return Random;
    }
    }
