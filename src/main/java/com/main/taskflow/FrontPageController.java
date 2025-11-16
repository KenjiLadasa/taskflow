package com.example.yourprojectname;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;

public class FrontPageController {

    @FXML
    private Button startButton;

    @FXML
    private void goToLogin() {
        try {
            Parent loginRoot = FXMLLoader.load(getClass().getResource("/views/login.fxml"));
            Stage stage = (Stage) startButton.getScene().getWindow();
            stage.setScene(new Scene(loginRoot, 600, 600));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
