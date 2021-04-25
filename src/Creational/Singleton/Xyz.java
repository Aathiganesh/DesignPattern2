package Creational.Singleton;

public enum Xyz {
    INSTANCE;
    int i = 9;
    public void show () {
        System.out.println(i);
    }
}
