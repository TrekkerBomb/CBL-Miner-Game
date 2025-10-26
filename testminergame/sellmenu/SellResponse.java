package testminergame.sellmenu;

import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import testminergame.player.Inventory;

/**
 * Adds responses to the SellMenu Buttons.
 */
public class SellResponse {

    /**
     * Connects sell response to the corresponding button. 
     * @param sellButton specified button in SellMenu.
     * @param inv Global inventory to be altered.
     */
    public static void setSellButton(JButton sellButton, Inventory inv) {
        String infoMessage = "You haven't mined enough blocks to sell";
        String keyB = sellButton.getText();

        sellButton.addActionListener((ActionEvent e) -> {
            int valB = inv.getValue(keyB);
            
            if (valB > 0) {
                inv.put("Money", (inv.getValue("Money") + valB));
                inv.put(keyB, 0);
            } else {
                JOptionPane.showMessageDialog(null, infoMessage, "No Blocks", 1);
            }
        });
    }

    /**
     * Displays status, aka current money and Blocks broken.
     * @param statusButton Button inserted from SellMenu.
     * @param inv Global inventory, based on Map.
     */
    public static void setStatusButton(JButton statusButton, Inventory inv) {
        String keyM = "Money";
        String keyAir = "Air";

        statusButton.addActionListener((ActionEvent e) -> {
            int valM = inv.getValue(keyM);
            int valAir = inv.getValue(keyAir);
            String message = "You have " + valM + "to spend. \n You have pointlessly mined "
                + valAir + " times"; 
            JOptionPane.showMessageDialog(null, message, "Status", 1);
        });
    }
}
