package testminergame;

import java.awt.*;
import javax.swing.*;
import testminergame.player.Player;

/**
 * This is the class for the mainpanel. This class handles the graphics.
 */
public class GamePanel extends JPanel {

    private MapGame map;
    private Player player;

    /**
     * This is the panel where all the drawing hapens.
     * @param map the map.
     * @param player the player.
     */
    public GamePanel(MapGame map, Player player) {
        
        this.map = map;
        this.player = player;
        setFocusable(true);

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        for (int i = 0; i < MapGame.getGridsizeX(); i++) {
            for (int j = 0; j < MapGame.getGridsizeY(); j++) {

                map.getBlockMap()[i][j].drawBlock(g);
            }
        }
        player.drawPlayer(g, map);

    }
}