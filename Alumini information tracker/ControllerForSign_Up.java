package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class ControllerForSign_Up {

  @FXML
  private TextField full_name;

  @FXML
  private TextField major;

  @FXML
  private TextField present_address;

  @FXML
  private TextField permanant_address;

  @FXML
  private DatePicker date;

  @FXML
  private ComboBox<String> genderComboBox;

  @FXML
  private Button save;

  @FXML
  private Button clear;

  @FXML
  private TextField id;

  @FXML
  private TextField number;

  @FXML
  private RadioButton RadioJobstatus1;

  @FXML
  private RadioButton RadioJobstatus2;

  @FXML
  private RadioButton RadioJobstatus3;

  @FXML
  private Button back;

  @FXML
  void handleEventAction_Back(ActionEvent event) {

  }

  @FXML
  void handleEventAction_Clear(ActionEvent event) {

  }

  @FXML
  void handleEventAction_Save(ActionEvent event) {

  }

  @FXML
  public void initialize(){
    ArrayList<String> genders = new ArrayList<>();
    genders.add("Male");
    genders.add("Female");
    genders.add("Others");
    ObservableList<String> genderlist = FXCollections.observableArrayList(genders);
    this.genderComboBox.setItems(genderlist);
  }

}