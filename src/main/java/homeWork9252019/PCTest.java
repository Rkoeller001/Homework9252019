package homeWork9252019;
//MAIN
//=======================================================
//Create an instance of dimensions, monitor, motherboard and the Case
//Next Create an instance of a PC
//Next just call the description() method on it
//Next  invoke the powerUp() method on it
//
//Congrats you have composed a PC!!!
//Make sure your expected output looks like this...




public class PCTest {
    public static void main(String[] args) {
        System.out.println("==========================================================================================================================");
        Dimension dimension = new Dimension(30,40,25);
        System.out.println(dimension);
        Monitor monitor = new Monitor("hp","hp","1960x1080","35inch");
        System.out.println(monitor);
        Motherboard motherboard = new Motherboard("hyperx",4,4,"cmos");
        System.out.println(motherboard);
        Case aCase = new Case("200r","corsair"," 600w gold standard",new Dimension(30,20,12));
        System.out.println(aCase);
        System.out.println("=========================================================================================================================");
        PC pc = new PC(aCase,motherboard, monitor);
        pc.description();
        pc.powerUp();


    }
}
