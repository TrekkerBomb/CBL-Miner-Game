import javax.swing.*;
import java.awt.*;


/**
 * .
 */


class Window extends JPanel {
    
    @Override
    public void paintComponent(Graphics g) {
        paintComponent(g);
    }
    
}

public class GameWindow {

    JFrame gameWindow;
    Window window;

    void buildGUI() {

        gameWindow = new JFrame("Game Window");
        gameWindow.setSize(1280, 720);
        gameWindow.setVisible(true);
        window = new Window();
        
    }
    
    public static void main(String[] args) {
        new GameWindow().buildGUI();
    }

}
