module com.example.loginform_04_15 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.loginform_04_15 to javafx.fxml;
    exports com.example.loginform_04_15;
}