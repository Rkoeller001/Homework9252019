package CarThing;

public class vehicleTest {
    public static void main(String[] args) {
//        vehicle truck = new vehicle("engine",'n');
        vehicle bus = new vehicle("engine",'y');
        System.out.println(bus);
        bus.doesVehiclerun();
        bus.setStart(' ');
        System.out.println(bus.getStart());
        bus.doesVehiclerun();


    }
}
