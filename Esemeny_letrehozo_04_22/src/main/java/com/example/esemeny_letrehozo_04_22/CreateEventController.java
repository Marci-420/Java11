package com.example.esemeny_letrehozo_04_22;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;

public class CreateEventController {


    @FXML
    private Button but;


    @FXML
    protected void onBackButtonClick() throws Exception {
        HelloApplication m = new HelloApplication();
        m.changeScene("hello-view.fxml");
    }


}
