package testminergame.player;

import java.awt.*;
import testminergame.MapGame;

/**
 * This class has everything the player does.
 */
public class Player {

    Point position = MapGame.getStartPoint();
    int movementSpeed = 10;
    int jumpspeed = 10;
    int reach = 100;
    int width;
    int height;
    Point damageCenter = new Point(position.x, position.y);
    boolean activeGravity = true;

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
    public void movePlayer(char input, MapGame map) {

        int newXPosition;
        int newYPosition;
        switch (input) {
            case 'w': 
                newYPosition = position.y - MovementRestrictions.upRestriction(this, map);
                this.position.setLocation(position.x, newYPosition);
                break;
            case 'a': 
                newXPosition = position.x - MovementRestrictions.leftRestriction(this, map);
                this.position.setLocation(newXPosition, position.y);
                break;
            case 'd': 
                newXPosition = position.x + MovementRestrictions.rightRestriction(this, map);
                this.position.setLocation(newXPosition, position.y);
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

        this.height = 130;
        this.width = 2 * MapGame.getBlockSize();

        this.position.x = (MapGame.getGridsizeX() * MapGame.getBlockSize()) / 2;
        this.position.y = height + MapGame.getBlockSize() * (3 + MapGame.getStartDept()) + 20;


    }
}