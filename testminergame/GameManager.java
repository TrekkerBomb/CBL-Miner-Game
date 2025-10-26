package testminergame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import testminergame.mining.BlockDestroyer;
import testminergame.mining.MouseInputHandler;
import testminergame.player.KeyInputHandler;
import testminergame.player.MovementRestrictions;
import testminergame.player.Player;


/**
 * This class has everything to start the game.
 */
public class GameManager implements ActionListener {


    private Timer timer;
    private MapGame currentMap;
    private Player currentPlayer;
    private KeyInputHandler inputHandler;
    private MouseInputHandler mouseInputH;
    private BlockDestroyer blockDest;
    private GamePanel gameScreen;

    /**
     * This constructor is calles when the game is started.
     */
    GameManager() {

        this.currentMap = new MapGame();
        this.currentPlayer = new Player();
        this.inputHandler = new KeyInputHandler();
        this.mouseInputH = new MouseInputHandler();
        this.blockDest = new BlockDestroyer();

        this.gameScreen = new GamePanel(currentMap, currentPlayer);
        gameScreen.addMouseListener(mouseInputH);
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
        currentPlayer.movePlayer(inputHandler.getMovement(), currentMap);
        blockDest.damageBlock(currentMap, currentPlayer, mouseInputH);       
        MovementRestrictions.gravity(currentPlayer, currentMap);
        gameScreen.repaint();
    }
}
