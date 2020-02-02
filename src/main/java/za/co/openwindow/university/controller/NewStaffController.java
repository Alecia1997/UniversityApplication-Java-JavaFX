package za.co.openwindow.university.controller;

import javafx.event.Event;
import za.co.openwindow.university.application.AdministrativeSystemState;
import za.co.openwindow.university.model.*;

public class NewStaffController extends EditStaffController  {

    public void done(Event event) {
        super.done(event);
        Staff staff = AdministrativeSystemState.getInstance().getActiveStaff();
        AdministrativeSystemState.getInstance().getStaff().add(staff);
    }

    @Override
    public void refresh() {
        administrativeSystemState.setActiveStaff(new AcademicStaff("", 0));
        administrativeSystemState.setActiveStaff(new AdministrativeStaff("", 0));
        super.refresh();
    }
}
