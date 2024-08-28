module com.garry.garrysoftware {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.garry.garrysoftware to javafx.fxml;
    exports com.garry.garrysoftware;
}