/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Programa 26: Show the values de x & y with the conditional else loose 02.
*/
public class OtherElseLoose{
    public static void main(String[] args){
        int x=5, y=8;

        /*Salida
            @@@@@
            $$$$$
            &&&&&
        
        if(y==8)
        if(x==5)
        System.out.println("@@@@@");
        else
        System.out.println("#####");
        System.out.println("$$$$$");
        System.out.println("&&&&&");
        */

        /*Salida
            @@@@@
        */  
        if(y==8){
            if(x==5)
                System.out.println("@@@@@");
        } else{
                System.out.println("#####");
                System.out.println("$$$$$");
                System.out.println("&&&&&");
        }


        
    }//end main
}//end OtherElseLoose