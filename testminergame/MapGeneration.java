package testminergame;

import java.awt.*;
import javax.swing.*;


/**
 * .
 */
class MapGeneration {

    private int gridsizeY = 10;
    private int gridsizeX = 20;

    public Block[][] blockMap = new Block[gridsizeX][gridsizeY];


    public int getGridsizeX() {
        return this.gridsizeX;
    }

    public int getGridsizeY() {
        return this.gridsizeY;
    }

    /**
     * generates the initial map of blocks which is then changed with the seed.
     */
    MapGeneration() {

        MapGeneration map = new MapGeneration();

        for (int i = 0; i < map.gridsizeX; i++) {
            for (int j = 0; j < map.gridsizeY; j++) {
                blockMap[i][j] = new Block(i, j);
                // drawBlock(blockMap[i][j]); doesn't work yet
            }
        }
    }

    class Block {

        Point position;
        private final int blockSize = 75;
        int health;
        Color blockColor = Color.GRAY;

        /**
         * Constructor to create the block.
         * @param XCoordinate X Coordinate of the block.
         * @param YCoordinate Y Coordinate of the block
         */ 
        Block(int xCoordinate, int yCoordinate) {

            this.position.setLocation(xCoordinate, yCoordinate);
        }

        void drawBlock(Block block) {
            //Point position = block.position;

            Rectangle drawedBlock = new Rectangle(position.x, position.y, blockSize, blockSize);
        }
    }

    public static void main(String[] args) {

    }
}