/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 07: Arrays and ArrayList Object.
  *Programa 01: First Array.
*/
public class FirstArray{
    public static void main(String[] args){
        
        int[] arrayNumber;//declaracion del arreglo

        arrayNumber=new int[10];//crea el objeto del arreglo.

        System.out.printf("%s%8s\n", "Indice", "Valor");//encabezado de columnas

        //Imprimiendo el valor del arreglo
        for(int i=0; i<arrayNumber.length; i++){
            System.out.printf("%5d%8d\n", i, arrayNumber[i]);
        }//end for
    }//end main
}//end FirstArray