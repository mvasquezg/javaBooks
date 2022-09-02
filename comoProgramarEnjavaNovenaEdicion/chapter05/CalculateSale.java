/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 22: Show total sales for each product, using bucles and validations. 
*/

import java.util.Scanner;

public class CalculateSale{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        final double PRODUCT_01=2.98, PRODUCT_02=4.50, PRODUCT_03=9.98,PRODUCT_04=4.49, PRODUCT_05=6.87;
        int cantidad=0, option=0, total1=0, total2=0, total3=0, total4=0, total5=0;

        double sum1=0.0, sum2=0.0, sum3=0.0, sum4=0.0, sum5=0;

        do{
            System.out.printf("%s", "Ingrese la clave del producto o presione -1 para salir.\nClave 1 = $ 2.98 \nClave 2 = $ 4.50\nClave 3 = $ 9.98\nClave 4 = $ 4.49\nClave 5 = $ 6.87\nOpcion:  ");
            option=in.nextInt();
            
            if(option>0 && option<=5){
                System.out.print("Ingrese la cantidad vendida: ");
                cantidad=in.nextInt();
            }
            
            switch(option){
                case 1:
                    total1+=cantidad;
                    sum1+=(cantidad*PRODUCT_01);    
                    break;
                case 2:
                    total2+=cantidad;
                    sum2+=(cantidad*PRODUCT_02);
                    break;
                case 3:
                    total3+=cantidad;
                    sum3+=(cantidad*PRODUCT_03);
                    break;
                case 4:
                    total4+=cantidad;
                    sum4+=(cantidad*PRODUCT_04);
                    break;
                case 5:
                    total5+=cantidad;
                    sum5+=(cantidad*PRODUCT_05);
                    break;
                default:
                    System.out.println("Con esta opcion: "+option+" a elegido salir del programa.");
                    break;                   
            }//end switch
            System.out.println();
            
        }while(option>0 && option<=5);
        
        System.out.println();
        System.out.println();

        System.out.println("\n\t\t\tTotales de productos vendidos\n\nProducto 1\t\tProducto 2\t\tProducto 3\t\tProducto 4\t\tProducto 5: "+
                            "\nCantidad: "+total1+"\t\tCantidad: "+total2+"\t\tCantidad: "+total3+"\t\tCantidad: "+total4+"\t\tCantidad:"+total5+"\n"+
                            "Total: "+(Math.round(sum1*100.0)/100.0)+"\t\tTotal: "+(Math.round(sum2*100.0)/100.0)+"\t\tTotal: "+(Math.round(sum3*100.0)/100.0)+"\t\tTotal: "+(Math.round(sum4*100.0)/100.0)+"\t\tTotal: "+(Math.round(sum5*100.0)/100.0)+"\n\n");
        System.out.println();
    }//end main
}//end CalculateSale