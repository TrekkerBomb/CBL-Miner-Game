package testminergame;

import java.awt.*;

/**
 * class for updating the blockmap.
 */
public class Map {

    private int gridsizeX = 20;
    private int gridsizeY = 10;
    private final int blockSize = 50;

    private Block[][] blockMap;

    public int getGridsizeX() {
        return this.gridsizeX;
    }

    public int getGridsizeY() {
        return this.gridsizeY;
    }

    public int getBlockSize() {
        return this.blockSize;
    }
    
    public Block[][] getBlockMap() {
        return this.blockMap;
    }

    /**
     * Creates the map.
     */
    Map() {

        this.blockMap = new Block[getGridsizeX()][getGridsizeY()];

        for (int i = 0; i < getGridsizeX(); i++) {
            for (int j = 0; j < getGridsizeY(); j++) {
                blockMap[i][j] = new Block(new Point(this.blockSize * i, this.blockSize * j));
            }
        }

        //blockMap[1][1] = new Block(new Point(1000, 300));


    }
}
