/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicTransformation;

import java.awt.Color;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author user
 */
public class RotationAboutFixedPoint extends Canvas{
        public static double[][] multiply(double[][] m1, double[][] m2 ) {
	double[][] product = new double[3][3];
	for(int i = 0; i < 3; i++) {
	    for (int j = 0; j < 3; j++) {
	        for (int k = 0; k < 3; k++) {
	            product[i][j] += m1[i][k] * m2[k][j];
	        }
	    }
	}

	return product;
    }

 
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
 	double [][] obj= {{10,100,55},
 		       {10,10,55},
 		       {1,1,1}};
	int [][] obj_ = new int[3][3];
	//display co-ordinates to graph co-ordiate
     	for (int i=0;i<3;i++){
     		obj_[0][i]=(int)(xc + obj[0][i]);
                obj_[1][i]=(int)(yc - obj[1][i]);
         	}
     	//drawing the object triangle
        g.drawPolygon(obj_[0],obj_[1],3);
 	int theta_d=180;
	double theta_r=Math.toRadians(theta_d);
	 double[][] T1={ {1, 0, -55}, 
	 	      {0, 1, -55}, 
	 	      {0, 0, 1} 
	 	    };
	 double[][] Tr={ {Math.cos(theta_r),-Math.sin(theta_r), 0}, 
	 	      {Math.sin(theta_r), Math.cos(theta_r), 0}, 
	 	      {0, 0, 1} 
	 	    };
	 double[][] T2={ {1, 0, 55}, 
	 	      {0, 1, 55}, 
	 	      {0, 0, 1} 
	 	    };
	 double[][] cm=multiply(T2,multiply(Tr,T1));
	 
	 double[][] img=multiply(cm,obj);
	 int [][] img_ = new int[3][3];
	 //display co-ordinates to graph co-ordiate
     	for (int i=0;i<3;i++){
     		img_[0][i]=(int)(xc + img[0][i]);
     		img_[1][i]=(int)(yc - img[1][i]);
         	}
         	
         //drawing the image triangle
        g.setColor(Color.blue);
        g.drawPolygon(img_[0],img_[1],3); 
               
    } 
     
        public static void main(String[] args) {  
        RotationAboutFixedPoint m = new RotationAboutFixedPoint();  

        JFrame f=new JFrame("Fixed point Scaling");
        f.add(m);  
        f.setSize(400,400);  
        f.setVisible(true);
}  
}
