package com.javaLecture.UIClass;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AddPersonController implements Initializable {

    @FXML
    private Button button;

    @FXML
    private TextField tfName;

    @FXML
    private Label lblName;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    @FXML
    private void buttonClick() {
        String text = tfName.getText();
        lblName.setText(text);
    }

}
