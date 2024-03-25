module com.example.autok_03_11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.autok_03_11 to javafx.fxml;
    exports com.example.autok_03_11;
}