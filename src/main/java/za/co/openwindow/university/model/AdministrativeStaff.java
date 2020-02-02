package za.co.openwindow.university.model;

public class AdministrativeStaff extends Staff {

    public AdministrativeStaff(String fullName, int idNumber) {
        super(fullName, idNumber);



    }


    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public int getSalary() {
        return salary;
    }
}
