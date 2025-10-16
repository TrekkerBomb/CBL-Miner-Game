package testminergame.blocks;

import java.awt.Color;
import java.awt.Point;
import testminergame.Block;

/**
 * Subclass of Block to define Platinum Blocks.
 */
public class Platinum extends Block {
    Color platinumColor = new Color(0, 255, 255);

    /**
     * Contructor for Platinum subclass.
     * @param position position of the block in the grid.
     */
    public Platinum(Point position) {
        this.position = position;
        this.rockSolid = true;
        this.blockColor = platinumColor;
        this.health = 25;
        this.blockPayout = 100;
    }
}