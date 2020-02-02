package za.co.openwindow.university.application;

import za.co.openwindow.university.model.Staff;
import za.co.openwindow.university.model.Student;
import za.co.openwindow.university.model.Subject;

import java.util.LinkedList;
import java.util.List;

public class AdministrativeSystemState {

    private static AdministrativeSystemState instance = new AdministrativeSystemState();

    private Subject activeSubject;
    private List<Subject> subjects;
    private Student activeStudent;
    private List<Student> students;
    private Staff activeStaff;
    private List<Staff> staff;



    public AdministrativeSystemState() {
        subjects = new LinkedList<Subject>();
        students = new LinkedList<Student>();
        staff = new LinkedList<Staff>();
    }
    //instance for students
    public List<Student> getStudents() {
        return students;
    }
    public Student getActiveStudent() {
        return activeStudent;
    }

    public void setActiveStudent(Student activeStudent){
        this.activeStudent = activeStudent;
    }
    //instance for staff
    public List<Staff> getStaff() {
        return staff;
    }
    public Staff getActiveStaff() {
        return activeStaff;
    }

    public void setActiveStaff (Staff activeStaff) {
        this.activeStaff = activeStaff;
    }
    //instance for subjects
    public List<Subject> getSubjects() {
        return subjects;
    }

    public Subject getActiveSubject() {
        return activeSubject;
    }

    public void setActiveSubject(Subject activeSubject){
        this.activeSubject = activeSubject;
    }
    public static AdministrativeSystemState getInstance() {
        return instance;
    }
}
