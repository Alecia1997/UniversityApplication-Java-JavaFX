package za.co.openwindow.university.controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class ViewPeopleController extends SceneController {


    @FXML
    public void initialize() {
    }


    @FXML
    public void switchToViewStudentsScene(Event e) {
        this.sceneSwitcher.switchToScene("ViewStudents");
    }
    @FXML
    public void switchToViewStaffScene(Event e) {
        this.sceneSwitcher.switchToScene("ViewStaff");
    }




}