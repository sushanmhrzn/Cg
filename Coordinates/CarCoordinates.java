/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coordinates;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author user
 */
public class CarCoordinates extends Canvas {

    public void paint(Graphics g) {
        setBackground(Color.white);
        setForeground(Color.orange);
        g.fillRect(50, 50, 200, 100);
       g.setColor(Color.black);
        g.drawLine(250, 80, 300, 80);
        g.drawLine(300, 80, 350, 120);
        g.drawLine(350, 120, 350, 150);
        g.drawLine(350, 150, 250, 150);
        g.setColor(Color.BLACK);
        g.fillOval(200, 140, 40, 40);    
        g.fillOval(65, 140,40,40);
        g.fillOval(280, 140, 40, 40);
        g.setColor(Color.WHITE);
        g.fillRect(70, 70, 104, 30);
        g.setColor(Color.black);
        g.drawLine(74, 72, 84, 72);
        g.drawLine(74, 72, 74, 82);
        g.drawLine(74, 82,84,82);
        g.drawLine(84,82,84,92);
        g.drawLine(84,92,74,92);
        g.drawLine(89, 72, 89, 92);
        g.drawLine(89, 92,104,92);
        g.drawLine(104,92,104, 72);
        g.drawLine(108,72,118, 72);
        g.drawLine(108,72,108, 82);
        g.drawLine(108,82,118, 82);
        g.drawLine(118,82,118, 92);
        g.drawLine(118, 92,108,92);
        g.drawLine(122, 72,122, 92);
        g.drawLine(122,82, 134, 82);
        g.drawLine(134,72, 134, 92);
        g.drawLine(147, 72, 140, 92);
        g.drawLine(147, 72, 154, 92);
        g.drawLine(143, 82, 151, 82);
        g.drawLine(158, 72,158,92);
        g.drawLine(158,72,170,92);
        g.drawLine(170, 92, 170, 72);
    }

    public static void main(String[] args) {
        CarCoordinates m = new CarCoordinates();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
