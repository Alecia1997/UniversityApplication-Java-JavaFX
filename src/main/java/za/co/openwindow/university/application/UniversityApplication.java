package za.co.openwindow.university.application;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import za.co.openwindow.university.controller.SceneController;
import za.co.openwindow.university.model.*;

import java.io.IOException;

public class UniversityApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        SceneSwitcher sceneSwitcher = new SceneSwitcher(primaryStage);

        FXMLLoader loader = new FXMLLoader();
        loadSceneFromFile("Master", sceneSwitcher);
        loadSceneFromFile("ViewSubjects", sceneSwitcher);
        loadSceneFromFile("ViewSubjectDetail", sceneSwitcher);
        loadSceneFromFile("ViewPeople", sceneSwitcher);
        loadSceneFromFile("ViewStudents", sceneSwitcher);
        loadSceneFromFile("ViewStudentDetail", sceneSwitcher);
        loadSceneFromFile("ViewStaff", sceneSwitcher);
        loadSceneFromFile("ViewStaffDetail", sceneSwitcher);
        loadSceneFromFile("EditSubject", sceneSwitcher);
        loadSceneFromFile("NewSubject", sceneSwitcher);
        loadSceneFromFile("EditStudent", sceneSwitcher);
        loadSceneFromFile("NewStudent", sceneSwitcher);
        loadSceneFromFile("EditStaff", sceneSwitcher);
        loadSceneFromFile("NewStaff", sceneSwitcher);


        Subject InteractionIDV = new Subject(Subject.INTERACTION,"IDV", "A1", "Alex Skelton", 10, 4,12000 );
        InteractionIDV.addStudent(new DegreeStudent("Alecia Vermeulen", 1234555666));
        AdministrativeSystemState.getInstance().getSubjects().add(InteractionIDV);
        AdministrativeSystemState.getInstance().getSubjects().add(new Subject(Subject.INTERACTION,"IDX Theory", "A2", "Alex Skelton", 5, 1,3000));
        AdministrativeSystemState.getInstance().getSubjects().add(new Subject(Subject.INTERACTION,"Android Studio", "A3", "Mike Maynard", 5, 2,3000));
        AdministrativeSystemState.getInstance().getSubjects().add(new Subject(Subject.COM,"Visual Discourse", "A4", "Mark Kirby-Hirst", 5, 2,3000));

        Student StudentOne = new DegreeStudent("Tiffany Van de Merwe", 1681681);
        StudentOne.addSubject(new Subject(Subject.INTERACTION,"IDV", "A1", "Alex Skelton", 10, 4,12000));
        AdministrativeSystemState.getInstance().getStudents().add(StudentOne);

        Student StudentTwo = new DegreeStudent("Chirsty-Anne Venter", 38383);
        StudentTwo.addSubject(new Subject(Subject.INTERACTION,"IDV", "A1", "Alex Skelton", 10, 4,12000));
        StudentTwo.addSubject(new Subject(Subject.INTERACTION,"Android Studio", "A3", "Mike Maynard", 5, 2,3000));;
        AdministrativeSystemState.getInstance().getStudents().add(StudentTwo);
        Student StudentThree = new DegreeStudent("Gabby Scott", 6863);
        AdministrativeSystemState.getInstance().getStudents().add(StudentThree);
        Student StudentFour = new DegreeStudent("Zantelle Erasmus", 63833);
        AdministrativeSystemState.getInstance().getStudents().add(StudentFour);

        Staff StaffOne = new AcademicStaff("Alex Skelton", 1681681);
        StaffOne.addSubject(new Subject(Subject.INTERACTION,"IDV", "A1", "Alex Skelton", 10, 4,12000));
        AdministrativeSystemState.getInstance().getStaff().add(StaffOne);
        Staff StaffTWo = new AcademicStaff("Carly Wittaker", 73873);
        AdministrativeSystemState.getInstance().getStaff().add(StaffTWo);
        Staff StaffThree = new AcademicStaff("Mark kirby-hirst", 73873);
        AdministrativeSystemState.getInstance().getStaff().add(StaffThree);

        sceneSwitcher.switchToScene("Master");
        primaryStage.setTitle("University");
        primaryStage.show();

    }

    private void loadSceneFromFile(String name, SceneSwitcher sceneSwitcher) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/"));
        Parent root = loader.load(getClass().getResourceAsStream("/fxml/" + name + ".fxml"));
        SceneController controller = loader.getController();
        controller.setSceneSwitcher(sceneSwitcher);
        Scene scene = new Scene(root, 600, 700);
        sceneSwitcher.addScene(name, scene);
        sceneSwitcher.addController(name, controller);
    }



}

