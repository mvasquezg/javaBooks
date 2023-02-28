package collections.mainApp;

import collections.controller.MyCollection;
import collections.controller.MyCollectionGeneric;
import collections.controller.MyStack;
import collections.controller.Queue;

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

        /*String name="";
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
        }*/

        /*
        MyStack<Integer> c=new MyStack<Integer>();

        c.stack(1);
        c.stack(2);
        c.stack(3);

        System.out.println(c.desapilar());
        System.out.println(c.desapilar());

        c.stack(4);

        System.out.println(c.desapilar());
        System.out.println(c.desajpilar());
        */

        Queue<Integer> c=new Queue<Integer>();

        c.encolar(1);
        c.encolar(2);
        c.encolar(3);

        System.out.println(c.desencolar());
        System.out.println(c.desencolar());

        c.encolar(4);

        System.out.println(c.desencolar());
        System.out.println(c.desencolar());


    }    
}//end CollectionApp