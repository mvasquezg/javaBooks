/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 18: Sets of Numbers
*/
import java.util.Random;

public class SetsOfNumbers{
    public static void main(String[] args){
        Random number=new Random();

        System.out.println("Valor al azar del conjunto de numeros: 2, 4, 6, 8, 10");
        System.out.println(number.nextInt(8-2)*2);
        
        System.out.println("Valor al azar del conjunto de numeros: 3, 5, 7, 9, 11");
        int number1=0;
        while(number1%2==0){
          number1=(number.nextInt(11))+1;
        }
        System.out.println(number1);

        System.out.println("Valor al azar del conjunto de numeros: 6, 10, 14, 18, 22");
        int number2=1;

        while(number2%4!=2){
          
          number2=(number.nextInt(22-6))+6;

          if(number2==6){
            break;
          }else if(number2>6 && number2%4==2){
            break;
          }else{
            number2=(number.nextInt(22-6))+6;
          }
        }

        System.out.println(number2);
        

    }//end main
}//end SetsOfNumbers