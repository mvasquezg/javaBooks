/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 07: Arrays and ArrayList Object.
  *Programa 08: Game of cards, Class Cards.
*/
public class Cards{
    public String face;
    public String stick;

    public Cards(String faceCard, String stickCard){
        this.face=faceCard;
        this.stick=stickCard;    
    }//end Cards

    public String toString(){
        return this.face+" de "+this.stick;
    }
}//end Cards