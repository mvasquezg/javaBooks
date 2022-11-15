
/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 08: Method Overloading
*/

public class MethodOverloading{
    public static void main(String[] args){
        System.out.println("El cuadrado del entero 7 es: "+sqrt(7));
        System.out.println("El cuadrado del double 7.5 es: "+sqrt(7.5));
    }

    public static int sqrt(int intValue){
        System.out.print("Se llamo a cuadrado con argumento int: "+intValue);
        return intValue*intValue;
    }//end sqrt int

    public static double sqrt(double doubleValue){
        System.out.print("Se llamo a cuadrado con argumento int: "+doubleValue);
        return doubleValue*doubleValue;
    }//end sqrt

}//end MethodOverloading