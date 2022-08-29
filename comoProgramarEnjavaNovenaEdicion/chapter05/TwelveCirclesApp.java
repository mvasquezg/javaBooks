/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 11: Print Twelve circles, using graphic interface with the library Toolki and Dimension. 
*/
import java.awt.Toolkit;
import java.awt.Dimension;  

import javax.swing.JFrame;

public class TwelveCirclesApp{
    
    public static void main(String[] args){
        Toolkit screenComputer=Toolkit.getDefaultToolkit();
        Dimension sizeScreen=screenComputer.getScreenSize();
        TwelveCircles circle;

        int height=sizeScreen.height;
        int width=sizeScreen.width;
        
        System.out.print("Programa que pinta 12 circulos concentricos. ");
               
        circle=new TwelveCircles(width/4, height/4);
   
        JFrame jFrame=new JFrame();
        jFrame.add(circle); 

        jFrame.setSize(width/2, height/2 );
        jFrame.setLocation(width/4, height/4);

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }//end main
}//end TwelveCircleApp 