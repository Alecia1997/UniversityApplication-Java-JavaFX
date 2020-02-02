package za.co.openwindow.university.model;


import java.io.Serializable;

public  abstract class Person implements Serializable {

    protected String fullName;
    protected int idNumber;
    // Each person can either be assigned a subject to teach or attend

    public Person(String fullName, int idNumber) {
        this.fullName = fullName;
        this.idNumber = idNumber;

    }

    //Shared methods go here
    public void setFullName(String fullName) {
        this.fullName = fullName;

    }

    public String getFullName() {

        return fullName;
    }


    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }


    //Protected methods go here
    //Abstract methods go here


}
