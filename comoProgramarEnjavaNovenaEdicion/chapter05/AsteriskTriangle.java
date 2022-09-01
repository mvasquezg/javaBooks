 36 lines (23 sloc) 1 KB
/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 19: Print asterisk triangles.
*/

public class AsteriskTriangle{
    public static void main(String[] args){
        
        //Pinta el primer triangulo
        System.out.print("a)\n");
            for(int i=1; i<=10; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.print("b)\n");
        for(int i=10; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println();
        System.out.print("c)\n");
        for(int i=10; i>=1; i--)        {
            for(int j=1; j<=10; j++){

                    if(j <= (10-i)){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    } 
                }
       

            System.out.println();
        }

        System.out.println();
        System.out.print("d)\n");
        for(int i=10; i>=1; i--)        {
            for(int j=1; j<=10; j++){
                
                if((10-i)<(10-j)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
       
            }
            System.out.println();
        }
        
        

    }//end main
}//end AsteriskTriangle