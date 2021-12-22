package com.javaLecture.addPerson;

import com.javaLecture.PersonInfo;
import com.javaLecture.PersonInfoRepository;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AddPersonController implements Initializable {

    PersonInfoRepository personInfoRepository;

    @FXML
    TextField tfName;
    @FXML
    TextField tfEmail;
    @FXML
    TextField tfAddress;
    @FXML
    TextField tfAge;

    public AddPersonController() {
        personInfoRepository = new PersonInfoRepository();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Inside initialize method");
    }

    @FXML
    private void savePersonButtonClick() {
        String name = tfName.getText();
        String address = tfAddress.getText();
        String ageStr = tfAge.getText();

        Integer age = Integer.parseInt(ageStr);

        PersonInfo personInfo = new PersonInfo(name, age, address);

        personInfoRepository.savePersonInfo(personInfo);

        tfName.setText("");
        tfAddress.setText("");
        tfAge.setText("");
    }
}
