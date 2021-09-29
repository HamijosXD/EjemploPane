module com.example.ejemplopane {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejemplopane to javafx.fxml;
    exports com.example.ejemplopane;
}