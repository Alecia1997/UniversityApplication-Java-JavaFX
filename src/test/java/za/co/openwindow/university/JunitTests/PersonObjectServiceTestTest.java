package za.co.openwindow.university.JunitTests;

import org.junit.Assert;
import org.junit.Test;
import za.co.openwindow.university.model.AcademicStaff;
import za.co.openwindow.university.model.DegreeStudent;
import za.co.openwindow.university.model.Person;

import static org.junit.Assert.*;


public class PersonObjectServiceTestTest {

    public void shouldCreateStudentPersonAndReturnNameAndID() {
        String fullName = "Bianca Vermeulen";
        int idNumber = 123322;
        Person person = new DegreeStudent(fullName, idNumber);

        Assert.assertTrue(person.getFullName().equals(fullName));
    }
    public void shouldCreateStaffPersonAndReturnNameAndID() {
        String fullName = "Michael Chameson";
        int idNumber = 6474833;
        Person person = new AcademicStaff(fullName, idNumber);

        Assert.assertTrue(person.getFullName().equals(fullName));
    }

}