package Behavioral.Memento;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String args[]) {
        List<Life.Memnto> mlist = new ArrayList<Life.Memnto>();
        Life lf1 = new Life("1000");
        mlist.add(lf1.savetoMemento());
        Life lf2 = new Life("2000");
        mlist.add(lf2.savetoMemento());
        Life lf3 = new Life("3000");
        mlist.add(lf3.savetoMemento());
        Life lf4 = new Life("4000");
        mlist.add(lf4.savetoMemento());

        lf4.restorefromMemento(mlist.get(0));
    }
}
