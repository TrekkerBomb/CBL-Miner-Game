package testminergame.mining;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Gets the x and y coördinate of the clicked point.
 */
public class MouseInputHandler implements MouseListener {

    Point mousePoint = new Point();
    boolean allowDestroy = false;

    public Point getMousePoint() {
        return this.mousePoint;
    }

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseClicked(MouseEvent e) {

        this.mousePoint = e.getPoint();
        this.allowDestroy = true;
    }
    
}
