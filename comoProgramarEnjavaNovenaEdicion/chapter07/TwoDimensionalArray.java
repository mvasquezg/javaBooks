/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 07: Arrays and ArrayList Object.
  *Programa 12: Two-Dimensional array.
*/

public class TwoDimensionalArray{
    public static void main(String[] args){
        int[][] arrayNumber1={{1, 2, 3}, {4, 5, 6}};
        int[][] arrayNumber2={{1, 2}, {3}, {4, 5, 6}}; 

        System.out.println("Los valores del arreglo1 por filas son: ");
        printArray(arrayNumber1);

        System.out.println("\nLos valores del arreglo2 por filas son: ");
        printArray(arrayNumber2);               
    }//end main

    public static void printArray(int[][] arrayNumber){
        for(int row=0; row<arrayNumber.length; row++){
            for(int column=0; column<arrayNumber[row].length; column++){
                System.out.printf("%d ", arrayNumber[row][column]);
            }
            System.out.println();
        }
    }
}//end TwoDimensionalArray