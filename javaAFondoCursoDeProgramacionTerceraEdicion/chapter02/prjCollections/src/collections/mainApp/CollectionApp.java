package collections.mainApp;

import collections.controller.MyCollection;
import collections.controller.MyCollectionGeneric;

import java.util.Scanner;

public class CollectionApp{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        /*MyCollection objMyCollection=new MyCollection(10);
        String name="";

        int x=1;

        System.out.print(x+".-Ingrese nombre: ");
        name=in.nextLine();
        while(!name.equalsIgnoreCase("FIN")){
            x++;
            objMyCollection.insert(name, 0);

            System.out.print(x+".-Ingrese nombre: ");
            name=in.nextLine();
        }

        String aux="";
        System.out.println("\n");
        for(int i=0; i<objMyCollection.amount(); i++){
            aux=(String) objMyCollection.getObject(i);

            System.out.println(aux+" - "+aux.length()+" caracteres");
        }*/

        String name="";
        int x=1;

        System.out.print("Ingresa un nombre: ");
        name=in.next();

        MyCollectionGeneric<String> mc=new MyCollectionGeneric<String>(5); 

        while(!name.equalsIgnoreCase("FIN")){
            x++;
            mc.insert(name, 0);

            System.out.print(x+".-Ingrese nombre: ");
            name=in.next();    
        }   

        String aux="";
        System.out.println("\n");
        for(int i=0; i<mc.amount(); i++){
            aux=(String) mc.getObject(i);

            System.out.println(aux+" - "+aux.length()+" caracteres");
        }
    }    
}//end CollectionApp