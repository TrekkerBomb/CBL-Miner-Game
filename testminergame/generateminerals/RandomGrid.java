package testminergame.generateminerals;

import java.awt.Point;
import testminergame.Block;
import testminergame.MapGame;

/**
 * Generates a Block grid filled with randomly selected Blocks.
 */
public class RandomGrid {
    
    private final RandomBlock ranBlock = new RandomBlock();
    private final int xCoord = MapGame.getGridsizeX();
    private final int yCoord = MapGame.getGridsizeY();
    private Block[][] referenceGrid;

    /**
     * Fills in the grid with random blocks.
     */
    public RandomGrid() {
        this.referenceGrid = new Block[xCoord][yCoord];
        final int bSize = MapGame.getBlockSize();
        
        for (int i = 0; i < xCoord; i++) {
            for (int j = 0; j < yCoord; j++) {
                Point newPos = new Point(bSize * i, bSize * j); 
                this.referenceGrid[i][j] = ranBlock.giveBlock(newPos);
            }
        }
    }

    public Block[][] giveReference() {
        return this.referenceGrid;
    }
}