package za.co.openwindow.university.controller;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import za.co.openwindow.university.model.Subject;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MasterController extends SceneController {

    @FXML
    private GridPane masterGridPane;
    @FXML
    private ImageView logoImageView;



    @FXML
    public void initialize() {
    }

    @FXML
    public void loadSubject(Event e) {
        FileChooser fileChooser = new FileChooser();
        // Show open (open a file)
        File loadFile = fileChooser.showOpenDialog(sceneSwitcher.getStage());
        if (loadFile != null) {
            try{
                FileInputStream fileInputStream = new FileInputStream(loadFile.getPath());
                ObjectInputStream in = new ObjectInputStream(fileInputStream);
                Subject subject = (Subject) in.readObject();
                administrativeSystemState.getSubjects().add(subject);
                administrativeSystemState.setActiveSubject(subject);
                sceneSwitcher.switchToScene("ViewSubjectDetail");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }

    }



    public void viewSubjects(MouseEvent mouseEvent) {
        this.sceneSwitcher.switchToScene("ViewSubjects");
    }

    public void viewPeople(MouseEvent mouseEvent) {
        this.sceneSwitcher.switchToScene("ViewPeople");
    }

    public void loadPeople(MouseEvent mouseEvent) {
        FileChooser fileChooser = new FileChooser();
        // Show open (open a file)
        File loadFile = fileChooser.showOpenDialog(sceneSwitcher.getStage());
        if (loadFile != null) {
            try{
                FileInputStream fileInputStream = new FileInputStream(loadFile.getPath());
                ObjectInputStream in = new ObjectInputStream(fileInputStream);
                Subject subject = (Subject) in.readObject();
                administrativeSystemState.getSubjects().add(subject);
                administrativeSystemState.setActiveSubject(subject);
                sceneSwitcher.switchToScene("ViewSubjectDetail");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}