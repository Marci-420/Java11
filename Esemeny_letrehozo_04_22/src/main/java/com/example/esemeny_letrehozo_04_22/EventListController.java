package com.example.esemeny_letrehozo_04_22;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class EventListController {

    @FXML
    private Button back;

    @FXML
    protected void onBackButtonClick() throws Exception {
        HelloApplication m = new HelloApplication();
        m.changeScene("hello-view.fxml");
    }
}
