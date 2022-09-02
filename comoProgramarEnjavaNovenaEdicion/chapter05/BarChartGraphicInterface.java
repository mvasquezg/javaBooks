/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 21: Print the Bar Chart with Interface Graphic. 
*/

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;


public class BarChartGraphicInterface extends JPanel{

    int number1, number2, number3, number4, number5, width, height;

    public BarChartGraphicInterface(int number1, int number2, int number3, int number4, int number5, int width, int height){
        this.number1=number1;
        this.number2=number2;
        this.number3=number3;
        this.number4=number4;
        this.number5=number5;
        this.height=height;
        this.width=width;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Font letterType=new Font("Courier", Font.BOLD, 14);
        g.setFont(letterType);
        g.drawString("Numero", width-(2*100), height-(2*56));
        g.drawString("Grafica", width, height-(2*56));

        g.drawString((number1<10?("0"+number1):(""+number1)), width-190, height-85);
        g.drawString((number2<10?("0"+number2):(""+number2)), width-190, height-60);
        g.drawString((number3<10?("0"+number3):(""+number3)), width-190, height-35);
        g.drawString((number4<10?("0"+number4):(""+number4)), width-190, height-10);
        g.drawString((number5<10?("0"+number5):(""+number5)), width-190, height+15);

        g.drawRect(width, height-95, number1*10, 12);
        g.drawRect(width, height-70, number2*10, 12);
        g.drawRect(width, height-45, number3*10, 12);
        g.drawRect(width, height-20, number4*10, 12);
        g.drawRect(width, height+05, number5*10, 12);

    }
        

}//end BarChartGraphicInterface