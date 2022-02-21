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
import java.awt.*;
import java.applet.*;
/*<applet code="Hello" width="300" height="250">
</applet>*/
public class HelloWorld extends  Applet{
    public void init(){
        setForeground(Color.red);
        Font f=new Font("Arial",Font.BOLD,18);
        setFont(f);
    }
    public void paint(Graphics g){
        g.drawString("HelloWorld", 20, 20);
    }
}
