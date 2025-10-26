package testminergame.player;

import java.util.HashMap;
import java.util.Map;
import testminergame.blocks.BlockID;

/**
 * Keeps track of which blocks where broken.
 */
public class Inventory {
    Map<String, Integer> listedInv = new HashMap<>(8);
    
    /**
     * Initialize inventory with all block types.
     */
    public Inventory() {
        listedInv.put(BlockID.AIRID, 0);
        listedInv.put(BlockID.COPPERID, 0);
        listedInv.put(BlockID.DIAMONDID, 0);
        listedInv.put(BlockID.GOLDID, 0);
        listedInv.put(BlockID.IRONID, 0);
        listedInv.put(BlockID.PLATINUMID, 0);
        listedInv.put(BlockID.STONEID, 0);
        listedInv.put("Money", 0);
        listedInv.put("Tool", 3);
    }

    public void put(String str, int key) {
        listedInv.put(str, key);
    }

    public int getValue(String str) {
        return listedInv.get(str);
    }
}
