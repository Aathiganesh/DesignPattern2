package Creational.Singleton;

public class Main {
    public static void main(String args[]) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Abc abc = Abc.getInstance();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Abc abc = Abc.getInstance();
            }
        });
        t1.start();
      //  Thread.sleep(10);
        t2.start();

        Xyz xyz = Xyz.INSTANCE;
        xyz.i = 10;
        xyz.show();

        Xyz xyz1 = Xyz.INSTANCE;
        xyz1.i = 11;
        xyz.show();


    }
}
