/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 05: Roll dice six millions times
*/

import java.util.Random;

public class DiceRolls{

    public static void main(String[] args){
        Random randomNumber=new Random();

        int frequency01=0;
        int frequency02=0;
        int frequency03=0;
        int frequency04=0;
        int frequency05=0;
        int frequency06=0;

        int diceFace;

        for(int i=1; i<=6000000;i++){
            diceFace=1+randomNumber.nextInt(6);

            switch(diceFace){
                case 1:
                    ++frequency01;
                    break;
                case 2:
                    ++frequency02;
                    break;
                case 3:
                    ++frequency03;
                    break;
                case 4:
                    ++frequency04;
                    break;
                case 5:
                    ++frequency05;
                    break;
                case 6:
                    ++frequency06;
                    break;            
            }
        }
        System.out.println("Cara\t\tFrecuencia");
        System.out.println("1\t\t"+frequency01+"\n2\t\t"+frequency02+
            "\n3\t\t"+frequency03+"\n4\t\t"+frequency04+"\n5\t\t"+frequency05+
            "\n6\t\t"+frequency06
        );
    }

}//end DiceRolls 