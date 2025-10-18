package testminergame;

import java.awt.*;

/**
 * The superclass of all Block subclasses.
 * This is used in a Factory class to return objects of its subclasses.
 * 
 * Contains all instance variables needed for its subclasses.
 */
public class Block {

    public Point position;
    public int health;
    public Color blockColor;
    public boolean rockSolid;
    public int blockPayout;
  
    public Block() {
    }
    
    /**
     * Draws the given block.
     * @param g graphics.
     * @param blockSize the size of the block to draw.
     */
    void drawBlock(Graphics g) {
        int blockSize = MapGame.getBlockSize();
        g.setColor(this.blockColor);
        g.fillRect(this.position.x, this.position.y, blockSize, blockSize);
        g.setColor(Color.BLACK);
        g.drawRect(this.position.x, this.position.y, blockSize, blockSize);
    }
}