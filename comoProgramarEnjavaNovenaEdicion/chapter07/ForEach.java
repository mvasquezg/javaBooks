/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 07: Arrays and ArrayList Object.
  *Programa 09: For each.
*/

public class ForEach{
    public static void main(String[] args){
        int[] arrayNumber={87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total=0;

        for(int number: arrayNumber){
            total+=number;
        }

        System.out.println("Total de la suma de numeros: "+total);
    }//end main
}//end ForEach