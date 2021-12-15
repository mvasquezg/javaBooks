/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 02: Introduction to apps in Java,
  *Program 09.- Arithmetic operations basic whit two integer numbers.
*/
import java.util.Scanner;

public class ArithmeticOperationsBasicWithThreeNumbers{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num1=0, num2=0, num3=0, result=0;
        String numerosMayores="\nNumero(s) mayor(es)";
        String numerosMenores="\nNumero(s) menor(es)";

        System.out.print("Ingresa el primer numero: ");
        num1=in.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        num2=in.nextInt();
        System.out.print("Ingresa el tercer numero: ");
        num3=in.nextInt();

        result=num1+num2+num3;
        System.out.println("\nSuma\n"+num1+" + "+num2+" + "+num3+" = "+result);

        result=result/3;
        System.out.println("\nPromedio\n("+num1+" + "+num2+" + "+num3+")/3 = "+result);    

        result=num1*num2*num3;
        System.out.println("\nMultiplicacion\n"+num1+" * "+num2+" * "+num3+" = "+result);

        if(num1==num2){

            if(num2==num3){
              System.out.println("\nLos tres numeros son iguales.");
            }else if(num2>num3){
              System.out.println("\n"+numerosMayores+"\n"+"numero 1: "+num1+"\nNumero 2: "+num2+"\n"+numerosMenores+"\nNumero 3: "+num3);
            }else{
              System.out.println("\n"+numerosMayores+"\n"+"numero 3: "+num3+"\n"+numerosMenores+"\nNumero 1: "+num1+"\nNumero 2: "+num2);
            }

        }else if(num1>num2){

            if(num1==num3){
              System.out.println("\n"+numerosMayores+"\n"+"numero 1: "+num1+"\nNumero 3: "+num3+"\n"+numerosMenores+"\nNumero 2: "+num2);  
            }else if(num1>num3){

              if(num2==num3){
                System.out.println("\n"+numerosMayores+"\n"+"numero 1: "+num1+"\n"+numerosMenores+"\nNumero 2: "+num2+"\nNumero 3: "+num3);
              }else if(num2>num3){
                System.out.println("\n"+numerosMayores+"\n"+"numero 1: "+num1+"\n"+numerosMenores+"\nNumero 3: "+num3);
              }else{
                System.out.println("\n"+numerosMayores+"\n"+"numero 1: "+num1+"\n"+numerosMenores+"\nNumero 2: "+num2);
              }

            }else{
             System.out.println("\n"+numerosMayores+"\n"+"numero 3: "+num3+"\n"+numerosMenores+"\nNumero 2: "+num2); 
            }

        }else{
          
          if(num2==num3){
            System.out.println("\n"+numerosMayores+"\n"+"numero 2: "+num2+"\nNumero 3: "+num3+"\n"+numerosMenores+"\nNumero 1: "+num1);
          }else if(num2>num3){

            if(num1==num3){
              System.out.println("\n"+numerosMayores+"\n"+"numero 2: "+num2+"\n"+numerosMenores+"\nNumero 1: "+num1+"\nNumero 3: "+num3);
            }else if(num1>num3){
              System.out.println("\n"+numerosMayores+"\n"+"numero 2: "+num2+"\n"+numerosMenores+"\nNumero 3: "+num3);
            } else{
              System.out.println("\n"+numerosMayores+"\n"+"numero 2: "+num2+"\n"+numerosMenores+"\nNumero 1: "+num1);
            }            
          }else{
            System.out.println("\n"+numerosMayores+"\n"+"numero 3: "+num3+"\n"+numerosMenores+"\nNumero 1: "+num1);
          }

        }
        
    }//end main
}//end ArithmeticOperationsBasicWithThreeNumbers