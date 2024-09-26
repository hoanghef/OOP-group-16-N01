module com.example {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.MainProject to javafx.fxml;
    exports com.MainProject;
}
