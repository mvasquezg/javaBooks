/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Programa 39: World Population.
*/

public class WorldPopulation{
    public static void main(String[] args){
        int year=2022;
        long population=7960431000L;
        double percent=0.10f;
        int i=1;
        System.out.println("Indice\t\tAnho(s)\\ttPoblacion");

        while(i<=75){
            System.out.println(i+"\t\t"+(year+i)+"\t\t"+(population*percent));
            i++;
            percent=percent+0.01;
        }
    }//end main
}//end WorldPopulation
