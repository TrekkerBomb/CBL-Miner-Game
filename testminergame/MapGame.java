package testminergame;

import testminergame.generateminerals.RandomGrid;

/**
 * Class for updating the blockmap.
 */
public class MapGame {

    private static final int GRIDSIZEX = 20;
    private static final int GRIDSIZEY = 10;
    private static final int BLOCKSIZE = 50;

    private Block[][] blockMap;
    private final RandomGrid ranGrid = new RandomGrid();

    public static int getGridsizeX() {
        return GRIDSIZEX;
    }

    public static int getGridsizeY() {
        return GRIDSIZEY;
    }

    public static int getBlockSize() {
        return BLOCKSIZE;
    }
    
    public Block[][] getBlockMap() {
        return this.blockMap;
    }

    /**
     * Creates the random map.
     */
    public MapGame() {
        this.blockMap = ranGrid.giveReference();
    }
}