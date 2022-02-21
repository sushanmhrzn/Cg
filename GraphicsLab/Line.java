/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphicsLab;

/**
 *
 * @author user
 */
import java.applet.*;
import java.awt.Graphics;

public class Line extends Applet{
    @Override
    public void paint(Graphics g){
        g.drawLine(10, 10, 50, 10);
        g.drawLine(10,10,10,50);
        g.drawLine(80,10,50,60);
        g.drawLine(70,20,120,60);
        
    }
    
}
