package za.co.openwindow.university.controller;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import za.co.openwindow.university.application.FullCollectionException;
import za.co.openwindow.university.model.*;

import java.util.LinkedList;
import java.util.Random;

public class EditStudentController extends SceneWithMenuController  {
    @FXML
    private TextField subjectTextField;
    @FXML
    private TextField subjectTextField3;
    @FXML
    private VBox collectionVBox;
    @FXML
    private Button addSubjectButton;
    @FXML
    private Button doneButton;

    public void initialize() {}

    @Override
    public void refresh() {
        super.refresh();
        Student student = administrativeSystemState.getActiveStudent();
        subjectTextField.setText(((Student) student).getFullName());
        subjectTextField3.setText(student.getIdNumber() + "");
        collectionVBox.getChildren().clear();
        for (Subject subject : student.getSubjectCollection()) {
            Label labelFullName = new Label(subject.getName());
            labelFullName.setPrefWidth(400);
            Button releaseButton = new Button("De-register");
            releaseButton.setPrefWidth(100);
            releaseButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    student.removeSubject(subject);
                    refresh();
                }
            });
            HBox personBox = new HBox();
            personBox.getChildren().add(labelFullName);
            personBox.getChildren().add(releaseButton);

            collectionVBox.getChildren().addAll(personBox);
        }

    }
    public void addSubjectToCollection(Event event) {
        administrativeSystemState.getActiveStudent().setFullName(subjectTextField.getText());
        LinkedList<String> subjects = new LinkedList<String>();
        subjects.add("Subject1");
        subjects.add("Subject2");
        subjects.add("Subject3");
        subjects.add("Subject4");
        subjects.add("Subject5");
        Random random = new Random();
        int index = random.nextInt(subjects.size());
        Subject subject = null;
        switch (subjects.get(index)) {
            case "Subject1":
                subject = new Subject(Subject.INTERACTION,"IDV", "A1", "Alex Skelton", 10, 4,12000 );
                break;
            case "Subject3":
                subject = new Subject(Subject.INTERACTION,"Android Studio", "A3", "Mike Maynard", 5, 2,3000 );
                break;
            case "Subject4":
                subject = new Subject(Subject.COM,"Visual Discourse", "A4", "Mark Kirby-Hirst", 5, 2,3000);
                break;
            case "Subject5":
                subject = new Subject(Subject.INTERACTION,"IDX Theory", "A2", "Alex Skelton", 5, 1,3000 );
                break;
            //etc
        }
        // etc
        try {
            administrativeSystemState.getActiveStudent().addSubject(subject);
            refresh();
        } catch (FullCollectionException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }

    }
    public void done(Event event) {
        administrativeSystemState.getActiveStudent().setFullName(subjectTextField.getText());
        administrativeSystemState.getActiveStudent().setIdNumber(Integer.valueOf(subjectTextField3.getText()));
        sceneSwitcher.switchToScene("ViewStudentDetail");
    }
}
