package testminergame.player;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * This class handles the input the user gives and stores it in the variable movement.
 */
public class KeyInputHandler implements KeyListener {

    char movement;

    /**
     * Getter for movement.
     * @return movement input for the player.
     */
    public char getMovement() {
        return this.movement;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        movement = e.getKeyChar();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        movement = '0'; //set the movement to something else to stop the movement.
    }

    @Override
    public void keyTyped(KeyEvent e) {}
}
