/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 13: Calculate x value with method of class Math.
*/

public class ValueXMethodMath{
    public static void main(String[] args){
        double x=7.5;

        System.out.println("Funcion abs de x cuando vale: "+x+" = "+Math.abs(x));

        System.out.println("Funcion floor de x cuando vale: "+x+" = "+Math.floor(x));

        x=0.0;
        System.out.println("Funcion abs de x cuando vale: "+x+" = "+Math.abs(x));

        System.out.println("Funcion ceil de x cuando vale: "+x+" = "+Math.ceil(x));

        x=-6.4;
        System.out.println("Funcion abs de x cuando vale: "+x+" = "+Math.abs(x));

        System.out.println("Funcion ceil de x cuando vale: "+x+" = "+Math.ceil(x));
        
        System.out.println("Math.ceil(-Math.abs(-8 + Math.floor(-5.5)))):  = "+Math.ceil(-Math.abs(-8 + Math.floor(-5.5))));


    }//end main
}//end ValueXMethodMath