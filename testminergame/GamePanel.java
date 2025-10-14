package testminergame;

import java.awt.*;
import javax.swing.*;

/**
 * .
 */
public class GamePanel extends JPanel {

    private MapGame map;
    private Player player;

    public GamePanel() {
        map = new MapGame();
        player = new Player(map);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        /* 
        Block block1 = map.getBlockMap()[0][0];
        Block block2 = map.getBlockMap()[1][1];



        block1.drawBlock(g);
        block2.drawBlock(g);

*/
        /*for (int i = 0; i < map.getGridsizeX(); i++) {
            for (int j = 0; j < map.getGridsizeY(); j++) {

                map.getBlockMap()[i][j].drawBlock(g, map);
            }
        }
*/

        player.drawPlayer(g, map);
        
    }
    
}