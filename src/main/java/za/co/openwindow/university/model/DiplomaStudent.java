package za.co.openwindow.university.model;

public class DiplomaStudent extends Student {

    public DiplomaStudent(String fullName, int idNumber) {
        super(fullName, idNumber);
      //  subjects.add(new Subject(Subject.PHOTOGRAPHY, "Production editing", "12A", "Urina Photo", 10, 4,12000 ))
        // subjects.add(new Subject(Subject.PHOTOGRAPHY, "Lightroom Production", "13B", "Urina Photo", 5, 2,3000 ));
    }

    @Override
    public int getCredits() {
        return 60;
    }

}
