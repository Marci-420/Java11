module com.example.demo_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo_ to javafx.fxml;
    exports com.example.demo_;
}