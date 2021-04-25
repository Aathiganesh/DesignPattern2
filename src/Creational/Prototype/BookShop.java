package Creational.Prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
    public String shopname;
    List<Book> ls = new ArrayList<Book>();

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public void loaddata () {
        for (int i = 0; i < 10; i++) {
            Book book = new Book();
            book.setid(i);
            book.setname("b"+Integer.toString(i));
            ls.add(book);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopname='" + shopname + '\'' +
                ", ls=" + ls +
                '}';
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop bs = new BookShop();

        for (Book b: this.ls) {
            bs.ls.add(b);
        }

        return bs;
    }
}