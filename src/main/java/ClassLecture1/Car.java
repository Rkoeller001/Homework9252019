package ClassLecture1;

public class Car {
    public String carcColor;


    public Car(String carcColor){
        this.carcColor = carcColor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carcColor='" + carcColor + '\'' +
                '}';
    }
}

