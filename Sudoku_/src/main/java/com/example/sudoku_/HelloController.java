package com.example.sudoku_;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    public Label size, size2;
    public Button minus, plus;
    public TextField nums;

    @FXML
    public void minusButtonClick(ActionEvent actionEvent) {
        int num = Integer.parseInt(size.getText());

        if(num > 4){
            size.setText(String.valueOf(num-1));
        }
    }
    public void plusButtonClick(ActionEvent actionEvent) {
        int num = Integer.parseInt(size.getText());

        if(num < 9){
            size.setText(String.valueOf(num + 1));
        }
    }


    public void sizetextfield(ActionEvent actionEvent) {
        String lengthString = (nums.getText());
        int length = lengthString.length();

        size2.setText(String.valueOf(length));
    }
}