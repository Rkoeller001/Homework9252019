package homeWork9252019;
//•MotherBoard CLASS
//Create private ivars
// private String model;
//    String manufacturer;
//    int ramSlots;
//     int cardSlots;
//    String bios;
//Create a constructor with all properties/ivars then create getters for them
//Create a loadProgram method that returns nothing and accepts a programName parameter /argument and simply prints out the string programName is now running by using the programName argument passed to it
//Finally Override the toString Method for the MotherBoard Class

public class Motherboard {
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String manufacturer,int ramSlots,int cardSlots,String bios){
        this.bios = bios;
        this.cardSlots = cardSlots;
        this.ramSlots = ramSlots;
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
    public void loadProgram(String programNam){
        System.out.println(programNam + " is now running ");

    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "manufacturer='" + manufacturer + '\'' +
                ", ramSlots=" + ramSlots +
                ", cardSlots=" + cardSlots +
                ", bios='" + bios + '\'' +
                '}';
    }
}
