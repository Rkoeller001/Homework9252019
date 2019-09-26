package homeWork9252019;
//•Case CLASS
//Create the following private properties/ivars as well as getters
//   String model;
//   String manufacturer;
//   String powerSupply;
//   Dimensions dimensions;
//
//Create a pressPowerButton() method that returns nothing but prints out the text "Power Button Pressed"
//
//Finally Override the toString Method for the Case Class

import java.awt.*;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimension dimension;

    public Case(String model,String manufacturer,String powerSupply,Dimension dimension){
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }

    private String getModel() {
        return model;
    }

    private String getManufacturer() {
        return manufacturer;
    }

    private String getPowerSupply() {
        return powerSupply;
    }

    private Dimension getDimension() {
        return dimension;
    }

    public void pressPowerButton(){
        System.out.println("Power Button Pressed");
    }

    @Override
    public String toString() {
        return "Case{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                ", dimension=" + dimension +
                '}';
    }
}
