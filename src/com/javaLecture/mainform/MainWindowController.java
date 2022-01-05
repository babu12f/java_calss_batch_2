package com.javaLecture.mainform;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindowController {

    @FXML
    private void addPersonClick() throws IOException {
        Stage primaryStage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("../addPerson/add_person.fxml"));

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.initModality(Modality.APPLICATION_MODAL);
        primaryStage.show();
    }

    @FXML
    private void personListClick() throws IOException {
        Stage primaryStage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("../personlist/person_list.fxml"));

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.initModality(Modality.APPLICATION_MODAL);
        primaryStage.show();
    }

}
