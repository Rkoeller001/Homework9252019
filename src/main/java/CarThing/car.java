package CarThing;

public class car extends vehicle {

    public car(String check, char start) {
        super(check, start);
    }

    public void doesVehiclerun(){
        if (start == 'n'){
            System.out.println("car would start");

        }else if (start == 'y'){
            System.out.println("car wont start");
        }
    }
}
