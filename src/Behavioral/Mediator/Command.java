package Behavioral.Mediator;

public interface Command {
    public void land();
}

class Flight implements  Command {

    IATC iatc;
    public Flight (IATC iatc) {
        this.iatc = iatc;
    }
    @Override
    public void land() {
        if (iatc.islandingok()) {
            System.out.println("landed");
        }
        else {
            System.out.println("ready to land");
        }
    }
}

class Runway implements Command {

    IATC iatc;
    public Runway (IATC iatc) {
        this.iatc = iatc;
    }

    public void setrunway () {
        this.iatc.setstatus(true);
    }
    @Override
    public void land() {
        System.out.println("runway ready");
    }
}