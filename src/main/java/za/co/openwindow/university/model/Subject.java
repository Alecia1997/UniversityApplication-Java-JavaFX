package za.co.openwindow.university.model;

import za.co.openwindow.university.application.FullCollectionException;

import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Subject implements Serializable {

    private LinkedList<Person> person;

 public static final int INTERACTION = 0;
 public static final int PHOTOGRAPHY = 1;
 public static final int COM = 2;
 public static final int ILLUSTRATION = 3;
 public static final int MOTION = 4;


 private int type;
 private String name;
 private String code;
 private String lecturer;
 private int credits;
 private int hoursPerWeek;
 private int pricePerMonth;
 private List<Person> studentCollection;

 public Subject(int type,String name, String code, String lecturer, int credits, int hoursPerWeek, int pricePerMonth) {
     this.type = type;
     this.name = name;
     this.code = code;
     this.lecturer = lecturer;
     this.credits = credits;
     this.hoursPerWeek = hoursPerWeek;
     this.pricePerMonth = pricePerMonth;
     studentCollection = new LinkedList<Person>();

/*
     // A list of 3 Students
     person = new LinkedList<Person>();
     person.add(new DegreeStudent("Alecia Vermeulen", 1234223));
     person.add(new DiplomaStudent("Bianca Vermeulen", 65336833));
     person.add(new DiplomaStudent("Elmariese Vermeulen", 767363873));
*/
 }

 //Getters and Setters go here
     public void setType(int type) {
         this.type = type;

     }
     public int getType() {

         return type;
     }
    public void setName(String name) {
        this.name = name;

    }
    public String getName() {

        return name;
    }

    public void setCode(String code) {
        this.code = code;

    }

    public String getCode() {

        return code;
    }
    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;

    }

    public String getLecturer() {

        return lecturer;
    }
    public void setCredits(int credits) {
        this.credits = credits;

    }

    public int getCredits() {

        return credits;
    }
    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;

    }

    public int getHoursPerWeek() {

        return hoursPerWeek;
    }
    public void setPricePerMonth(int pricePerMonth) {
        this.pricePerMonth = pricePerMonth;

    }

    public int getPricePerMonth() {

        return pricePerMonth;
    }

    public List<Person> getStudentCollection() {
        return Collections.unmodifiableList(studentCollection);
    }
    public void removeStudent(Person person) {
        studentCollection.remove(person);
    }
    public void addStudent(Person person) throws FullCollectionException {
        if (studentCollection.size() < 5) {
            studentCollection.add(person);
        } else {
            throw new FullCollectionException();
        }
    }

    }






