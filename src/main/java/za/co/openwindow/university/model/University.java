package za.co.openwindow.university.model;

import java.util.LinkedList;

public class University {

    private String universityName;
    private int poolOfFunds;
    private LinkedList<Person> person;
    private LinkedList<Subject> subject;


    public University() {
        this.universityName = "Uncommon Creative";
        this.poolOfFunds = 100000;

        // A list of 6 people
        person = new LinkedList<Person>();
        person.add(new DegreeStudent("Alecia Vermeulen", 1234223));
        person.add(new DiplomaStudent("Bianca Vermeulen", 65336833));


        // A list of 6 subjects
        subject = new LinkedList<Subject>();
        subject.add(new Subject(Subject.INTERACTION, "IDV300","14C", "Alex Skelton", 10, 4, 12000 ));
        subject.add(new Subject(Subject.INTERACTION, "IDX Theory","15C", "Carly Wittaker", 10, 4, 12000 ));

    }






}
