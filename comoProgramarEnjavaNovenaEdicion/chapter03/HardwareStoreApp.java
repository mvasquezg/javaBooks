/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 03: Introduction to classes. objects, methods and string,
  *Program 06.-Class for execute the app. 
*/

import java.util.Scanner;

public class HardwareStoreApp{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        HardwareStore product01=new HardwareStore("0001", "Pinza", 20, 10.50);
        
        System.out.println("\nCodigo del producto: "+product01.getPartNumber()+"\n"+
            "Descripcion del producto: "+product01.getPartDescription()+"\n"+
            "Cantidad a comprar: "+product01.getPieceQuantity()+"\n"+
            "Precio por pieza: "+product01.getPartPrice()+"\n"
        );

        System.out.println("Total a pagar: "+product01.calculateTotalBill());

    }//end main

}//end HardwareStoreApp