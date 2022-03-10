/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Programa 15: Calculate how many kilometers you travel per liter of gasoline .
*/
import java.util.Scanner;

public class GasolineMileage{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int kilometersDriven=0, litersUsed=0;
        int totalKilometerDriven=0, totalLitersUsed=0;
        float average=0.0f;

        System.out.print("Ingresa los kilometros conducidos, presiona cualquier nuemro negativo o cero para salir: ");
        kilometersDriven=in.nextInt();
        while(kilometersDriven!=-1 && kilometersDriven>0){
            totalKilometerDriven+=kilometersDriven;
            System.out.print("Ingresa Litros de gasolina consumidos: ");    
            litersUsed=in.nextInt();

            totalLitersUsed+=litersUsed;

            System.out.print("Ingresa los kilometros conducidos, presiona cualquier nuemro negativo o cero para salir: ");
            kilometersDriven=in.nextInt();
        }
        average=(float) totalKilometerDriven/totalLitersUsed;

        System.out.println("Total de kilometros recorridos: "+totalKilometerDriven+"\nTotal de litros de gasolina: "+totalLitersUsed);
        System.out.println("El promedio de kilometros por litros es igua al: "+average+" Km por un litro de gasolina");
        
    }//end main
}//end GasolineMileage