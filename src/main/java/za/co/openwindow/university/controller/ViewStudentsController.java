package za.co.openwindow.university.controller;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import za.co.openwindow.university.model.Student;


public class ViewStudentsController extends SceneWithMenuController {
    @FXML
    private VBox studentsVBox;

    public void initialize() {

    }

    @Override
    public void refresh() {
        super.refresh();
        studentsVBox.getChildren().clear();
        for(Student student : administrativeSystemState.getStudents()) {
            Button studentButton = new Button(student.getFullName());
            studentButton.setMaxWidth(Double.POSITIVE_INFINITY);
            studentButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    administrativeSystemState.setActiveStudent(student);
                    sceneSwitcher.switchToScene("ViewStudentDetail");
                }
            });
            studentsVBox.getChildren().add(studentButton);
        }

    }
    @FXML
    public void switchToNewStudentScene(Event e) {
        this.sceneSwitcher.switchToScene("NewStudent");
    }


}

