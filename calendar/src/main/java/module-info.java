module com.calendar {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml.crypto;

    opens com.calendar.modell to javafx.base;


    opens com.calendar to javafx.fxml;
    exports com.calendar;
}