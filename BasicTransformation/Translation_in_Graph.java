package BasicTransformation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.awt.*;  
import javax.swing.JFrame;  
  
public class Translation_in_Graph extends Canvas{  
    
 
    public void paint(Graphics g) {  
        setBackground(Color.white); 
        setForeground(Color.black);   
 	//draw x-axis
 	g.drawLine(0,getHeight()/2,getWidth(),getHeight()/2);
 	// draw y-axis
 	g.drawLine(getWidth()/2,0,getWidth()/2,getHeight());
 	// find center of the graph
 	int xc=getWidth()/2,yc=getHeight()/2;
 	//co-ordinates of the triangle
 	int [] x= {10,100,55};
 	int [] y= {10,10,100};
	
	//display co-ordinates to graph co-ordiate
     	for (int i=0;i<3;i++){
     	x[i]= xc + x[i];
     	y[i]= yc - y[i];
     	}
     	//drawing the triangle
        g.fillPolygon(x,y,3);
	//translation vector
	int tx=-200,ty=0;
        for (int i=0;i<3;i++){
     	x[i]= tx + x[i];
     	y[i]= -ty + y[i];
     	}

        g.setColor(Color.blue);
        g.fillPolygon(x,y,3);  
	 
 	    
        
    } 
     
        public static void main(String[] args) {  
        Translation_in_Graph m=new Translation_in_Graph();
         JFrame f = new JFrame();
        f.add(m);
        f.setSize(400, 400);
        f.setVisible(true);
        }
}
