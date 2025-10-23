package testminergame.sellmenu;

import java.awt.*;
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
        newButton = new JButton("Button 1");
        this.add(newButton);
        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repBut.changeMenuVisible(gamePanel, gVisible, sellS);
                gVisible = repBut.gamePanelVisible;
                if (gVisible) {
                    gamePanel.requestFocus();
                }
                //sellS.setVisible(repBut.gamePanelVisible);
            }
        });
        
    }

    /**
     * Draws buttons.
     */
    public void drawButton(Graphics g) {
        g.setColor(Color.PINK);
        g.fillRect(1, 1, BUTTONWIDTH, BUTTONHEIGHT);
        g.setColor(Color.BLACK);
        g.drawRect(1, 1, BUTTONWIDTH, BUTTONHEIGHT);
    }
}
