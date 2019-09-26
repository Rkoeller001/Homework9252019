package homeWork9252019;
//•Resolution CLASS
//Create a Resolution class with these two properties width and height.
//int width;
//int height;
//Also create a constructor with the two properties as well as getters
//Finally Override the toString Method for the Resolution Class

import java.util.Random;

public class Resolution {
    private int width;
    private  int height;

    public Resolution(int width,int height){
        this.height = height;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Resolution{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
