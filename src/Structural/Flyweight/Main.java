package Structural.Flyweight;

public class Main {
    public static void main (String args[]) {
        Player p = Playerfactory.getPlayer("terrorist");
        p.AssignWeapon("ss");
        p.mission();
        Player p1 = Playerfactory.getPlayer("terrorist");
        p1.AssignWeapon("qq");
        p1.mission();
        Player p2 = Playerfactory.getPlayer("terrorist");
        p2.AssignWeapon("ww");
        p2.mission();
    }
}
