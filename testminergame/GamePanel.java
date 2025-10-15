package testminergame;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;

import javax.swing.*;





/**
 * .
 */
public class GamePanel extends JPanel implements KeyListener {

    private MapGame map;
    private Player player;
    private Timer timer;

    public GamePanel() {
        
        map = new MapGame();
        player = new Player(map);

        this.timer = new Timer(16, this);
        timer.start();

        this.setFocusable(true);
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
    public void keyTyped(KeyEvent e) {
        
        player.movePlayer(e.getKeyChar());
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    
}