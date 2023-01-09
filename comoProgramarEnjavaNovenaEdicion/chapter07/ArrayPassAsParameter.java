/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 07: Arrays and ArrayList Object.
  *Programa 10: Array Pass As Parameter.
*/

public class ArrayPassAsParameter{
    
    public static void main(String[] args){
        int[] arrayNumber={1,2,3,4,5};

        System.out.println("Efectos de pasar una reeferencia a un arreglo completo\nLos valores del arreglo orignal son: ");

        for(int value: arrayNumber){
            System.out.printf(" %d", value);
        }

        modifyArray(arrayNumber);
        System.out.println("\n\nLos valores del arreglo modificado son: ");

        for(int value: arrayNumber){
            System.out.printf(" %d", value);
        }

        System.out.printf("\n\nEfectos de pasar el valor de un elemnto del arreglo\nArreglo[3], antes de modificarlo: %d\n\n", arrayNumber[3]);

        modifyElement(arrayNumber[3]);

        System.out.printf("Arreglo[3] despues de modificar el elemento %d\n\n", arrayNumber[3]);
    }//end main

    public static void modifyArray(int[] arrayM){
        
        for(int i=0; i<arrayM.length; i++){
            arrayM[i]*=2;
        }

    }//end modifyArray

    public static void modifyElement(int element){
        element*=2;

        System.out.printf("valor del elemento en modificar elemento: %d\n\n", element);    
    }

    

}//end ArrayPassAsParameter