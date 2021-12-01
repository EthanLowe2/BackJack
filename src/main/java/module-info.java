module lowe {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens lowe.backjack to javafx.fxml;
    exports lowe.backjack;
}