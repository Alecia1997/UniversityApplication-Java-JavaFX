package za.co.openwindow.university.model;

public class AcademicStaff extends Staff {
    protected int hoursWorked;

    public AcademicStaff(String fullName, int idNumber) {
        super(fullName, idNumber);
        this.hoursWorked = getHoursWorked();


    }


    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
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
