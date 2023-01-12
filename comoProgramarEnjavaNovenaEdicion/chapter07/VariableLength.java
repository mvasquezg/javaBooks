/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 07: Arrays and ArrayList Object.
  *Programa 14: Parameters of variable length.
*/

public class VariableLength{
    public static double average(double... numbers){
        double total=0.0;

        for(double d: numbers){
            total+=d;
        }

        return total/numbers.length;
    }

    public static void main(String[] args){
        double d1=10.0;
        double d2=20.0;
        double d3=30.0;
        double d4=40.0;

        System.out.printf("d1 = %.1f\nd2 = %.1f\nd3 = %.1f\nd4 = %.1f\n\n", d1, d2, d3, d4);
        System.out.printf("El promedio de d1 y d2 = %.1f\n", average(d1, d2));
        System.out.printf("El promedio de d1, d2 y d3 = %.1f\n", average(d1, d2, d3));
        System.out.printf("El promedio de d1, d2, d3 y d4 = %.1f\n", average(d1, d2, d3, d4));
    }//end main

}//end VariableLength