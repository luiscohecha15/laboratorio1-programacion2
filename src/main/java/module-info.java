module org.example.lab {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.lab1 to javafx.fxml;
    exports org.example.lab1;
}