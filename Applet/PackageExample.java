package Applet;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PackageExample extends Applet implements MouseListener {
    int x1, y1, x2, y2; 

    public void init() {
        addMouseListener(this); 
    }
    public void mousePressed(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();
        showStatus("Mouse Pressed at " + x1 + "," + y1); 
        repaint(); 
    }

    public void mouseReleased(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();
        repaint();
    }

    public void mouseClicked(MouseEvent e) {}  
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public void paint(Graphics g) {
        g.drawString("Pressed at: (" + x1 + ", " + y1 + ")", x1, y1);
        g.drawString("Released at: (" + x2 + ", " + y2 + ")", x2, y2);
    }
}