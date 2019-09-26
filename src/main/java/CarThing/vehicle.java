package CarThing;

import ClassLecture1.Salary;

public class vehicle {
    private String check;
    protected char start;


    public vehicle(String check,char start){
        this.check = check;
        this.start = start;
    }

    public char getStart() {
        return start;
    }

    public void setStart(char start) {
        this.start = start;
    }

    public void doesVehiclerun(){
        if (start == 'n'){
            System.out.println("car would start");

        }else if (start == 'y'){
            System.out.println("car wont start");
        }
    }

    @Override
    public String toString() {
        return "vehicle{" +
                "check='" + check + '\'' +
                ", start=" + start +
                '}';
    }
}
