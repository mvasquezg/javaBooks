/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 06: Game of the craps
*/

import java.util.Random;

public class Craps{
    private static final Random randomNumber=new Random();

    //CONSTANTES QUE REPRESENTRAN EL ESTADO DEL JUEGO
    private enum PLAYSTATUS{NEXT, WIN, LOOSE};    
    
    //CONSTANTES QUE REPRESENTAN TIROS COMUNES
    private static final int TWO_ONES=2;
    private static final int THREE=3;
    private static final int SEVEN=7;
    private static final int ELEVEN=11;
    private static final int TWELVE=12;

    public static void main(String[] args){
        int myPoint=0;
        PLAYSTATUS playStatus;

        int sumDice=rollDice();

        switch(sumDice){
            case SEVEN:
            case ELEVEN:
                playStatus=PLAYSTATUS.WIN;
                break;
            case TWO_ONES:
            case THREE:
            case TWELVE:
                playStatus=PLAYSTATUS.LOOSE;
                break;
            default:
                playStatus=PLAYSTATUS.NEXT;
                myPoint=sumDice;
                System.out.print("El punto es: "+myPoint+"\n\n");
                break;
        }//end switch

        while(playStatus==PLAYSTATUS.NEXT){
            sumDice=rollDice();

            if(sumDice==myPoint){
                playStatus=PLAYSTATUS.WIN;
            }else if(sumDice==SEVEN){
                playStatus=PLAYSTATUS.LOOSE;
            }
        }//end while

        if(playStatus==PLAYSTATUS.WIN){
            System.out.println("El jugador gana.\n\n");
        }else{
            System.out.println("El jugador pierde.\n\n");
        }

    }//end main

    public static int rollDice(){
        int dice01=1+randomNumber.nextInt(6);
        int dice02=1+randomNumber.nextInt(6);

        int sum=dice01+dice02;

        System.out.println("El jugador tiro\nDado 1: "+dice01+"\nDado 2: "+dice02+"\nTotal de puntos: "+sum+"\n");
        return sum;
    }
}//end Craps