module com.example.lotto_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lotto_ to javafx.fxml;
    exports com.example.lotto_;
}