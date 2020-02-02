package za.co.openwindow.university.controller;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import za.co.openwindow.university.model.Subject;


public class ViewSubjectsController extends SceneWithMenuController{

    @FXML
    private VBox subjectsVBox;

    public void initialize() {

    }

    @Override
    public void refresh() {
        super.refresh();
        subjectsVBox.getChildren().clear();
        for(Subject subject : administrativeSystemState.getSubjects()) {
            Button subjectButton = new Button(subject.getName());
            subjectButton.setMaxWidth(Double.POSITIVE_INFINITY);
            subjectButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    administrativeSystemState.setActiveSubject(subject);
                    sceneSwitcher.switchToScene("ViewSubjectDetail");
                }
            });
            subjectsVBox.getChildren().add(subjectButton);
        }

    }
    @FXML
    public void switchToNewSubjectScene(Event e) {
        this.sceneSwitcher.switchToScene("NewSubject");
    }


}
