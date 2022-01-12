package com.javaLecture.editPerson;

import com.javaLecture.PersonInfo;
import com.javaLecture.PersonInfoRepository;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class EditPersonController implements Initializable {

    PersonInfoRepository personInfoRepository;

    @FXML
    TextField tfId;
    @FXML
    TextField tfName;
    @FXML
    TextField tfEmail;
    @FXML
    TextField tfAddress;
    @FXML
    TextField tfAge;

    public EditPersonController() {
        personInfoRepository = new PersonInfoRepository();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    @FXML
    private void savePersonButtonClick() {
        String idstr = tfId.getText();
        String name = tfName.getText();
        String address = tfAddress.getText();
        String ageStr = tfAge.getText();

        Integer id = Integer.parseInt(idstr);
        Integer age = Integer.parseInt(ageStr);

        PersonInfo personInfo = new PersonInfo(id, name, age, address);

        personInfoRepository.updatePersonInfo(personInfo);

        tfName.setText("");
        tfAddress.setText("");
        tfAge.setText("");
    }

    public void fillEditPersonForm(PersonInfo person) {
        tfId.setText(person.getId().toString());
        tfName.setText(person.getName());
        tfAddress.setText(person.getAddress());
        tfAge.setText(person.getAge().toString());
    }
}
