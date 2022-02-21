/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicTransformation;

/**
 *
 * @author user
 */
import java.awt.*;
import java.util.*;
import javax.swing.JFrame;

public class RotationInGraph extends Canvas{
    public void paint(Graphics g){
        Scanner s=new Scanner(System.in);
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
        double c;
        System.out.println("Enter angle");
        c=s.nextDouble();
        double cos=Math.cos(c*3.14/180);
        double sin=Math.sin(c*3.14/180);
        System.out.println(cos+"  "+sin);
        for (int i = 0; i < 3; i++) {
            int a,b;
            a=x[i];
            b=y[i];
            x[i] =(int) Math.floor(cos*a+b*sin);
            y[i] =(int) Math.floor(-sin*a+cos*b);
        }for (int i = 0; i < 3; i++) {
             System.out.println(x[i]+"  "+y[i]);;
        }
        for (int i = 0; i < 3; i++) {
            x[i] = xc + x[i];
            y[i] = yc - y[i];
        }
//        for (int i = 0; i < 3; i++) {
//             System.out.println(x[i]+"  "+y[i]);
//        }
        g.setColor(Color.DARK_GRAY);
        g.drawPolygon(x, y, 3);
    }
    public static void main(String[] args) {
     RotationInGraph m=new RotationInGraph();
     JFrame f = new JFrame();
     f.add(m);
     f.setSize(400, 400);
     f.setVisible(true);   

    }
}
