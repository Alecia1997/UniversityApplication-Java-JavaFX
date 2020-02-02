package za.co.openwindow.university.controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import za.co.openwindow.university.model.Student;
import za.co.openwindow.university.model.Subject;

public class ViewStudentDetailController extends SceneWithMenuController{
    @FXML
    private Label studentNameLabel;
    @FXML
    private Label numSubjectLabel;
    @FXML
    private Label studentIDLabel;

    public void initialize() {}

    @Override
    public void refresh() {
        super.refresh();
        Student activeStudent = administrativeSystemState.getActiveStudent();
        studentNameLabel.setText(((Student) activeStudent).getFullName());
        numSubjectLabel.setText(activeStudent.getSubjectCollection().size() + "");
        studentIDLabel.setText(((Student) activeStudent).getIdNumber() + "");

        menuBarController.setSceneSwitcher(sceneSwitcher);
    }

    @FXML
    public void edit(Event event) {
        sceneSwitcher.switchToScene("EditStudent");
    }
}


