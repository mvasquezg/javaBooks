/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 07: Arrays and ArrayList Object.
  *Programa 08: Game of cards, Class PackageCards.
*/
import java.util.Random;

public class PackageCards{
    private Cards[] arrayPacket;
    private int currentCard;
    private static final int NUMBER_OF_CARD=52;
    private static final Random RANDOM_NUMBERS=new Random();

    public PackageCards(){
        String[] arrayFaces={"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Joto", "Quina", "Rey"};
        String[] arraySticks={"Corazones", "Diamantes", "Treboles", "Espadas"};

        arrayPacket=new Cards[NUMBER_OF_CARD];
        currentCard=0;

        for(int i=0; i<arrayPacket.length;i++){
            arrayPacket[i]=new Cards(arrayFaces[i%13], arraySticks[i/13]);
        }
    }

    public void shuffleCard(){
        currentCard=0;

        for(int i=0; i<arrayPacket.length; i++){
            int secondCard=RANDOM_NUMBERS.nextInt(NUMBER_OF_CARD);

            Cards temp=arrayPacket[i];
            arrayPacket[i]=arrayPacket[secondCard];
            arrayPacket[secondCard]=temp;
        }//end for
    }//end shuffleCard

    public Cards distributeCards(){
        if(currentCard<arrayPacket.length){
            return arrayPacket[currentCard++];
        }else{
            return null;
        }
    }//end distributeCards
}//end PackageCards