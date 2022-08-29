/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 12: Execute various instructions. 
*/
public class VariousInstructions{

    public static void main(String[] args){
        int sum=0, i=1;
        System.out.println("Este programa hace diferentes tareas: ");

        System.out.println("\na).-Suma los enteros impares entre 1 y 99, utilizando la instruccion for.\n");
        for(int x=1; x<100; x++){

            if(x%2!=0){
               System.out.print(x+ " ");
                sum+=x;
            }
        }
        System.out.println("\nLa suma es igual a: "+sum+"\n\n");


        System.out.println("b).-Elevar al cubo: 2.5\n2.5 ^ 3  = "+Math.pow(2.5, 3)+"\n\n");

        System.out.println("c).-Imprimir los enteros del 1 al 20, utilizando un ciclo while\n");


        while(i<=20){
            
            
            System.out.print(i);
            if(i%5==0){
                System.out.println();
            }else{
                System.out.print("\t");
            }
            
            
            i++;
        }
        System.out.println("\n");

        System.out.println("d).-Imprimir los enteros del 1 al 20, utilizando un ciclo for\n");


        for(int y=1; y<=20; y++){
            
            
            System.out.print(y);
            if(y%5==0){
                System.out.println();
            }else{
                System.out.print("\t");
            }          
            
        }
        System.out.println("\n");
    }

}//VariousInstructions