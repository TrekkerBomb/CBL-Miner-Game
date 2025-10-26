package testminergame.sellmenu;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;
import testminergame.player.Inventory;

/**
 * Menu to sell and buy ores.
 */
public class SellMenu extends JPanel {
    JButton copperB;
    JButton diamondB;
    JButton goldB;
    JButton ironB;
    JButton platinumB;
    JButton stoneB;
    JButton statsB;
    JButton toolB;

    /**
     * Initializes the menu.
     */
    public SellMenu(Inventory inv) {
        this.setBounds(50, 50, 620, 980);
        JLabel label = new JLabel("  Sell your blocks");
        label.setForeground(Color.YELLOW);
        this.add(label);
        this.setBackground(Color.black);
        this.setVisible(false); //Don't want to conflict with the gamePanel
        this.setFocusable(true);
        this.setLayout(new GridBagLayout());

        GridBagConstraints g = new GridBagConstraints();

        this.copperB = new JButton("Copper");
        g.gridx = 1;
        g.gridy = 1;
        g.gridwidth = 1;
        g.fill = GridBagConstraints.HORIZONTAL;
        this.add(this.copperB, g);
        SellResponse.setSellButton(this.copperB, inv);

        this.diamondB = new JButton("Diamond");
        g.gridx = 2;
        g.gridy = 1;
        g.gridwidth = 1;
        g.fill = GridBagConstraints.HORIZONTAL;
        this.add(this.diamondB, g);
        SellResponse.setSellButton(this.diamondB, inv);

        this.goldB = new JButton("Gold");
        g.gridx = 3;
        g.gridy = 1;
        g.gridwidth = 1;
        g.fill = GridBagConstraints.HORIZONTAL;
        this.add(goldB, g);
        SellResponse.setSellButton(this.goldB, inv);
        
        this.ironB = new JButton("Iron");
        g.gridx = 1;
        g.gridy = 3;
        g.gridwidth = 1;
        g.fill = GridBagConstraints.HORIZONTAL;
        this.add(this.ironB, g);
        SellResponse.setSellButton(this.ironB, inv);
        
        this.platinumB = new JButton("Platinum");
        g.gridx = 2;
        g.gridy = 3;
        g.gridwidth = 1;
        g.fill = GridBagConstraints.HORIZONTAL;
        this.add(this.platinumB, g);
        SellResponse.setSellButton(this.platinumB, inv);
        
        this.stoneB = new JButton("Stone");
        g.gridx = 3;
        g.gridy = 3;
        g.gridwidth = 1;
        g.fill = GridBagConstraints.HORIZONTAL;
        this.add(this.stoneB, g);
        SellResponse.setSellButton(this.stoneB, inv);
        
        this.statsB = new JButton("Check your performance");
        g.gridx = 1;
        g.gridy = 5;
        g.gridwidth = 3;
        g.fill = GridBagConstraints.HORIZONTAL;
        this.add(this.statsB, g);
        SellResponse.setStatusButton(this.statsB, inv);

        this.toolB = new JButton("Upgrade your Tool!");
        g.gridx = 1;
        g.gridy = 6;
        g.gridwidth = 3;
        g.fill = GridBagConstraints.HORIZONTAL;
        this.add(this.toolB, g);
        SellResponse.upgradeButton(this.toolB, inv);
    }
}
