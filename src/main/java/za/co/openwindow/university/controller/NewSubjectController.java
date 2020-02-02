package za.co.openwindow.university.controller;

import javafx.event.Event;
import za.co.openwindow.university.application.AdministrativeSystemState;
import za.co.openwindow.university.model.Subject;

public class NewSubjectController extends EditSubjectController {


    public void done(Event event) {
        super.done(event);
        Subject subject = AdministrativeSystemState.getInstance().getActiveSubject();
        AdministrativeSystemState.getInstance().getSubjects().add(subject);
    }

    @Override
    public void refresh() {
        administrativeSystemState.setActiveSubject(new Subject(0,"", "", "",0 , 0, 0));
        super.refresh();
    }

}