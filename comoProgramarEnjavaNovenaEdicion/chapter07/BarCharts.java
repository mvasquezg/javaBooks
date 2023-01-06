/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 07: Arrays and ArrayList Object.
  *Programa 05: Bar charts.
*/

public class BarCharts{
    public static void main(String[] args){
        int[] arrayNumber={0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

        System.out.println("Distribucion de calificaciones:");

        for(int i=0; i<arrayNumber.length; i++){
            if(i==10){
                System.out.printf("%5d: ", 100);
            }else{
                System.out.printf("%02d-%02d: ", (i*10), (i*10+9));
            }

            for(int j=0; j<arrayNumber[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }//end main
}//end BarCharts