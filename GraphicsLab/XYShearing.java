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
import java.applet. *;
import java.awt. *;
public class XYShearing extends Applet{
int x1=30, y1=30, x2=100, y2=30, x3=100, y3=80, x4=30, y4=80, shx=2,shy=2;
public void paint(Graphics g){
g.drawLine(x1,y1,x2,y2);
g.drawLine(x2,y2,x3,y3);
g.drawLine(x3,y3,x4,y4);
g.drawLine(x4,y4,x1, y1);
x1=x1+shx*y1;
x2=x2+shx*y2;
x3=x3+shx*y3;
x4=x4+shx*y4;
y1=x1+shy*y1;
y2=x2+shy*y2;
y3=x3+shy*y3;
y4=x4+shy*y4;
g.drawLine(x1,y1,x2,y2);
g.drawLine(x2,y2,x3,y3);
g.drawLine(x3,y3,x4,y4);
g.drawLine(x4,y4,x1, y1);
}
}
