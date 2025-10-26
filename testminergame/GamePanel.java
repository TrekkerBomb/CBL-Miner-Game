package testminergame;

import java.awt.*;
import javax.swing.*;
import testminergame.player.Player;

/**
 * This is the class for the mainpanel. This class handles the graphics.
 */
public class GamePanel extends JPanel {

    private MapGame currentMap;
    private Player currentPlayer;

    /**
     * This is the panel where all the drawing hapens.
     * @param currentMap the map.
     * @param currentPlayer the player.
     */
    public GamePanel(MapGame currentMap, Player currentPlayer) {
        this.currentMap = currentMap;
        this.currentPlayer = currentPlayer;
        this.setBounds(0, 0, 1080, 700);
        setFocusable(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        for (int i = 0; i < MapGame.getGridsizeX(); i++) {
            for (int j = 0; j < MapGame.getGridsizeY(); j++) {

                currentMap.getBlockMap()[i][j].drawBlock(g);
            }
        }
        currentPlayer.drawPlayer(g, currentMap);
        
    }
}