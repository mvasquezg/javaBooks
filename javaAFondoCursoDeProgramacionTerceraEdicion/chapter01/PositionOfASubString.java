/**
  *Book: Java in depth programming course
  *Chapter 01: Introduction to programming language.
  *Programa 27: Position of a subString.
*/
public class PositionOfASubString{
    public static void main(String[] args){
        String s="Un buen libro de java, un buen material";

        int pos1=s.indexOf("buen");
        int pos2=s.lastIndexOf("buen");

        System.out.println(pos1);
        System.out.println(pos2);
   }//end main
}//end PositionOfASubString