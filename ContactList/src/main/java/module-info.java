module com.contactlist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.contactlist to javafx.fxml;
    exports com.contactlist;
}