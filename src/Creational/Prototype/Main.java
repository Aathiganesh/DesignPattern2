package Creational.Prototype;

public class Main {
    public static void main (String args[]) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopname("a1");
        bs.loaddata();


        BookShop bs1 = (BookShop) bs.clone();
        bs1.setShopname("a2");
        bs.ls.remove(0);

        System.out.println(bs1.toString());
        System.out.println(bs.toString());
    }
}
