package za.co.openwindow.university.controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import za.co.openwindow.university.model.Subject;

public class ViewSubjectDetailController extends SceneWithMenuController {

    @FXML
    private Label subjectNameLabel;
    @FXML
    private Label numStudentLabel;
    @FXML
    private Label subjectCodeLabel;
    @FXML
    private Label subjectLecturerLabel;
    @FXML
    private Label subjectCreditsLabel;
    @FXML
    private Label subjectHoursLabel;
    @FXML
    private Label subjectPriceLabel;
    @FXML
    private TextField subjectTextField;

    public void initialize() {}

    @Override
    public void refresh() {
        super.refresh();
        Subject activeSubject = administrativeSystemState.getActiveSubject();
        subjectNameLabel.setText(activeSubject.getName());
        numStudentLabel.setText(activeSubject.getStudentCollection().size() + "");
        subjectCodeLabel.setText(activeSubject.getCode());
        subjectLecturerLabel.setText(activeSubject.getLecturer());
        subjectCreditsLabel.setText(activeSubject.getCredits() + "");
        subjectHoursLabel.setText(activeSubject.getHoursPerWeek() + "");
        subjectPriceLabel.setText(activeSubject.getPricePerMonth() + "");
        menuBarController.setSceneSwitcher(sceneSwitcher);
    }

    @FXML
    public void edit(Event event) {
        sceneSwitcher.switchToScene("EditSubject");
    }


}
