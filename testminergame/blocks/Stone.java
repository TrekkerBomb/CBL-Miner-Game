package testminergame.blocks;

import java.awt.Color;
import java.awt.Point;
import testminergame.Block;

/**
 * Subclass of Block to define Stone Blocks.
 */
public class Stone extends Block {
    Color stoneColor = new Color(163, 163, 163);

    /**
     * Contructor for Stone subclass.
     * @param position position of the block in the grid.
     */
    public Stone(Point position) {
        this.position = position;
        this.rockSolid = true;
        this.blockColor = stoneColor;
        this.health = 3;
        this.blockPayout = 1;
    }
}
