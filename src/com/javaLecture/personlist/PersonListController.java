package com.javaLecture.personlist;

import com.javaLecture.PersonInfo;
import com.javaLecture.PersonInfoRepository;
import com.javaLecture.editPerson.EditPersonController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

public class PersonListController implements Initializable {

    PersonInfoRepository repository = new PersonInfoRepository();

    @FXML
    TableView<PersonInfo> tableView;

    @FXML
    TableColumn<PersonInfo, Integer> columnId;
    @FXML
    TableColumn<PersonInfo, String> columnName;
    @FXML
    TableColumn<PersonInfo, Integer> columnAge;
    @FXML
    TableColumn<PersonInfo, String> columnAddress;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        columnId.setCellValueFactory(new PropertyValueFactory<>("id"));
        columnName.setCellValueFactory(new PropertyValueFactory<>("name"));
        columnAge.setCellValueFactory(new PropertyValueFactory<>("age"));
        columnAddress.setCellValueFactory(new PropertyValueFactory<>("address"));

        List<PersonInfo> dataList = repository.getAllPerson();

        tableView.getItems().setAll(dataList);
    }

    @FXML
    private void clickOnDeleteCM() {
        PersonInfo person = tableView.getSelectionModel().getSelectedItem();

        if (person == null) {
            return;
        }

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);

        alert.setTitle("Delete Person Information Confirm Dialogue");
        alert.setHeaderText("Need Your Confirmation");
        alert.setContentText("Are you sure to Delete This Person Information?");

        Optional<ButtonType> result = alert.showAndWait();

        if (result.get() == ButtonType.OK) {
            Integer id = person.getId();
            repository.deletePersonInfoById(id);

            Alert deleteInfoAlert = new Alert(Alert.AlertType.INFORMATION);

            deleteInfoAlert.setTitle("Delete Success");
            deleteInfoAlert.setContentText("Data Deleted successfully !!!");
            deleteInfoAlert.showAndWait();
        }
        else {
            System.out.println("click cancel");
        }

    }

    @FXML
    private void clickOnEditCM() throws IOException {
        PersonInfo person = tableView.getSelectionModel().getSelectedItem();

        if (person == null) {
            return;
        }

        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../editPerson/edit_person.fxml"));

        AnchorPane root = loader.load();
        EditPersonController controller = loader.getController();

        controller.fillEditPersonForm(person);

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.initModality(Modality.APPLICATION_MODAL);
        primaryStage.show();
    }
}
