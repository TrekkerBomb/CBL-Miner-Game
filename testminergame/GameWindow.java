package testminergame;

//import java.awt.*;
import javax.swing.*;



/**
 * Code for making the gameWindow.
 */
public class GameWindow {


    JFrame gameWindow;
    GamePanel gameScreen;
    
    /**
     * makes the GUI and the window.
     */
    public GameWindow(GamePanel gameScreen) {
        this.gameScreen = gameScreen;
        gameWindow = new JFrame("Game Window");
        gameWindow.add(gameScreen); 
        gameWindow.setSize(1080, 720);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gameWindow.setVisible(true);
        gameScreen.requestFocusInWindow();
               
    }
}
