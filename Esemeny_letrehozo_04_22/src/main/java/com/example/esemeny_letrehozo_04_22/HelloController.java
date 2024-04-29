package com.example.esemeny_letrehozo_04_22;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button cr;

    @FXML
    private Button list;

    @FXML
    private Button src;


    HelloApplication main = new HelloApplication();


    @FXML
    protected void onCreateEventButtonClick() throws Exception {
        main.changeScene("createEvent-view.fxml");
    }

    @FXML
    protected void onEventListButtonClick() throws Exception {
        main.changeScene("eventlist-view.fxml");
    }

    @FXML
    protected void onSearchButtonClick() throws Exception {
        main.changeScene("searchEvent-view.fxml");
    }

}