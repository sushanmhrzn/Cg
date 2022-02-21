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
import java.applet.*;
import java.awt.*;
import static java.lang.Math.*;
public class Rotation extends Applet{
int x1=30, y1=30, x2=100, y2=30, x3=100, y3=80, x4=30, y4=80, angle=10;
public void paint(Graphics g){
g.drawLine(x1,y1,x2,y2);
g.drawLine(x2,y2,x3,y3);
g.drawLine(x3,y3,x4,y4);
g.drawLine(x4, y4,x1, y1);
double ra=(PI/180) * angle;
x1=(int)(x1*cos(ra)-y1* sin(ra));
y1=(int)(x1*sin(ra)+y1*cos(ra));
x2=(int)(x2* cos(ra)-y2*sin(ra));
y2=(int)(x2*sin(ra)+y2* cos(ra));
x3=(int)(x3* cos(ra)-y3* sin(ra));
y3=(int)(x3*sin(ra)+y3* cos(ra));
x4=(int)(x4*cos(ra)-y4* sin(ra));
y4=(int)(x4*sin(ra)+y4* cos(ra));
g.drawLine(x1, y1,x2,y2);
g.drawLine(x2,y2,x3,y3);
g.drawLine(x3,y3,x4,y4);
g.drawLine(x4,y4,x1, y1); 
}
}