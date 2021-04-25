package Structural.Composite;

/*
            computer
            /    \
       cabinat    periparal
       /           /  \
       hdd     mouse   keyboad
*/
public class Main {
    public static void main (String args[]) {
        Component mouse = new leaf(1000, "mouse");
        Component keyboard = new leaf (2000, "keyboard");
        Component hdd = new leaf(3000, "harddisk");

        Composite periperal = new Composite("periperal");
        periperal.addComponent(mouse);
        periperal.addComponent(keyboard);

        Composite cabinat = new Composite("cabinat");
        cabinat.addComponent(hdd);

        Composite computer = new Composite("computer");
        computer.addComponent(cabinat);
        computer.addComponent(periperal);

        computer.showprice();
    }
}
