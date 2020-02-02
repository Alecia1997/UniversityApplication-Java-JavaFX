package za.co.openwindow.university.application;

import javafx.scene.Scene;
import javafx.stage.Stage;
import za.co.openwindow.university.controller.SceneController;

import java.util.HashMap;

public class SceneSwitcher {

    private Stage primaryStage;
    private HashMap<String, Scene> scenes;
    private HashMap<String, SceneController> controllers;

    public SceneSwitcher(Stage stage) {
        primaryStage = stage;
        scenes = new HashMap<String, Scene>();
        controllers = new HashMap<String, SceneController>();
    }

    public void addScene(String name, Scene scene) {
        scenes.put(name, scene);
    }
    public void addController(String name, SceneController controller) {
        controllers.put(name, controller);
    }
    public Stage getStage() {
        return primaryStage;
    }
    public void switchToScene(String name) {
        primaryStage.setScene(scenes.get(name));
        controllers.get(name).refresh();
    }
}
