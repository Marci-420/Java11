module com.example.hellojavafx2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hellojavafx2 to javafx.fxml;
    exports com.example.hellojavafx2;
}