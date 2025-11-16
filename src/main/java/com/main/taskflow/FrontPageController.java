package com.main.taskflow;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.Objects;

public class FrontPageController {

    @FXML
    private Button startButton;

    @FXML
    private void onStart() {
        try {
            Parent dashboard = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("dashboard.fxml")));
            Stage stage = (Stage) startButton.getScene().getWindow();
            stage.setScene(new Scene(dashboard, 900, 500));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
