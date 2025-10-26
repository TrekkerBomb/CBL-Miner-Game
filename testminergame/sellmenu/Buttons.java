package testminergame.sellmenu;

import java.awt.event.*;
import javax.swing.*;
import testminergame.GamePanel;

/**
 * Adds buttons to the game.
 */
public class Buttons extends JPanel {
    private static final int BUTTONHEIGHT = 50;
    private static final int BUTTONWIDTH = 100; 
    private final JButton newButton;
    private boolean gVisible;
    
    /**
     * Constructs buttons.
     */
    public Buttons(GamePanel gamePanel, SellMenu sellS, RespondButton repBut) {
        this.gVisible = true;
        this.setBounds(2, 0, BUTTONWIDTH, BUTTONHEIGHT);
        newButton = new JButton("Switch Menu");
        this.add(newButton);
        newButton.addActionListener((ActionEvent e) -> {
            repBut.changeMenuVisible(gamePanel, gVisible, sellS);
            gVisible = repBut.gamePanelVisible;
            if (gVisible) {
                gamePanel.requestFocus();
            }
        });
        
    }
}
