package testminergame.sellmenu;

import javax.swing.*;

/**
 * Class for giving functioning responses to buttons.
 */
public class RespondButton{
    public boolean gamePanelVisible;

    public RespondButton() {
        this.gamePanelVisible = true;
    }

    // Tips Hannah
    // 1. Component.requestFocus - werkt niet altijd
    // 2. SwingUtilities.runLater en dan requestFocus 
    //- misschien werkt het een paar milliseconden later wel.
    // 3. Als je hoofdpijn wil krijgen probeer dan KeyBindings voor Swing (is een rabbit hole).
    // 4. Lever de game op met een knop dat de game daarna niet meer werkt. is prima.
    // ik heb het gezien. het project moet af, tentamen gemaakt..
    
    /**
     * Switches visibility and focus of input to the different JPanels.
     * Also return a new value to store which panel is visible.
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
