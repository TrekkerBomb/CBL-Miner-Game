package testminergame;

//import java.awt.*;
import javax.swing.*;


/*  
class GamePanel extends JPanel {
    
    private Map map;

    public GamePanel() {
        map = new Map();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        /* 
        Block block1 = map.getBlockMap()[0][0];
        Block block2 = map.getBlockMap()[1][1];



        block1.drawBlock(g);
        block2.drawBlock(g);

*//* 
        for (int i = 0; i < map.getGridsizeX(); i++) {
            for (int j = 0; j < map.getGridsizeY(); j++) {

                map.getBlockMap()[i][j].drawBlock(g, map.getBlockSize());
            }
        }
        
    }
    
}
*/ 

/**
 * Making of the gameWindow.
 */
public class GameWindow {

    /**
     * makes the GUI and the window.
     */

    JFrame gameWindow;
    GamePanel gameScreen;

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
