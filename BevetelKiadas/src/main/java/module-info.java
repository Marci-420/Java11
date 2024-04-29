module com.example.bevetelkiadas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bevetelkiadas to javafx.fxml;
    exports com.example.bevetelkiadas;
}