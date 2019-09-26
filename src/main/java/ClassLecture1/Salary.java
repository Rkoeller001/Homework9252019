package ClassLecture1;

import java.time.LocalDate;

public class Salary extends classLecture {
    public double yearlySalary;
    public LocalDate hireDate;
    public Personallity personallity;
    public Car car;

    public Salary(String name, float hoursWorked, double yearlySalary, LocalDate hireDate, Personallity personallity,Car car) {
        super(name, hoursWorked);
        this.yearlySalary = yearlySalary;
        this.hireDate = hireDate;
        this.personallity = personallity;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "yearlySalary=" + yearlySalary +
                ", hireDate=" + hireDate +
                ", personallity=" + personallity +
                ", car=" + car +
                '}';
    }
}
