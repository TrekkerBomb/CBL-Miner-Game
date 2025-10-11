package testminergame;

import java.awt.*;

class Block {

    Point position;
    int health;
    Color blockColor = Color.GRAY;
    

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
     * @param block the block to draw.
     */
    void drawBlock(Graphics g, int blockSize) {
        g.setColor(this.blockColor);
        g.fillRect(this.position.x, this.position.y, blockSize, blockSize);
        g.setColor(Color.BLACK);
        g.drawRect(this.position.x, this.position.y, blockSize, blockSize);
    }
}