/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicTransformation;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class ReflectionAboutyMinusx extends Canvas{
     public void paint(Graphics g){
        Scanner s=new Scanner(System.in);
        setBackground(Color.white); 
        setForeground(Color.black);   
 	//draw x-axis
 	g.drawLine(0,getHeight()/2,getWidth(),getHeight()/2);
 	// draw y-axis
 	g.drawLine(getWidth()/2,0,getWidth()/2,getHeight());
        g.drawLine(0,0,getWidth(),getHeight());
 	// find center of the graph
 	int xc=getWidth()/2,yc=getHeight()/2;
 	//co-ordinates of the triangle
        int[] x = { 30, 100, 30 };
        int[] y = { 10, 10, 100 };
        int[] x1 = { 0, 0, 0 };
        int[] y1 = { 0, 0, 0 };
        for (int i = 0; i < 3; i++) {
            x1[i] = xc + x[i];
            y1[i] = yc - y[i];
        }

        g.fillPolygon(x1, y1, 3);

        for (int i = 0; i < 3; i++) {
            int a,b;
            a=x[i];
            b=y[i];
            x[i] =b*-1;
            y[i] =a*-1;
        }
         for (int i = 0; i < 3; i++) {
            x[i] = xc + x[i];
            y[i] = yc - y[i];
        }
         for (int i = 0; i < 3; i++) {
           System.out.println(x[i]+" "+y[i]);
        }
         
        g.setColor(Color.blue);
        g.fillPolygon(x, y, 3);
        g.setColor(Color.black);
        for (int i = 0; i < 3; i++) {
           g.drawString("("+String.valueOf(x[i])+" "+String.valueOf(y[i])+")", x[i]-5, y[i]+5);
        }
        for (int i = 0; i < 3; i++) {
           g.drawString("("+String.valueOf(x1[i])+" "+String.valueOf(y1[i])+")", x1[i]-5, y1[i]+5);
        }
        
    }
    public static void main(String[] args) {
     ReflectionAboutyMinusx m=new ReflectionAboutyMinusx();
     JFrame f = new JFrame();
     f.add(m);
     f.setSize(400, 400);
     f.setVisible(true);   

    }
}
