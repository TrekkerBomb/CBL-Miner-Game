package testminergame.player;

import java.awt.*;
import testminergame.MapGame;

/**
 * This class has everything the player does.
 */
public class Player {

    Point position = new Point();
    int width;
    int height;

    /**
     * Draw the player.
     * @param g graphics.
     * @param map the map this is used to get the information where the player is.
     */
    public void drawPlayer(Graphics g, MapGame map) {

        g.setColor(Color.YELLOW);
        g.fillRect((this.position.x - width / 2), this.position.y, width, height);
        g.setColor(Color.BLACK);
        g.drawRect((this.position.x - width / 2), this.position.y, width, height);
    }

    /**
     * Moves the player on the basis of the input.
     * @param input wasd.
     */
    public void movePlayer(char input) {

        switch (input) {
            case 'w': this.position.setLocation(position.x, position.y - 10);
                break;
            case 'a': this.position.setLocation(position.x - 10, position.y);
                break;
            case 's': this.position.setLocation(position.x, position.y + 10);
                break;
            case 'd': this.position.setLocation(position.x + 10, position.y);
                break;
            default:
                break;
        }
    }

    /**
     * Creating player on the specified position.
     * @param map the map where the player is in.
     */
    public Player(MapGame map) {
        this.position.x = (map.getGridsizeX() * map.getBlockSize() / 2);
        this.position.y = 0;

        this.height = 3 * map.getBlockSize();
        this.width = 2 * map.getBlockSize();
    }
}
