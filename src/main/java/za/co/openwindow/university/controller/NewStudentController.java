package za.co.openwindow.university.controller;

import javafx.event.Event;
import za.co.openwindow.university.application.AdministrativeSystemState;
import za.co.openwindow.university.model.DegreeStudent;
import za.co.openwindow.university.model.DiplomaStudent;
import za.co.openwindow.university.model.Student;
import za.co.openwindow.university.model.Subject;

public class NewStudentController extends EditStudentController  {

    public void done(Event event) {
        super.done(event);
        Student student = AdministrativeSystemState.getInstance().getActiveStudent();
        AdministrativeSystemState.getInstance().getStudents().add(student);
    }

    @Override
    public void refresh() {
        administrativeSystemState.setActiveStudent(new DegreeStudent("", 0));
        administrativeSystemState.setActiveStudent(new DiplomaStudent("", 0));
        super.refresh();
    }
}
