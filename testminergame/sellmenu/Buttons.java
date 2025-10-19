package testminergame.sellmenu;

import javax.swing.*;

public class Buttons extends JFrame {
    JPanel sellMenu;
    
    public Buttons(JFrame frame) {
        sellMenu = new JPanel();
        sellMenu.setBounds(1, 1, 100, 50);
        sellMenu.add(new JButton("Button 1"));
        sellMenu.setVisible(true);
        frame.add(sellMenu);
    }
}
