package za.co.openwindow.university.controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import za.co.openwindow.university.model.Staff;
import za.co.openwindow.university.model.Student;
import za.co.openwindow.university.model.Subject;

public class ViewStaffDetailController extends SceneWithMenuController{
    @FXML
    private Label staffNameLabel;
    @FXML
    private Label numSubjectLabel;
    @FXML
    private Label staffIDLabel;

    public void initialize() {}

    @Override
    public void refresh() {
        super.refresh();
        Staff activeStaff = administrativeSystemState.getActiveStaff();
        staffNameLabel.setText(((Staff) activeStaff).getFullName());
        numSubjectLabel.setText(activeStaff.getSubjectCollection().size() + "");
        staffIDLabel.setText(((Staff) activeStaff).getIdNumber() + "");

        menuBarController.setSceneSwitcher(sceneSwitcher);
    }

    @FXML
    public void edit(Event event) {
        sceneSwitcher.switchToScene("EditStaff");
    }
}


