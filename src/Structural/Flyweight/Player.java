package Structural.Flyweight;

public interface Player {
    public void AssignWeapon(String Weapon);
    public void mission();
}

class terrorist implements Player {
    private final String TASK;
    String weapon;

    terrorist() {
        TASK = "plant a bomb";
    }

    @Override
    public void AssignWeapon(String Weapon) {
        this.weapon = Weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with weapon " + this.weapon + TASK);
    }
}
class CounterTerrorist implements Player {
    private final String Task;
    String weapon;

    CounterTerrorist() {
        Task = "Diffuse a bomb";
    }

    @Override
    public void AssignWeapon(String Weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter Terrorist with weapon " + weapon + Task);
    }
}