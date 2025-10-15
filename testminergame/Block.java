package testminergame;

import java.awt.*;

public class Block {

    public Point position;
    public int health;
    public Color blockColor = Color.GRAY;
    public boolean rockSolid;
    public int blockPayout;
  
    public Block() {
    }
    
    /**
     * Constructor to create the block.
     * @param position position in the grid.
     */
    Block(Point position) {
        this.position = position;
    }

    /**
     * Draws the given block.
     * @param g graphics.
     * @param blockSize the size of the block to draw.
     */
    void drawBlock(Graphics g, MapGame map) {
        g.setColor(this.blockColor);
        g.fillRect(this.position.x, this.position.y, map.getBlockSize(), map.getBlockSize());
        g.setColor(Color.BLACK);
        g.drawRect(this.position.x, this.position.y, map.getBlockSize(), map.getBlockSize());
    }
}