module org.example.calculatorapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens org.example.calculatorapp to javafx.fxml;
    exports org.example.calculatorapp;
}