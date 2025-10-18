package testminergame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import testminergame.player.KeyInputHandler;
import testminergame.player.Player;




/**
 * This class has everything to start the game.
 */
public class GameManager implements ActionListener {


    private Timer timer;
    private MapGame map;
    private Player player;
    private KeyInputHandler inputHandler;
    private GamePanel gameScreen;

    /**
     * This constructor is calles when the game is started.
     */
    GameManager() {

        this.map = new MapGame();
        this.player = new Player(map);
        this.gameScreen = new GamePanel(map, player);
        this.inputHandler = new KeyInputHandler();
        new GameWindow(gameScreen);

        this.timer = new Timer(16, this);
        timer.start();
    }

    void pauseGame() {
        this.timer.stop();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        player.movePlayer(inputHandler.getMovement());
        gameScreen.repaint();
    }
}
