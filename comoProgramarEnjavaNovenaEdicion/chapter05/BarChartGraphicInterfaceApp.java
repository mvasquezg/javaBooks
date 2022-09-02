/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 21: Print the Bar Chart with Interface Graphic. 
*/
import java.awt.Toolkit;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class BarChartGraphicInterfaceApp extends JFrame{
    
    public static void main(String[] args){
        Toolkit screenComputer=Toolkit.getDefaultToolkit();
        Dimension sizeScreen=screenComputer.getScreenSize();

        BarChartGraphicInterface objBarChart;
        

        int number1=0, number2=0, number3=0, number4=0, number5=0, height=sizeScreen.height, width=sizeScreen.width;
        JFrame frame=new JFrame("Graficas de Numeros");

        do{
            number1=Integer.parseInt(JOptionPane.showInputDialog("1.-Ingrese un numero entre 1 y 30: "));
        }while(number1<=0 || number1>30);

        do{
            number2=Integer.parseInt(JOptionPane.showInputDialog("2.-Ingrese un numero entre 1 y 30: "));
        }while(number2<=0 || number2>30);

        do{
            number3=Integer.parseInt(JOptionPane.showInputDialog("3.-Ingrese un numero entre 1 y 30: "));
        }while(number3<=0 || number3>30);

        do{
            number4=Integer.parseInt(JOptionPane.showInputDialog("4.-Ingrese un numero entre 1 y 30: "));
        }while(number4<=0 || number4>30);
        
        do{
            number5=Integer.parseInt(JOptionPane.showInputDialog("5.-Ingrese un numero entre 1 y 30: "));
        }while(number5<=0 || number5>30);

        objBarChart=new BarChartGraphicInterface (number1, number2, number3, number4, number5, width/4, height/4);

        frame.add(objBarChart);
        frame.setSize(width/2, height/2);
        frame.setLocation(width/4, height/4);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }//end main    

}//end BarChartGraphicInterfaceApp