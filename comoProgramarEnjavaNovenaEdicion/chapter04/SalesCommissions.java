/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Programa 17: Caculate the sales commissions.
*/
import java.util.Scanner;

public class SalesCommissions{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float item1=239.99f, item2=129.75f, item3=99.95f, item4=350.89f, salaryBase=200f, sumSales=0.0f, commission=0.0f, totalSalary=0.0f;
        int option=0;   
        System.out.println("\nLista de precios\nArticulos\tCosto\nArticulo 1\t"+item1+"\nArticulo 2\t"
        +item2+"\nArticulo 3\t"+item3+"\nArticulo 4\t"+item4+"\n\n");

        System.out.print("Ingrese el numero del articulo para calcular la suma y su salario mas comision:\nIngrese un numero entre 1 y 4 cualquier otro valor sale del programa: ");
        option=in.nextInt(); 
        
        while(option>=1 && option<=4){
          if(option==1){
            sumSales+=item1;
          }else if(option==2){
            sumSales+=item2;
          }else if(option==3){
            sumSales+=item3;
          }else{
            sumSales+=item4;
          }
          System.out.print("Ingrese el numero del articulo para calcular la suma y su salario mas comision:\nIngrese un numero entre 1 y 4 cualquier otro valor sale del programa: ");
          option=in.nextInt();
       }//end while

        commission=(sumSales*0.9f)/100.00f;
        totalSalary=salaryBase+commission;
      
       System.out.println("La suma de todas la ventas: "+sumSales+"\nComision de ventas: "+commission+"\nSalario total semanal: "+totalSalary);
    }//end main
}//end SalesCommissions