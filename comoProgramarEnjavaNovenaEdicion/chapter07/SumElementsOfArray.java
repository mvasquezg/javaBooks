/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 07: Arrays and ArrayList Object.
  *Programa 04: Sum of elements from array
*/

public class SumElementsOfArray{
    public static void main(String[] args){
        int[] arrayNumber={87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int sumTotal=0;

        for(int i=0; i<arrayNumber.length; i++){
            sumTotal+=arrayNumber[i];
        }

        System.out.printf("Suma total de los elementos del arreglo: %d\n", sumTotal);
    }//end main
}//end SumElementsOfArray