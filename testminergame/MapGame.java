package testminergame;

import testminergame.generateminerals.RandomGrid;

/**
 * Class for updating the blockmap.
 */
public class MapGame {

    private static final int GRIDSIZEX = 22;
    private static final int GRIDSIZEY = 15;
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
     * Sets the block in the blockMap.
     * @param newBlock The block to be set.
     */
    public void setBlockMap(Block newBlock) {
        int xCoordinate = newBlock.position.x / MapGame.BLOCKSIZE;
        int yCoordinate = newBlock.position.y / MapGame.BLOCKSIZE;
        this.blockMap[xCoordinate][yCoordinate] = newBlock;
    }

    /**
     * Creates the random map.
     */
    public MapGame() {
        this.blockMap = ranGrid.giveReference();
    }
}