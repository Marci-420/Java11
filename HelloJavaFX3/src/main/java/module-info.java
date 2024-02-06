module com.example.hellojavafx3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hellojavafx3 to javafx.fxml;
    exports com.example.hellojavafx3;
}