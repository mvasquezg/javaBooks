/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 07: Arrays and ArrayList Object.
  *Programa 03: Third Array with values and one constant.
*/

public class ThirdArray{
    public static void main(String[] args){
        final int LENGTH_ARRAY=10;
        int[] arrayNumber= new int [LENGTH_ARRAY];

        for(int i=0; i<arrayNumber.length; i++){
            arrayNumber[i]= 2+2*i;
        }

        System.out.printf("%s%8s\n", "Indice", "Valor");
        for(int i=0; i<arrayNumber.length; i++){
            System.out.printf("%5d%8d\n", i, arrayNumber[i]);
        }
    }//end main
}//end ThirdArray