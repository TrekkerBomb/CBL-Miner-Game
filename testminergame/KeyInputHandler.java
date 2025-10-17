package testminergame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * .
 */


class KeyInputHandler implements KeyListener {
    char movement;

    @Override
    public void keyPressed(KeyEvent e) {
        movement = e.getKeyChar();
    }

    @Override
        public void keyReleased(KeyEvent e) {
            
    }

    @Override
        public void keyTyped(KeyEvent e) {
        
    }
}
