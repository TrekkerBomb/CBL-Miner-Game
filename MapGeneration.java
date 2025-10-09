import java.awt.*;
import javax.swing.*;


/**
 * .
 */
class MapGeneration {

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

    class BlockMap {

        int gridsizeY = 10;
        int gridsizeX = 20;

        Block[][] blockMap = new Block[gridsizeY][gridsizeX];


        /**
         * .
         */
        BlockMap() {

            for (int i = 0; i < gridsizeY; i++) {
                for (int j = 0; j < gridsizeX; j++) {
                    blockMap[i][j] = new Block(j, i); // placeholder to test.
                }
            }
        }

        void run() {


            Bockmap map = new Blockmap();
        }

    }


    public static void main(String[] args) {
        MapGeneration map = new MapGeneration();
        new map.BlockMap();
    }

 }