package za.co.openwindow.university.controller;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import za.co.openwindow.university.model.Staff;
import za.co.openwindow.university.model.Student;


public class ViewStaffController extends SceneWithMenuController {
    @FXML
    private VBox staffVBox;

    public void initialize() {

    }

    @Override
    public void refresh() {
        super.refresh();
        staffVBox.getChildren().clear();
        for(Staff staff : administrativeSystemState.getStaff()) {
            Button staffButton = new Button(staff.getFullName());
            staffButton.setMaxWidth(Double.POSITIVE_INFINITY);
            staffButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    administrativeSystemState.setActiveStaff(staff);
                    sceneSwitcher.switchToScene("ViewStaffDetail");
                }
            });
            staffVBox.getChildren().add(staffButton);
        }

    }
    @FXML
    public void switchToNewStaffScene(Event e) {
        this.sceneSwitcher.switchToScene("NewStaff");
    }
}
