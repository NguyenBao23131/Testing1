module com.mycompany.btgui {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.btgui to javafx.fxml;
    exports com.mycompany.btgui;
}
