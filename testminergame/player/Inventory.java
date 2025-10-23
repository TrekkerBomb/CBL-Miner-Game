package testminergame.player;

import java.util.HashMap;
import java.util.Map;

/**
 * Keeps track of which blocks where broken.
 */
public class Inventory {
    Map<String, Integer> listedInv = new HashMap<>(6);
    
    /**
     * Initialize inventory with all block types.
     */
    public Inventory() {
        listedInv.put("Stone", 0);
        listedInv.put("Air", 0);
        listedInv.put("Copper", 0);
        listedInv.put("Diamond", 0);
        listedInv.put("Gold", 0);
        listedInv.put("Iron", 0);
        listedInv.put("Platinum", 0);
        listedInv.put("Stone", 0);
        listedInv.put("Money", 0);
    }

    public void put(String str, int key) {
        listedInv.put(str, key);
    }

    public int getValue(String str) {
        return listedInv.get(str);
    }
}
