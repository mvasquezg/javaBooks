/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Programa 27: Frame Asterisk, slide from 1 to 20.
*/
import java.util.Scanner;

public class FrameAsterisk{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num=0, x=1, y=1;

        System.out.print("Ingresa un numero entre 1 y 20 para dibujar el cuadrado: ");
        num=in.nextInt();

        while(num!=0 && (num<1 || num>20)){
            System.out.print("Ingresa un numero entre 1 y 20 para dibujar el cuadrado: ");
            num=in.nextInt();
        }
        
        System.out.println("Formar un cuadro de: "+num+" * "+num);
        
        while(x<=num){
            while(y<=num){
                if(x==1 || x==num){
                    System.out.print("*");    
                }else{
                    if(y==1){
                        System.out.print("*");   
                    }else if(y>1 && y<num){
                        System.out.print(" ");
                    }else if(y==num){
                        System.out.print("*");
                    }  
                }
                y++;
            }
            System.out.println();    
            y=1;
            x++;
        }
        System.out.println();
    }//end main
}//end FrameAsterisk