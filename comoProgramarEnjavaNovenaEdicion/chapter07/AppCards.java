/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 07: Arrays and ArrayList Object.
  *Programa 08: Game of cards, Class AppCards.
*/
public class AppCards{
    public static void main(String[] args){
        PackageCards packetCards=new PackageCards();

        packetCards.shuffleCard();

        for(int i=1; i<=52; i++){
            System.out.printf("%-25s", packetCards.distributeCards());

            if(i%4==0){
                System.out.println();
            }
        }
    }//end main
}//end AppCards