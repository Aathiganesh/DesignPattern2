package Structural.Flyweight;

import java.util.HashMap;

public class Playerfactory {
    private static HashMap<String, Player> hm = new HashMap<String, Player>();

    public static Player getPlayer (String type) {
        Player p = null;

        if (hm.containsKey(type)) {
            p = hm.get(type);
            System.out.println("object reused");
        }
        else {
            switch (type) {
                case "terrorist":
                    p = new terrorist();
                    break;
                case "counterterrorist":
                    p = new CounterTerrorist();
                    break;
                default:
                    System.out.println("error");
            }
            System.out.println("object created");
            hm.put(type, p);
        }
        return p;
    }
}
