package homeWork9252019;
//•Monitor CLASS
//Create a Monitor class with the following private properties as well as getters
//
//model
//manufacturer
//size
//nativeResolution
//Use all the properties in the constructor
//create only public getters for all the properties
//Create a void drawPixelAt(int x, int y, String color) with the following parameters and simply printing out "Drawing pixel at " + x + "," + y + " " + " in color " + color. (use this code)
//Finally Override the toString Method for the Monitor Class
public class Monitor  {
    private String model;
    private  String manufacturer;
    private String size;
    private String nativeResolution;

    public Monitor(String model, String manufacturer,String nativeResolution,String size){
        this.manufacturer = manufacturer;
        this.model = model;
        this.nativeResolution = nativeResolution;
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getNativeResolution() {
        return nativeResolution;
    }
    public void drawPixelAt(int x,int y,String color){
        System.out.println("Drawing pixel at " + x + "," + y + " " + " in color " + color);


    }

    @Override
    public String toString() {
        return "Monitor{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", size='" + size + '\'' +
                ", nativeResolution='" + nativeResolution + '\'' +
                '}';
    }
}
