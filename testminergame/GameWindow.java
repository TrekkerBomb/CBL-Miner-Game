package testminergame;

import java.awt.*;
import javax.swing.*;


/**
 * .
 */
class GamePanel extends JPanel {
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    
}

/**
 * Making of the gameWindow.
 */
public class GameWindow {

    /**
     * makes the GUI and the window.
     */
    void buildGUI() {


        JFrame gameWindow;
        
        GamePanel gameScreen = new GamePanel();

        gameWindow = new JFrame("Game Window");
        gameWindow.setSize(1080, 720);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setVisible(true);

        
        gameWindow.add(gameScreen);        
    }
}
