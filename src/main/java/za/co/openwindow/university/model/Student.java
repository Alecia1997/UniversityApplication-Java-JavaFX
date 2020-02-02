package za.co.openwindow.university.model;

import za.co.openwindow.university.application.FullCollectionException;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public  abstract class Student extends Person{

    protected int payFees;
    protected int maxCredits;
    protected int credits;
    protected LinkedList<Subject> subjectCollection;

    public Student(String fullName, int idNumber) {
        super(fullName, idNumber);
        this.payFees = getPayFees();
        this.credits = getCredits();
        subjectCollection = new LinkedList<Subject>();


    }

    //Shared methods go here
    public void setPayFees() {
        // Price of all registered subjects for this student together
    }
    public int getPayFees() {
        // End of month students pay their fees
        return payFees;
    }


    public List<Subject> getSubjectCollection() {
        return Collections.unmodifiableList(subjectCollection);
    }
    public void removeSubject(Subject subject) {
        subjectCollection.remove(subject);
    }
    public void addSubject(Subject subject) throws FullCollectionException {
        if (subjectCollection.size() < 5) {
            subjectCollection.add(subject);
        } else {
            throw new FullCollectionException();
        }
    }
    //Protected methods go here


    //Abstract methods go here
    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }
}
