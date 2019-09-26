package homeWork9252019;
//•PC CLASS
//Create a PC class that HAS a Case , Motherboard and a Monitor (Make all instance variables private) also make all the getters PRIVATE!!!
//
//Create a constructor for PC containing all instance variables.
// Also create private getters for them.
//
//Create a drawLogo() method that is private , returns nothing and invokes/calls the drawPixel() method on the monitor
//
//Create a public method called description that returns nothing but prints out the description of the case, monitor and motherboard
//
//Create a poweUp() method that is public and returns nothing but invokes the pressPowerButton() method  on theCase and after that it calls/invoke the drawLogo() method then right after that it invokes the loadProgram() method on the motherBoard
//
//Finally Override the toString Method for the PC Class

public class PC {
    private Case aCase;
    private Motherboard motherboard;
    private Monitor monitor;

    public PC (Case aCase,Motherboard motherboard,Monitor monitor){
        this.aCase = aCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    private Case getCase() {
        return aCase;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }

    private Monitor getMonitor() {
        return monitor;
    }

//    public void setmonitor(String monitor) {
//        monitor = monitor;
//    }
//
//    public void setMotherboard(Motherboard motherboard) {
//        this.motherboard = motherboard;
//    }
//
//    public void setCase(String aCase) {
//        Case = aCase;
//    }

    private void drawLogo(){
        monitor.drawPixelAt(30,20,"blue");
    }
    public void description(){
        System.out.println("Below is a description of our PC deal of the day!!!");
    }
    public void powerUp(){
        aCase.pressPowerButton();
        drawLogo();
        motherboard.loadProgram("Windows");
    }

    @Override
    public String toString() {
        return "PC{" +
                "aCase=" + aCase +
                ", motherboard=" + motherboard +
                ", monitor=" + monitor +
                '}';
    }
}
