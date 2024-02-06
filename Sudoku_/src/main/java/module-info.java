module com.example.sudoku_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sudoku_ to javafx.fxml;
    exports com.example.sudoku_;
}