package testminergame;

import java.awt.*;

public class Block {

    Point position;
    int health;
    Color blockColor = Color.GRAY;

    public Block(int idBlock) {

    }
    
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
    void drawBlock(Graphics g, int blockSize) {
        g.setColor(this.blockColor);
        g.fillRect(this.position.x, this.position.y, blockSize, blockSize);
        g.setColor(Color.BLACK);
        g.drawRect(this.position.x, this.position.y, blockSize, blockSize);
    }
}