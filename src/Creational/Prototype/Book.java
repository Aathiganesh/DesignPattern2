package Creational.Prototype;

public class Book {
    public String bookName;
    public int bookId;


    public void setid(int i) {
        this.bookId = i;
    }

    public void setname(String s) {
        this.bookName = s;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookId=" + bookId +
                '}';
    }
}
