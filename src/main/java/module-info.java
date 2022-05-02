module com.example.notlogik {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.notlogik to javafx.fxml;
    exports com.example.notlogik;
}