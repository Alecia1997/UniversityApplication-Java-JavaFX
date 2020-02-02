package za.co.openwindow.university.model;

import za.co.openwindow.university.application.FullCollectionException;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public abstract class Staff extends Person {


    protected int salary;
    protected LinkedList<Subject> subjectCollection;



    public Staff(String fullName, int idNumber) {
        super(fullName, idNumber);
        this.salary = getSalary();
        subjectCollection = new LinkedList<Subject>();


    }
    //Shared methods go here
    public List<Subject> getSubjectCollection() {
        return Collections.unmodifiableList(subjectCollection);
    }
    public void removeSubject(Subject subject) {
        subjectCollection.remove(subject);
    }
    public void addSubject(Subject subject) throws FullCollectionException {
        if (subjectCollection.size() < 3) {
            subjectCollection.add(subject);
        } else {
            throw new FullCollectionException();
        }
    }
    //Protected methods go here

    //Abstract methods go here


    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
