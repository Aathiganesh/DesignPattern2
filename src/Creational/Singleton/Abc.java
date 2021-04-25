package Creational.Singleton;

public class Abc {
    public static Abc abc;
    private Abc () {
        System.out.println("instance created");
    }
//    public static synchronized Abc getInstance () {

    public static Abc getInstance () {
        if (abc == null) {
            synchronized (Abc.class) {
                if (abc == null)
                abc = new Abc();
            }
        }
        return abc;
    }
}
