package za.co.openwindow.university.controller;


import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;

public class MenuBarController extends SceneController {
   @FXML
    MenuBar menuBar;

   public void initialize() {}

   @FXML
    public void goToHome() {
       sceneSwitcher.switchToScene("Master");
   }

   @FXML
    public void goToSubjects() {
       sceneSwitcher.switchToScene("ViewSubjects");
   }
    @FXML
    public void goToStudents() {
        sceneSwitcher.switchToScene("ViewStudents");
    }
    @FXML
    public void goToStaff() {
        sceneSwitcher.switchToScene("ViewStaff");
    }
}
