package Structural.Facade;

public class Painter {
    Shape sh1;
    Shape sh2;
    public Painter () {
        sh1 = new circle();
        sh2 = new square();
    }
    public void drawcircle () {
        sh1.draw();
    }
    public void drawsquare () {
        sh2.draw();
    }
}
