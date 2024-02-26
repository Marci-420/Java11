package com.example.bukkmaraton;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {


    @FXML
    private Label TimeInh;

    @FXML
    private Label TimeIns;

    @FXML
    private TextField ido;

    @FXML
    public Button szamol;


    @FXML
    private ChoiceBox<String> menu;

    @FXML
    protected void initialize() {
       menu.setItems(FXCollections.observableArrayList(
               "Mini - 16 km",
               "Rövid - 38 km",
               "Pedelec - 54 km",
               "Közép - 57 km",
               "Hosszú - 94 km"
       ));
       menu.getSelectionModel().select("Közép - 57 km");
    }


    @FXML
    private void calculate(ActionEvent actionEvent){
        String[] selected = menu.getSelectionModel().getSelectedItem().split(" ");
        int km = Integer.parseInt(selected[2]);

        String[] selectedTime = ido.getText().split(":");
        double TimeInSecs = (Integer.parseInt(selectedTime[0]) * 3600) + (Integer.parseInt(selectedTime[1]) * 60) + Integer.parseInt(selectedTime[2]);


        double kmh = km / (TimeInSecs / 3600);
        TimeInh.setText(String.format("%.2f", (kmh)));

        double ms = (1000 * km) / TimeInSecs;
        TimeIns.setText(String.format("%.2f", (ms)));
    }



}