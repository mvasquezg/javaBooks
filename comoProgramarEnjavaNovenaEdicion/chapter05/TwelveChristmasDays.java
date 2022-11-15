/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 32: Print song Tweve Christmas Days with siwtch.
*/

import java.util.Scanner;

public class TwelveChristmasDays{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        System.out.print("Ingrese un dia del 1 al 12 con numero: ");
        int option=in.nextInt();   

        switch(option){
            case 1:
                System.out.println("El primer dia de navidad\nMi amor me regalo un gorrioncillo volador");
             break;
            case 2:
                System.out.println("El segundo dia de navidad\nMi amor me regalo dos tortolitos y un gorrioncillo volador");
             break;
            case 3:
                System.out.println("El tercer dia de navidad\nMi amor me regalo tres gallinitas, dos tortolitos y un gorrioncillo volador");
             break;
            case 4:
                System.out.println("El caurto dia de navidad\nMi amor me regalo cuatro aves cantoras, tres gallinitas, dos tortolitos y un gorrioncillo volador");
             break;
            case 5:
                System.out.println("El quinto dia de navidad\nMi amor me regalo cinco anillos de oro, cuatro aves cantoras, tres gallinitas, dos tortolitos y un gorrioncillo volador");
             break;
            case 6:
                System.out.println("El sexto dia de navidad\nMi amor me regalo seis ganzos dormidos, cinco anillos de oro, cuatro aves cantoras, tres gallinitas, dos tortolitos y un gorrioncillo volador");
             break;
            case 7:
                System.out.println("El septimo dia de navidad\nMi amor me regalo siete lindo patos, seis ganzos dormidos, cinco anillos de oro, cuatro aves cantoras, tres gallinitas, dos tortolitos y un gorrioncillo volador");
             break;
            case 8:
                System.out.println("El octavo dia de navidad\nMi amor me regalo ocho lecheritas, siete lindo patos, seis ganzos dormidos, cinco anillos de oro, cuatro aves cantoras, tres gallinitas, dos tortolitos y un gorrioncillo volador");
             break;
            case 9:
                System.out.println("El noveno dia de navidad\nMi amor me regalo nueve bailarinas, ocho lecheritas, siete lindo patos, seis ganzos dormidos, cinco anillos de oro, cuatro aves cantoras, tres gallinitas, dos tortolitos y un gorrioncillo volador");
             break;     
            case 10:
                System.out.println("El decimo dia de navidad\nMi amor me regalo diez caballitos, nueve bailarinas, ocho lecheritas, siete lindo patos, seis ganzos dormidos, cinco anillos de oro, cuatro aves cantoras, tres gallinitas, dos tortolitos y un gorrioncillo volador");
             break;
            case 11:
                System.out.println("El onceavo dia de navidad\nMi amor me regalo once flautistas, diez caballitos, nueve bailarinas, ocho lecheritas, siete lindo patos, seis ganzos dormidos, cinco anillos de oro, cuatro aves cantoras, tres gallinitas, dos tortolitos y un gorrioncillo volador");
             break;
            case 12:
                System.out.println("El doceavo dia de navidad\nMi amor me regalo doce tamborileros,  once flautistas, diez caballitos, nueve bailarinas, ocho lecheritas, siete lindo patos, seis ganzos dormidos, cinco anillos de oro, cuatro aves cantoras, tres gallinitas, dos tortolitos y un gorrioncillo volador");
             break;
            default:
                System.out.println("No existe la opcion");   
        }//end switch

    }//end main

}//end TwelveChristmasDays