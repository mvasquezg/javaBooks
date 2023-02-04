/**
  *Book: Java in depth programming course
  *Chapter 01: Introduction to programming language.
  *Programa 15: Using Arrays Bidimentional.
*/
import java.util.Scanner;

public class ArrayBidementional{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int row=0;
        int column=0;
        int[][] arrayBidimentional; 

        System.out.print("Ingresa el numero de filas: ");
        row=in.nextInt();

        System.out.print("Ingresa el numero de columnas: ");
        column=in.nextInt();

        arrayBidimentional=new int[row][column];
        
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                arrayBidimentional[i][j]=(int) (Math.random()*1000);
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(arrayBidimentional[i][j]+"\t");
            }
            System.out.println();
        }

    }//end main
}//end ArrayBidementional