package Behavioral.Memento;

public class Life {
    private String time;

    public Life (String t) {
        this.time = t;
    }
    public Memnto savetoMemento () {
        System.out.println(time);
        return new Memnto(this.time);
    }
    public void restorefromMemento (Memnto mt) {
        System.out.println("restored time" + mt.restoretime());
        this.time = mt.restoretime();
    }
    static class Memnto {
        private String time;
        public Memnto (String t) {
            this.time = t;
        }
        public String restoretime () {
            return time;
        }
    }
}
