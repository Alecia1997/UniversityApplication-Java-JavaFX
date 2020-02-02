package za.co.openwindow.university.model;

public class DegreeStudent extends Student {

    public DegreeStudent(String fullName, int idNumber) {
        super(fullName, idNumber);
        //subjects.add(new Subject(Subject.INTERACTION, "IDV", "12A", "Alex Skelton", 10, 4,12000 ));
       // subjects.add(new Subject(Subject.COM, "VD", "13B", "Mark VD", 5, 2,3000 ));
    }

    @Override
    public int getCredits() {
        return 180;
    }
}
