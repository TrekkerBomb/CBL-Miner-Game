package testminergame.sellmenu;

import java.awt.Color;
import javax.swing.*;

/**
 * Menu to sell and buy ores.
 */
public class SellMenu extends JPanel {
    JButton copperB = new JButton("Sell your copper");
    JButton diamondB = new JButton("Sell your diamonds");
    JButton goldB = new JButton("Sell your gold");
    JButton ironB = new JButton("Sell your iron");
    JButton platinumB = new JButton("Sell your platinum");
    JButton stoneB = new JButton("Sell your stone");
    JButton airB = new JButton("Check your performance");

    /**
     * Initializes the menu.
     */
    public SellMenu() {
        this.setBounds(50, 50, 620, 980);
        this.setBackground(Color.black);
        this.setVisible(false); //Don't want to conflict with the gamePanel
        this.setFocusable(true);

        this.add(copperB);
        this.add(diamondB);
        this.add(goldB);
        this.add(ironB);
        this.add(platinumB);
        this.add(stoneB);
        this.add(airB);
    }
}
