package ClassLecture1;

public class Personallity {
    public String thinktype;
    public String color;

    public Personallity(String thinktype, String color){
        this.thinktype = thinktype;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Personallity{" +
                "thinktype='" + thinktype + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
