package testminergame;

import javax.swing.*;

/**
 * Code for making the gameWindow.
 */
public class GameWindow {

    JFrame gameWindow;
    public JPanel gamePanel;
    
    /**
     * makes the GUI and the window.
     */
    public GameWindow() {
        gamePanel = new JPanel();
        gamePanel.setBounds(0, 0, 0, 0); 
        gameWindow = new JFrame("Game Window"); 
        gameWindow.setSize(1080, 720);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.add(gamePanel);
        gameWindow.setVisible(true);
        gamePanel.setVisible(false);
    }

    /**
     * Adds elements to the frame.
     */
    void integratePanel(JPanel newPanel) {
        gameWindow.add(newPanel);
        newPanel.setVisible(true);
        newPanel.requestFocusInWindow();
    }
}
