package testminergame;

import testminergame.generateminerals.RandomGrid;

/**
 * class for updating the blockmap.
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
     * Creates the map.
     */
    public MapGame() {

        //this.blockMap = new Block[getGridsizeX()][getGridsizeY()];
        this.blockMap = ranGrid.giveReference();

        /*
        for (int i = 0; i < getGridsizeX(); i++) {
            for (int j = 0; j < getGridsizeY(); j++) {
                blockMap[i][j] = new Block(new Point(this.blockSize * i, this.blockSize * j));
            }
        }
        */
        //blockMap[1][1] = new Block(new Point(1000, 300));


    }
}
