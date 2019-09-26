package ClassLecture1;

public class classLecture extends Person {
    private String name;
    private float hoursWorked;
//    private double hourlyRate;

    public classLecture(String name,float hoursWorked) {
        super(name);
        this.hoursWorked = hoursWorked;
//        this.hourlyRate = hourlyRate;
    }

//    public void calculatePay(){
//        System.out.println(hourlyRate * hoursWorked);
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

//    public double getHourlyRate() {
//        return hourlyRate;
//    }
//
//    public void setHourlyRate(double hourlyRate) {
//        this.hourlyRate = hourlyRate;
//    }
    public String toString(){
        return "employee name is  : " + getName();
    }

}
