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
import  java.applet.*;
import java.awt.Graphics;
import javax.swing.JFrame;
public class Thickness extends Applet{
    public void paint(Graphics g){
        g.drawLine(10,10,70,30);
        g.drawLine(11,11,71,31);
    }
}
