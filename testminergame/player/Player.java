package testminergame.player;

import java.awt.*;
import testminergame.MapGame;

/**
 * This class has everything the player does.
 */
public class Player {

    private Point position = new Point();
    private int reach = 100;
    private int width;
    private int height;

    Point damageCenter = new Point(position.x, position.y);

    /**
     * Draw the player.
     * @param g graphics.
     * @param map the map this is used to get the information where the player is.
     */
    public void drawPlayer(Graphics g, MapGame map) {

        g.setColor(Color.YELLOW);
        g.fillRect((this.position.x - width / 2), this.position.y - height, width, height);
        g.setColor(Color.BLACK);
        g.drawRect((this.position.x - width / 2), this.position.y - height, width, height);
        
        //this is the player position this is now just of reference for the eventual collision
        g.setColor(Color.BLUE);
        g.fillOval((this.position.x) - 10, this.position.y - 10, 20, 20);
        g.setColor(Color.RED);

        // reference for damageCenter
        g.fillOval(getDamageCenter().x - 5, getDamageCenter().y - 5, 10, 10);
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
        //Move damageCenter after player movement.
        this.damageCenter.setLocation(position.x, position.y - 0.5 * height);
    }

    public int getReach() {
        return this.reach;
    }

    public Point getDamageCenter() {
        return this.damageCenter;
    }

    /**
     * Creating player on the specified position.
     */
    public Player() {

        this.position.x = (MapGame.getGridsizeX() * MapGame.getBlockSize()) / 2;
        this.position.y = height + 200;

        this.height = 3 * MapGame.getBlockSize();
        this.width = 2 * MapGame.getBlockSize();
    }
}