package testminergame;

import java.awt.Point;
import java.util.Arrays;
import testminergame.blocks.Air;
import testminergame.generateminerals.RandomGrid;



/**
 * Class for updating the blockmap.
 */
public class MapGame {

    private static final int GRIDSIZEX = 30;
    private static final int GRIDSIZEY = 20;
    private static final int BLOCKSIZE = 50;
    private static final int STARTDEPT = 2;

    private Block[][] blockMap;
    private final RandomGrid ranGrid = new RandomGrid();

    static Point startPoint = new Point((int) GRIDSIZEX / 2, 4 + STARTDEPT);

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


    public static Point getStartPoint() {
        return startPoint;
    }

    public static int getStartDept() {
        return STARTDEPT;
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

    private void makeStart() {

        boolean[][] setAir = new boolean[4][6];
        for (boolean[] row : setAir) {
            Arrays.fill(row, true);
        }

        setAir[0][0] = false;
        setAir[0][5] = false;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                if (setAir[i][j]) {
                    int xGrid = startPoint.x - 3 + j;
                    int yGrid = startPoint.y - 4 + i + STARTDEPT;
                    Point gridPoint = new Point(xGrid * BLOCKSIZE, yGrid * BLOCKSIZE);
                    this.setBlockMap(new Air(gridPoint));
                }
            }
        }
    }

    /**
     * Creates the random map.
     */
    public MapGame() {
        this.blockMap = ranGrid.giveReference();
        makeStart();
    }
}