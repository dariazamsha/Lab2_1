module sample.lab2_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.lab2_1 to javafx.fxml;
    exports sample.lab2_1;
}