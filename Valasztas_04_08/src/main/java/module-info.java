module com.example.valasztas_04_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.valasztas_04_08 to javafx.fxml;
    exports com.example.valasztas_04_08;
}