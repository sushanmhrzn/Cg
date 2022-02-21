/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicTransformation;
import java.awt.*;
import javax.swing.JFrame;
/**
 *
 * @author user
 */
public class BasicTranslation extends Canvas{

    public void paint(Graphics g){
        setBackground(Color.white);
        setForeground(Color.BLACK);
        int x1=120,y1=50,x2=50,y2=100,x3=200,y3=100;
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2,x3,y3);
        g.drawLine(x3, y3, x1, y1);
        int t1=30,t2=100;
        x1+=t1;
        y1+=t2;
        x2+=t1;
        y2+=t2;
        x3+=t1;
        y3+=t2;
        g.setColor(Color.red);
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2,x3,y3);
        g.drawLine(x3, y3, x1, y1);
    }
    
    public static void main(String[] args) {
        BasicTranslation m = new BasicTranslation();
        JFrame f = new JFrame("2D Translation");
        f.add(m);
        f.setSize(400, 400);
        //f.setLayout(null);  
        f.setVisible(true);
    }
}
