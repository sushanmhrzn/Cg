/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicTransformation;

import java.awt.Canvas;
import java.awt.*;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class ScalingInGraph extends Canvas{
    public void paint(Graphics g){
        setBackground(Color.white); 
        setForeground(Color.black);   
 	//draw x-axis
 	g.drawLine(0,getHeight()/2,getWidth(),getHeight()/2);
 	// draw y-axis
 	g.drawLine(getWidth()/2,0,getWidth()/2,getHeight());
 	// find center of the graph
 	int xc=getWidth()/2,yc=getHeight()/2;
 	//co-ordinates of the triangle
        int[] x = { 10, 100, 10 };
        int[] y = { 10, 10, 100 };
        int[] x1 = { 0, 0, 0 };
        int[] y1 = { 0, 0, 0 };
        for (int i = 0; i < 3; i++) {
            x1[i] = xc + x[i];
            y1[i] = yc - y[i];
        }

        g.drawPolygon(x1, y1, 3);
       int sx = 2, sy =2;
        for (int i = 0; i < 3; i++) {
            x[i] =sx*x[i];
            y[i] = sy*y[i];
        }
        for (int i = 0; i < 3; i++) {
            x1[i] = xc + x[i];
            y1[i] = yc - y[i];
        }
        g.setColor(Color.yellow);
        g.drawPolygon(x1, y1, 3);
    }
    public static void main(String[] args) {
        ScalingInGraph m=new ScalingInGraph();
      JFrame f = new JFrame();
        f.add(m);
        f.setSize(400, 400);
        f.setVisible(true);   
    }
}
