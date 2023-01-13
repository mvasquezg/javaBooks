/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 07: Arrays and ArrayList Object.
  *Programa 17: Use class ArrayList
*/
import java.util.ArrayList;

public class UseArrayList{

    public static void main(String[] args){
        ArrayList<String> elementList=new ArrayList<String>();

        elementList.add("Rojo");
        elementList.add(0, "Amarillo");

        System.out.print("Mostrar contenido de lista con ciclo controlado por contador: ");

        for(int i=0; i<elementList.size(); i++){
            System.out.printf(" %s", elementList.get(i));
        }

        showElements(elementList, "\n\nMostrar contenido de lista con instruccion for mejorada:");

        elementList.add("Verde");
        elementList.add("Amarillo");

        showElements(elementList, "\nLista con dos nuevos elementos:");

        elementList.remove("Amarillo");
        showElements(elementList, "\nEliminar primera instancia de amarillo. ");

        elementList.remove(1);
        showElements(elementList, "\nEliminar segundo elemento de la lista (verde): ");

        System.out.printf("\"Rojo\" %s esta en la lista\n", elementList.contains("rojo")?"":"no ");

        System.out.printf("\nTamanio: %s\n", elementList.size());


    }//end main

    public static void showElements(ArrayList<String> elementList, String head){
        System.out.print(head);

        for(String element: elementList){
            System.out.printf(" %s", element);
        }
        System.out.println();
    }

}//end class UseArrayList