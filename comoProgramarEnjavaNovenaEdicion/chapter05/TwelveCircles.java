/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 11: Print Twelve circles, using graphic interface with the library awt and swing. 
*/

import java.awt.Graphics;
import javax.swing.JPanel;

public class TwelveCircles extends JPanel{
  public final int VALUE_BY_DOUBLE=20; 

  int radio=10;
  int width;
  int height;

  public TwelveCircles(int width, int height){
   this.width=width;
   this.height=height;
  } 

  public void paintComponent(Graphics g){
         
    for(int i=1; i<=12; i++){
        
        if(i==1){
          g.drawOval(width-(i*radio), height-(i*radio), radio+(i*VALUE_BY_DOUBLE), radio+(i*VALUE_BY_DOUBLE));
        }else{
            g.drawOval(width-(i*radio), height-(i*radio), radio+(i*VALUE_BY_DOUBLE), radio+(i*VALUE_BY_DOUBLE));
        }
        
    }
    
  }

}//end TwelveCircle