module com.example.seamlesskbs {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.example.seamlesskbs to javafx.fxml;
    exports com.example.seamlesskbs;
}