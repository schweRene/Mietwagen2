module com.example.mietwagen {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.example.mietwagen to javafx.fxml;
    exports com.example.mietwagen;
}