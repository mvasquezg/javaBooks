/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 02: Introduction to apps in Java,
  *Program 19.- Show the separation of a number with five digits, with white spaces.
*/
import java.util.Scanner;

public class SeparationOfIntergers{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int number=0, tenThousand=0, thousand=0, hundred=0, ten=0, unit=0;
        
        System.out.print("Ingresa un numero de cinco cifras: ");
        number=in.nextInt();

        if(number>10000 && number<99999){

            tenThousand=number/10000;
            number=number%10000;
            
            thousand=number/1000;
            number = number%1000;

            hundred=number/100;
            number = number%100;

            ten=number/10;
            unit=number%10;

            System.out.println(tenThousand+" "+thousand+" "+hundred+" "+ten+" "+unit);

        }else{
            System.out.println("Numero debe estar comprendido entre 10 000 y 99 999");
        }

    }//end main

}//end SeparationOfIntegers