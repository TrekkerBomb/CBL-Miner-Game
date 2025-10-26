package testminergame.sellmenu;

import javax.swing.*;

/**
 * Class for giving functioning responses to buttons.
 */
public class RespondButton {
    public boolean gamePanelVisible;

    public RespondButton() {
        this.gamePanelVisible = true;
    }
    
    /**
     * Switches visibility and focus of input to the different JPanels.
     * Also stores which panel is visible.
     * @param gamePanel the main JPanel of the game.
     * @param gameVisible if the main JPanel is visible before calling this method.
     * @param sellScreen the panel with the sell menu of the game.
     */
    public void changeMenuVisible(JPanel gamePanel, boolean gameVisible, SellMenu sellScreen) {
        sellScreen.setVisible(gameVisible);
        if (gameVisible) {
            sellScreen.requestFocus(gameVisible);
        }
        
        if (!gameVisible) {
            gamePanel.requestFocus();
        }
        gamePanel.setVisible(!gameVisible);
        
        this.gamePanelVisible = !gameVisible;
    }
}
