/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicTransformation;

import java.awt.Canvas;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author user
 */
public class Scaling_Fixed_Point extends Canvas{
//for matrix multiplication
    public static int[][] multiply(int[][] m1, int[][] m2 ) {
	int[][] product = new int[3][3];
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
 	int [][] obj= {{10,100,55},
 		       {10,10,55},
 		       {1,1,1}};
	int [][] obj_ = new int[3][3];
	//display co-ordinates to graph co-ordiate
     	for (int i=0;i<3;i++){
     		obj_[0][i]= xc + obj[0][i];

obj_[1][i]= yc - obj[1][i];
         	}
     	//drawing the object triangle
        g.drawPolygon(obj_[0],obj_[1],3);
 	
 	
	 int[][] T1={ {1, 0, -10}, 
	 	      {0, 1, -10}, 
	 	      {0, 0, 1} 
	 	    };
	 int[][] Ts={ {2, 0, 0}, 
	 	      {0, 2, 0}, 
	 	      {0, 0, 1} 
	 	    };
	 int[][] T2={ {1, 0, 10}, 
	 	      {0, 1, 10}, 
	 	      {0, 0, 1} 
	 	    };
	 int[][] cm=multiply(T2,multiply(Ts,T1));
	 
	 int[][] img=multiply(cm,obj);
	 int [][] img_ = new int[3][3];
	 //display co-ordinates to graph co-ordiate
     	for (int i=0;i<3;i++){
     		img_[0][i]= xc + img[0][i];
     		img_[1][i]= yc - img[1][i];
         	}
         	
         //drawing the image triangle
        g.setColor(Color.blue);
        g.drawPolygon(img_[0],img_[1],3); 
               
    } 
     
        public static void main(String[] args) {  
        Scaling_Fixed_Point m = new Scaling_Fixed_Point();  

        JFrame f=new JFrame("Fixed point Scaling");
        f.add(m);  
        f.setSize(400,400);  
        f.setVisible(true);
}  

}
