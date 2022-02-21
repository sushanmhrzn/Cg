/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coordinates;

/**
 *
 * @author user
 */
import java.awt.*;
import javax.swing.JFrame;

public class GraphicsMointer extends Canvas {

    public void paint(Graphics g) {
        setBackground(Color.white);
        setForeground(Color.black);
        g.drawString("Computer Graphics", 50, 50);

        g.fillRect(50, 80, 250, 200);
        g.fillOval(125, 280, 100, 30);
        g.setColor(Color.blue);
        g.fillRect(55, 85, 240, 190);
        g.setColor(Color.white);
        g.drawLine(200, 105, 240, 190);
        g.drawLine(200, 105, 160, 190);
        g.drawLine(160, 190, 240, 190);
        g.drawLine(200, 230, 240, 125);
        g.drawLine(200, 230, 160, 125);
        g.drawLine(160, 125, 240, 125);
        g.drawString("TU", 190, 165);
    }

    public static void main(String[] args) {
        GraphicsMointer m = new GraphicsMointer();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(400, 400);
        //f.setLayout(null);  
        f.setVisible(true);
    }

}
