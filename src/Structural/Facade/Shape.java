package Structural.Facade;

public interface Shape {
    public void draw();
}

class circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle Drawn");
    }
}
class square implements Shape {

    @Override
    public void draw() {
        System.out.println("square Drawn");
    }
}