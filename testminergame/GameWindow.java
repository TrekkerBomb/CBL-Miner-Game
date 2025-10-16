package testminergame;

//import java.awt.*;
import javax.swing.*;

/**
 * Making of the gameWindow.
 */
public class GameWindow {

    /**
     * makes the GUI and the window.
     */

    JFrame gameWindow;
    GamePanel gameScreen;

    /**
     * Builds the GUI by opening a window using Swing.
     */
    void buildGUI() {
        
        gameScreen = new GamePanel();

        gameWindow = new JFrame("Game Window");
        gameWindow.add(gameScreen); 
        gameWindow.setSize(1080, 720);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setVisible(true);
               
    }
}




        /*

        Block[][] drawableMap = map.getBlockMap();
        for (int i = 0; i < map.getGridsizeX(); i++) {
            for (int j = 0; j < map.getGridsizeY(); j++) {
                block.drawBlock(g, drawableMap[i][j]);
            }
        }

        map.mapUpdate(g, map.getBlockMap(), map.getGridsizeX(), map.getGridsizeY());

         */
