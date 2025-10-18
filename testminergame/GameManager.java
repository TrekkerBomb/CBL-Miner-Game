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
    private MapGame currentMap;
    private Player currentPlayer;
    private KeyInputHandler inputHandler;
    private GamePanel gameScreen;

    /**
     * This constructor is calles when the game is started.
     */
    GameManager() {

        this.currentMap = new MapGame();
        this.currentPlayer = new Player();
        this.gameScreen = new GamePanel(currentMap, currentPlayer);
        this.inputHandler = new KeyInputHandler();
        gameScreen.addKeyListener(inputHandler);
        new GameWindow(gameScreen);

        this.timer = new Timer(16, this);
        timer.start();
    }

    void pauseGame() {
        this.timer.stop();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        currentPlayer.movePlayer(inputHandler.getMovement());
        gameScreen.repaint();
    }
}
