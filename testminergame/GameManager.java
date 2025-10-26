package testminergame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import testminergame.mining.BlockDestroyer;
import testminergame.mining.MouseInputHandler;
import testminergame.player.Inventory;
import testminergame.player.KeyInputHandler;
import testminergame.player.Player;
import testminergame.sellmenu.Buttons;
import testminergame.sellmenu.RespondButton;
import testminergame.sellmenu.SellMenu;


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
    private Buttons buttonBar;
    private Buttons buttonBar2;
    private Inventory inventory;
    private boolean gVisible;
    private SellMenu sellScreen;
    private RespondButton repBut;

    /**
     * This constructor is calles when the game is started.
     */
    GameManager() {

        this.currentMap = new MapGame();
        this.currentPlayer = new Player();
        this.inputHandler = new KeyInputHandler();
        this.mouseInputH = new MouseInputHandler();
        this.blockDest = new BlockDestroyer();
        this.inventory = new Inventory();
        this.gVisible = true;
        this.sellScreen = new SellMenu(inventory);

        this.gameScreen = new GamePanel(currentMap, currentPlayer);
        GameWindow gameWin = new GameWindow();
        
        this.repBut = new RespondButton();
        this.buttonBar = new Buttons(this.gameScreen, this.sellScreen, this.repBut);
        this.buttonBar2 = new Buttons(this.gameScreen, this.sellScreen, this.repBut);

        gameWin.integratePanel(this.gameScreen);
        gameScreen.add(buttonBar);
        gameWin.integratePanel(this.sellScreen);
        sellScreen.add(buttonBar2);
        gameScreen.setComponentZOrder(buttonBar, 0);
        sellScreen.setComponentZOrder(buttonBar2, 0);
        gameScreen.requestFocus();
        
        gameScreen.addMouseListener(mouseInputH);
        gameScreen.addKeyListener(inputHandler);

        this.timer = new Timer(16, this);
        timer.start();
    }

    void pauseGame() {
        this.timer.stop();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        currentPlayer.movePlayer(inputHandler.getMovement());

        blockDest.damageBlock(currentMap, currentPlayer, mouseInputH, inventory);

        //this.gVisible = ;
        //buttonBar.setVisible(this.gVisible);

        gameScreen.repaint();
        buttonBar.revalidate();
    }
}
