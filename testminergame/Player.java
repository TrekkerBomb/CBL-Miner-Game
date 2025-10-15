package testminergame;

import java.awt.*;
import java.awt.event.KeyListener;


public class Player {

    Point position = new Point();
    int Width;
    int Height;


    KeyListener keylistener;


    /**
     * Draw the player
     * @param g
     * @param map
     */
    public void drawPlayer(Graphics g, MapGame map) {

        g.setColor(Color.YELLOW);
        g.fillRect((int) (this.position.x - 0.5 * Width), this.position.y, Width, Height);
        g.setColor(Color.BLACK);
        g.drawRect((int) (this.position.x - 0.5 * Width), this.position.y, Width, Height);
    }


    /**
     * Moves the player on the basis of the input.
     * @param input wasd.
     */
    public void movePlayer(char input) {

        switch (input) {
            case 'w': this.position.setLocation(position.x, position.y + 10);
                break;
            case 'a': this.position.setLocation(position.x - 10, position.y);
                break;
            case 's': this.position.setLocation(position.x, position.y - 10);
                break;
            case 'd': this.position.setLocation(position.x + 10, position.y + 10);
                break;
            default:
                break;
        }
    }

    public void movePlayerLeft(MapGame map) {
        this.position.move(position.x - map.getBlockSize(), 0);
    }


    public void movePlayerRight(MapGame map) {
        this.position.move(position.x + map.getBlockSize(), 0);
    }


    /**
     * Creating player on the specified position.
     * @param map the map where the player is in.
     */
    Player(MapGame map) {
        this.position.x = (map.getGridsizeX() * map.getBlockSize() / 2);
        this.position.y = 0;

        this.Height = 3 * map.getBlockSize();
        this.Width = 2 * map.getBlockSize();
    }
}
