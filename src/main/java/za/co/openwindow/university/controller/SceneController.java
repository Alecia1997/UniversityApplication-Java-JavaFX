package za.co.openwindow.university.controller;

import za.co.openwindow.university.application.AdministrativeSystemState;
import za.co.openwindow.university.application.SceneSwitcher;

public class SceneController {

    protected AdministrativeSystemState administrativeSystemState;
    protected SceneSwitcher sceneSwitcher;

    public SceneController() {
        this.administrativeSystemState = AdministrativeSystemState.getInstance();
    }

    public void setSceneSwitcher(SceneSwitcher sceneSwitcher) {
        this.sceneSwitcher = sceneSwitcher;
    }

    public void refresh() {
        // Do nothing by default
    }
}
