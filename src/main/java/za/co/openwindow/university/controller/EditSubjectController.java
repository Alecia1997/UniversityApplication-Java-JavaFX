package za.co.openwindow.university.controller;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import za.co.openwindow.university.application.FullCollectionException;
import za.co.openwindow.university.model.DegreeStudent;
import za.co.openwindow.university.model.DiplomaStudent;
import za.co.openwindow.university.model.Person;
import za.co.openwindow.university.model.Subject;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class EditSubjectController extends SceneWithMenuController {

    @FXML
    private TextField subjectTextField;
    @FXML
    private TextField subjectTextField2;
    @FXML
    private TextField subjectTextField3;
    @FXML
    private TextField subjectTextField4;
    @FXML
    private TextField subjectTextField5;
    @FXML
    private TextField subjectTextField6;
    @FXML
    private VBox collectionVBox;
    @FXML
    private Button addStudentTestingButton;
    @FXML
    private Button addStudentButton;
    @FXML
    private Button saveSubjectButton;
    @FXML
    private Button doneButton;

    public void initialize() {}

    @Override
    public void refresh() {
        super.refresh();
        Subject subject = administrativeSystemState.getActiveSubject();
        subjectTextField.setText(subject.getName());
        subjectTextField2.setText(subject.getCode());
        subjectTextField3.setText(subject.getLecturer());
        subjectTextField4.setText(subject.getCredits() + "");
        subjectTextField5.setText(subject.getHoursPerWeek() + "");
        subjectTextField6.setText(subject.getPricePerMonth() + "");
        collectionVBox.getChildren().clear();
        for (Person person : subject.getStudentCollection()) {
            Label labelFullName = new Label(person.getFullName());
            labelFullName.setPrefWidth(400);
            Label labelIdNumber = new Label(person.getIdNumber() + "");
            labelIdNumber.setPrefWidth(400);
            Button releaseButton = new Button("De-register");
            releaseButton.setPrefWidth(100);
            releaseButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    subject.removeStudent(person);
                    refresh();
                }
            });
            HBox personBox = new HBox();
            personBox.getChildren().add(labelFullName);
            personBox.getChildren().add(labelIdNumber);
            personBox.getChildren().add(releaseButton);

            collectionVBox.getChildren().addAll(personBox);
        }







    }
public void seeStudentCollection (Event event) {
Alert dg = new Alert(Alert.AlertType.CONFIRMATION);
dg.setTitle("Register student for subject");
dg.setContentText("List of students");
dg.show();

}
    public void addStudentToCollection(Event event) {
        administrativeSystemState.getActiveSubject().setName(subjectTextField.getText());
        LinkedList<String> students = new LinkedList<String>();
        students.add("DegreeStudent1");
        students.add("DegreeStudent2");
        students.add("DegreeStudent3");
        students.add("DiplomaStudent1");
        students.add("DiplomaStudent2");
        Random random = new Random();
        int index = random.nextInt(students.size());
        Person person = null;
        switch (students.get(index)) {
            case "DegreeStudent1":
                person = new DegreeStudent("Bianca Vermeulen", 1671672);
                break;
            case "DiplomaStudent1":
                person = new DiplomaStudent("Elmariese Vermeulen", 38378373);
                break;
            case "DiplomaStudent2":
                person = new DiplomaStudent("Charles Vermeulen", 38378373);
                break;
            case "DegreeStudent2":
                person = new DiplomaStudent("Elsie Vermeulen", 38378373);
                break;
            case "DegreeStudent3":
                person = new DiplomaStudent("Hakuna Matata", 38378373);
                break;
            //etc
        }
        // etc
        try {
            administrativeSystemState.getActiveSubject().addStudent(person);
            refresh();
        } catch (FullCollectionException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }

    }

    public void done(Event event) {
        administrativeSystemState.getActiveSubject().setName(subjectTextField.getText());
        administrativeSystemState.getActiveSubject().setCode(subjectTextField2.getText());
        administrativeSystemState.getActiveSubject().setLecturer(subjectTextField3.getText());
        administrativeSystemState.getActiveSubject().setCredits(Integer.valueOf(subjectTextField4.getText()));
        administrativeSystemState.getActiveSubject().setHoursPerWeek(Integer.valueOf(subjectTextField5.getText()));
        administrativeSystemState.getActiveSubject().setPricePerMonth(Integer.valueOf(subjectTextField6.getText()));

        sceneSwitcher.switchToScene("ViewSubjectDetail");
    }
    public void saveSubject(Event event) {

        //Save changes to object
        administrativeSystemState.getActiveSubject().setName(subjectTextField.getText());

        //save object to disk
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialFileName( administrativeSystemState.getActiveSubject().getName());
        File saveFile = fileChooser.showSaveDialog(sceneSwitcher.getStage());

        if(saveFile != null) {
            try{
                FileOutputStream fileOutputStream = new FileOutputStream(saveFile.getPath());
                ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
                out.writeObject(administrativeSystemState.getActiveSubject());
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }

    }

}
