package Behavioral.Command;

public class Main {
    public static void main (String args[]) {
        Light lt = new Light();
        Command cm;

        Remote rm = new Remote();
        rm.setCommand(new LightOff(lt));
        rm.pressed();
        rm.setCommand(new LightOn(lt));
        rm.pressed();

    }
}
