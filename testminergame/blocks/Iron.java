package testminergame.blocks;

import java.awt.Color;
import java.awt.Point;
import testminergame.Block;

/**
 * Subclass of Block to define Iron Blocks.
 */
public class Iron extends Block {
    Color ironColor = new Color(206, 160, 95);
    
    /**
     * Contructor for Iron subclass.
     * @param position position of the block in the grid.
     */
    public Iron(Point position) {
        this.position = position;
        this.rockSolid = true;
        this.blockColor = ironColor;
        this.health = 100;
        this.blockPayout = 25;
        this.blockKey = BlockID.IRONID;
    }
}