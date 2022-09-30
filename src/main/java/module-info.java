module com.ilyap.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ilyap.calculator to javafx.fxml;
    exports com.ilyap.calculator;
}