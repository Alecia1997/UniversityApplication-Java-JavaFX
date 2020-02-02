/*package za.co.openwindow.university.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class PersonFactory {

    private List<String> students;


    public PersonFactory() {
        students = new LinkedList<String>();
        students.add("DegreeStudent1");
        students.add("DegreeStudent2");
        students.add("DegreeStudent3");
        students.add("DiplomaStudent1");
        students.add("DiplomaStudent2");
    }

    public Person create(String key) {
        Person person;

        switch (key) {

            case "DegreeStudent1":
                person = new DegreeStudent(key);
                break;
            case "DegreeStudent2":
                person = new DegreeStudent(key);
                break;
            case "DegreeStudent3":
                person = new DegreeStudent(key);
                break;
            case "DiplomaStudent1":
                person = new DiplomaStudent(key);
                break;
            default:
                person = null;
        }
        return person;
    }
    public Person createRandom() {
        Random random = new Random();
        int index = random.nextInt(students.size());
        String key = students.get(index);
        return create(key);
    }


}
*/