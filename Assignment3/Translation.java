/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

/**
 *
 * @author user
 */
import java.applet. *; 
import java.awt.*;
public class Translation extends Applet{
      int x1=10, x2=80, y1=10, y2=10, y3=60,x3=80, x4=10,y4=60, tx=10, ty=10; 
      public void paint(Graphics g){
        g.drawLine(x1,y1,x2,y2); 
        g.drawLine(x2,y2,x3,y3);
        g.drawLine(x3,y3,x4,y4); 
        g.drawLine(x4,y4,x1, y1); 
        g.drawLine(x1+tx,y1+ty,x2+tx,y2+ty); 
        g.drawLine(x2+tx,y2+ty,x3+tx,y3+ty); 
        g.drawLine(x3+tx,y3+ty,x4+tx, y4+ty); 
        g.drawLine(x4+tx,y4+ty,x1+tx,y1+ty);
}
}
