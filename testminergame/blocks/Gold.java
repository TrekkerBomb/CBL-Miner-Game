package testminergame.blocks;

import java.awt.Color;
import java.awt.Point;
import testminergame.Block;

/**
 * Subclass of Block to define Gold Blocks.
 */
public class Gold extends Block {
    Color goldColor = new Color(255, 204, 0);
 
    /**
     * Contructor for Gold subclass.
     * @param position position of the block in the grid.
     */
    public Gold(Point position) {
        this.position = position;
        this.rockSolid = true;
        this.blockColor = goldColor;
        this.health = 150;
        this.blockPayout = 50;
        this.blockKey = BlockID.GOLDID;
    }
}