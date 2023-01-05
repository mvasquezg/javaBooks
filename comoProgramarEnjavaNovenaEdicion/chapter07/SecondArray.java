/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 07: Arrays and ArrayList Object.
  *Programa 02: Second Array with values.
*/
public class SecondArray{
    public static void main(String[] args){
        int[] arrayNumber={32, 27, 64, 18, 95, 14, 90, 70, 60, 37}; 
        
        System.out.printf("%s%8s\n", "Indice", "Valor");
        
        for(int i=0; i<arrayNumber.length; i++){
            System.out.printf("%5d%8s\n", i, arrayNumber[i]);
        }

    }//end main
}//end SecondArray