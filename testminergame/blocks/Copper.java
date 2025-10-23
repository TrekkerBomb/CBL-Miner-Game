package testminergame.blocks;

import java.awt.Color;
import java.awt.Point;
import testminergame.Block;

/**
 * Subclass of Block to define Copper Blocks.
 */
public class Copper extends Block {
    Color copperColor = new Color(79, 216, 189);

    /**
     * Contructor for Copper subclass.
     * @param position position of the block in the grid.
     */
    public Copper(Point position) {
        this.position = position;
        this.rockSolid = true;
        this.blockColor = copperColor;
        this.health = 6;
        this.blockPayout = 5;
        this.blockKey = "Copper";
    }
}