package cblminergame;
import java.awt.*;


/**
 * .
 */
class MapGeneration {

    static int gridsizeY = 10;
    static int gridsizeX = 20;

    Block[][] blockMap = new Block[gridsizeX][gridsizeY];


    /**
     * .
     */
    MapGeneration() {

        for (int i = 0; i < gridsizeX; i++) {
            for (int j = 0; j < gridsizeY; j++) {
                blockMap[i][j] = new Block(i, j); // i = y j = x
            }
        }
    }

    class Block {

        Point position;
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

        void drawBlock() {

        }
    }

    public static void main(String[] args) {
        MapGeneration map = new MapGeneration();

        for (int i = 0; i < gridsizeX; i++) {
            for (int j = 0; j < gridsizeY; j++) {
                System.err.println();
            }
        }
    }
 }