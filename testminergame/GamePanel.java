package testminergame;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

/**
 * .
 */
public class GamePanel extends JPanel implements KeyListener {

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
        this.addKeyListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        for (int i = 0; i < map.getGridsizeX(); i++) {
            for (int j = 0; j < map.getGridsizeY(); j++) {

                map.getBlockMap()[i][j].drawBlock(g, map);
            }
        }
        player.drawPlayer(g, map);

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar() == 'w') {
            player.movePlayer(e.getKeyChar());
            System.out.println("w is pressed");
        } else if (e.getKeyChar() ==  'a') {
            player.movePlayer(e.getKeyChar());
            System.out.println("a is pressed");
        } else if (e.getKeyChar() ==  's') {
            player.movePlayer(e.getKeyChar());
            System.out.println("s is pressed");
        } else if (e.getKeyChar() ==  'd') {
            player.movePlayer(e.getKeyChar());
            System.out.println("d is pressed");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}
}