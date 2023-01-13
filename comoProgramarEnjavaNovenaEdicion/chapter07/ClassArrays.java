/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 07: Arrays and ArrayList Object.
  *Programa 16: Use class Arrays
*/
import java.util.Arrays;

public class ClassArrays{
    public static void main(String[] args){
        double[] arrayDouble={8.4, 9.3, 0.2, 7.9, 3.4};

        Arrays.sort(arrayDouble);
        System.out.printf("\nArregloDouble: ");

        for(double valueElement: arrayDouble){
            System.out.printf("%.1f ", valueElement);
        }

        int[] arrayIntFill=new int[10];
        Arrays.fill(arrayIntFill, 7);

        showArray(arrayIntFill, "arregloIntLleno");
        System.out.println();
        int[] arrayInt={1, 2, 3, 4, 5, 6};

        int[] copyArrayInt=new int[arrayInt.length];

        System.arraycopy(arrayInt, 0, copyArrayInt, 0, arrayInt.length);

        showArray(arrayInt, "arrayInt");
        showArray(copyArrayInt, "copyArrayInt");

        boolean b=Arrays.equals(arrayInt,copyArrayInt);
        System.out.printf("\n\narrayInt %s copyArrayInt\n", (b?" ==" : "!="));

        b=Arrays.equals(arrayInt, arrayIntFill);
        System.out.printf("arrayInt %s arrayIntFill\n", (b?" ==" : "!="));

        int ubication=Arrays.binarySearch(arrayInt, 5);
        if(ubication>=0){
            System.out.printf("\nSe encontro 5 en el elemento %d de arregloInt\n", ubication);
        }else{
            System.out.printf("\nNo se encontro el 5 en el arregloInt\n");
        }

        ubication=Arrays.binarySearch(arrayInt, 8763);
        if(ubication>=0){
            System.out.printf("\nSe encontro 8763 en el elemento %d de arregloInt\n", ubication);
        }else{
            System.out.printf("\nNo se encontro el 8763 en el arregloInt\n");
        }


    }//end main

    public static void showArray(int[] array, String description){
        System.out.printf("\n%s: ", description);

        for(int value: array){
            System.out.printf("%d ", value);
        }
    }

}//end ClassArrays