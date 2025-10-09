import javax.swing.*;
import java.awt.*;


/**
 * .
 */


class Window extends JPanel {
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // wat doet g hier?
    }
    
}

public class GameWindow {


    Window window;

    void buildGUI() {

        JFrame gameWindow = new JFrame("Game Window");

        window = new Window();
        
    }
    

}
