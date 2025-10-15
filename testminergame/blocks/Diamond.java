package testminergame.blocks;

import java.awt.Color;
import java.awt.Point;
import testminergame.Block;

/**
 * Subclass of Block to define Diamond Blocks.
 */
public class Diamond extends Block{
    Color diamondColor = new Color(0, 255, 255);
    
    /**
     * Contructor for Diamond subclass.
     * @param position position of the block in the grid.
     */
    public Diamond(Point position) {
        this.position = position;
        this.rockSolid = true;
        this.blockColor = diamondColor;
        this.health = 15;
        this.blockPayout = 500;
    }
}
