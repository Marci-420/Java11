module com.contactlista {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.contactlista to javafx.fxml;
    exports com.contactlista;
}