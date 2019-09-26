package homeWork9252019;
//•Dimensions CLASS
//Create the following properties/instance variables as well as getters
//Create a constructor with all the properties
//int width;
//int height;
//int depth;
//Finally Override the toString Method for the Dimensions Class

public class Dimension {
    private int width;
    private int height;
    private int depth;

    public Dimension(int width,int height,int depth){
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Dimension{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}
