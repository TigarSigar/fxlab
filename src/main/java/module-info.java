module org.example.wordswich {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens org.example.wordswich to javafx.fxml;
    opens org.example.checkbox to javafx.fxml;
    opens org.example.order to javafx.fxml;
    exports org.example.wordswich;
    exports org.example.checkbox;
    exports org.example.order;
}