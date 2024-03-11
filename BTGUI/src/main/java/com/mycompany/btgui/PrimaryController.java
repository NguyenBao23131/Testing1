package com.mycompany.btgui;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        System.out.println("Hello World");
        App.setRoot("secondary");
    }
}
