package testminergame.blocks;

import java.awt.Color;
import java.awt.Point;
import testminergame.Block;

/**
 * Subclass of Block to define Air Blocks.
 */
public class Air extends Block {
    Color airColor = new Color(216, 229, 243);

    /**
     * Contructor for Air subclass.
     * @param position position of the block in the grid.
     */
    public Air(Point position) {
        this.position = position;
        this.rockSolid = false;
        this.blockColor = airColor;
        this.health = -1;
    }
}
