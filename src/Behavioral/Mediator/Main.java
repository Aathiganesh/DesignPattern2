package Behavioral.Mediator;

public class Main {
    public static void main (String args[]) {
        IATC iatc = new ATC();
        Flight fl = new Flight(iatc);
        Runway rn = new Runway(iatc);
       // rn.setrunway();
        rn.land();
        fl.land();
    }
}
