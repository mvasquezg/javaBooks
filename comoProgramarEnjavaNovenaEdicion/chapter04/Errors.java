/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Programa 13: Results in tehe code.
*/

public class Errors{
    public static void main(String[] args){
        int product=5, c=5, z=5, sum=0;
        int sex=1;   
        while(c<=5){
            product*=c;
            ++c;
        }

        System.out.println("4.8\na)\nProducto: "+product);

        System.out.println("\nb)\nSexo: ");

        if(sex==1){
            System.out.println("Mujer");
        }else{
            System.out.println("Hombre");
        }

        System.out.println("\n\nc) ");
        while(z>=0){//ciclo infinito orque z siepre sera mayor a 0
            sum+=z;
            System.out.println(sum+" ");
        }
            
    }//end main
}//end Errors