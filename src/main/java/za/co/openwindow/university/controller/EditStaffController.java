package za.co.openwindow.university.controller;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import za.co.openwindow.university.model.Person;
import za.co.openwindow.university.model.Staff;
import za.co.openwindow.university.model.Student;
import za.co.openwindow.university.model.Subject;

public class EditStaffController extends SceneWithMenuController  {
    @FXML
    private TextField subjectTextField;
    @FXML
    private TextField subjectTextField3;
    @FXML
    private Button doneButton;

    public void initialize() {}

    @Override
    public void refresh() {
        super.refresh();
        Staff staff = administrativeSystemState.getActiveStaff();
        subjectTextField.setText(((Staff) staff).getFullName());
        subjectTextField3.setText(staff.getIdNumber() + "");

    }
    public void done(Event event) {
        administrativeSystemState.getActiveStaff().setFullName(subjectTextField.getText());
        administrativeSystemState.getActiveStaff().setIdNumber(Integer.valueOf(subjectTextField3.getText()));
        sceneSwitcher.switchToScene("ViewStaffDetail");
    }
}
