/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 13: Errors in the program. 
*/
public class Errors{
    
    public static void main(String[] args){
        
        //a).-Codigo como en el libro
        /*int i=1;

        while(i<=10);
            ++i;
        }*/
        //Solucion
        /*int i=1;

        while(i<=10){
            System.out.print(i+" ");
            ++i;
        }
        System.out.println();*/

        //b).-Codigo como en el libro
        /*for(floatk=0.2; k!=10.0; k+=0.1){
            System.out.println(k);
        }*/

        //Solucion
        /*for(double k=0.2; k<=10.0; k+=0.1){
            System.out.println(k);
        }*/

        //c).-Codigo como en el libro
        /*int n=3;
        switch(n){
            case 1:
                System.out.println("El numero es 1");                
            case 2:
                System.out.println("El numero es 2");
                break;
            default:
                System.out.println("El numero no es 1 ni es 2.");
                break;    
        }*/

        //Solucion
        /*int n=3;
        switch(n){
            case 1:
                System.out.println("El numero es 1");                
                break;
            case 2:
                System.out.println("El numero es 2");
                break;
            default:
                System.out.println("El numero no es 1 ni es 2.");
                break;    
        }*/

        //d).-Codigo como en el libro
        int n=1;

        while(n<=10){
            System.out.println(n);
            ++n;
        }
            

    }//end main

}//end Errors