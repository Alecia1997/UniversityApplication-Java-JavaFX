package za.co.openwindow.university.controller;

import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;

public class SceneWithMenuController  extends SceneController {

    @FXML
    protected MenuBar menuBar;
    @FXML
    protected MenuBarController menuBarController;

    public void refresh() {
        super.refresh();
        menuBarController.setSceneSwitcher(sceneSwitcher);
    }
}
