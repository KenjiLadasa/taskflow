package com.main.taskflow;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotesController {

    @FXML
    private GridPane notesGrid;

    @FXML
    private void goToDashboard(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void createNewNote() {
        VBox noteBox = new VBox(5);
        noteBox.setStyle("-fx-background-color: #e0e0e0; -fx-padding: 10; -fx-border-radius: 5; -fx-background-radius: 5;");
        noteBox.setPrefSize(150, 150);

        TextArea noteText = new TextArea("New Note");
        noteText.setWrapText(true);
        noteText.setPrefSize(130, 100);

        Button deleteBtn = new Button("🗑");
        deleteBtn.setStyle("-fx-background-color: transparent;");
        deleteBtn.setOnAction(e -> notesGrid.getChildren().remove(noteBox));

        noteBox.getChildren().addAll(noteText, deleteBtn);

        int columns = 3; // default column count
        int nextIndex = notesGrid.getChildren().size();
        int nextRow = nextIndex / columns;
        int nextCol = nextIndex % columns;

        notesGrid.add(noteBox, nextCol, nextRow);
    }
}
