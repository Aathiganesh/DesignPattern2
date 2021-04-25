package Behavioral.Mediator;

public interface IATC {
    public void registerrunway(Runway rn);
    public void registerfight(Flight fl);
    public boolean islandingok();
    public void setstatus (boolean status);
}

class ATC implements IATC {
    private Flight fl;
    private Runway rn;
    private boolean status;

    @Override
    public void registerrunway(Runway rn) {
        this.rn = rn;
    }

    @Override
    public void registerfight(Flight fl) {
        this.fl = fl;
    }

    public boolean islandingok() {
        return status;
    }


    public void setstatus(boolean status) {
        this.status = status;
    }
}