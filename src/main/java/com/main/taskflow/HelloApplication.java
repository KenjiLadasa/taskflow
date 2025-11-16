package com.main.taskflow;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Task Flow");

        FrontPage frontPage = new FrontPage();
        Scene scene = new Scene(frontPage.getView(), 900, 500);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
