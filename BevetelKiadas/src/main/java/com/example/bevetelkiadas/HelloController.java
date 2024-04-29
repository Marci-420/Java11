package com.example.bevetelkiadas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

public class HelloController {
    @FXML
    private TextField Kosszeg, Kdatum, Kleiras, Bosszeg, Bdatum, Bleiras;

    @FXML
    private Rectangle green, red;


    @FXML
    private void onKiadas (ActionEvent actionEvent){
        red.setHeight(0);

        String osszeg = Kosszeg.getText();
        String datum = Kdatum.getText();
        String leiras = Kleiras.getText();

        ArrayList<String> kiadas = new ArrayList<>();
        kiadas.add(osszeg);
        kiadas.add(datum);
        kiadas.add(leiras);

        Integer osszegSz = Integer.parseInt(osszeg);

        if(osszegSz != 0){
            red.setHeight(osszegSz * 0.001);
        }
    }

    @FXML
    private void onBevetel (ActionEvent actionEvent){
        green.setHeight(0);

        String osszeg2 = Bosszeg.getText();
        String datum2 = Bdatum.getText();
        String leiras2 = Bleiras.getText();

        ArrayList<String> bevetel = new ArrayList<>();
        bevetel.add(osszeg2);
        bevetel.add(datum2);
        bevetel.add(leiras2);
        Integer osszegSz2 = Integer.parseInt(osszeg2);

        if(osszegSz2 != 0){
            green.setHeight(osszegSz2 * 0.001);
        }




    }


}