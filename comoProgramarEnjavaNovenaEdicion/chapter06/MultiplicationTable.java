/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 40: Multiplication Table
*/

import java.util.Random;
import java.util.Scanner;


public class MultiplicationTable{
    static int level=1;

    static int multiplyTwoNumbers(int num1, int num2, int operationOption){
        int result=0;

        switch(operationOption){
            case 1:
                result=num1+num2;
                break;
            case 2:
                result=num1-num2;
                break;
            case 3:
                result=num1*num2;
                break;        
            case 4:
                result=num1/num2;
                break;
            case 5:
                result=num1+num2-num1*num2/num2;
                break;
            default:
                result=-1;
                break; 
        } 
        return result;
    }//end multiplyTwoNumbers

    static void guessMultiplication(int operationOption){
        Scanner in=new Scanner(System.in);
        Random number1=new Random();
        Random number2=new Random();

        Random option1=new Random();
        Random option2=new Random();
        
        int number=0;
        int opt1=0;
        int opt2=0;

        int counter=0;
        int hitCounter=0;
        int failureCounter=0;
        double prom=0;

        int multiplier=number1.nextInt(10)+1;
        int multiplying=number2.nextInt(10)+1;
        int result=multiplyTwoNumbers(multiplier, multiplying, operationOption);
        
        /*Comentando el codigo del ejercicio 6.35 para agregar codigo del ejercico 6.36
        do{
            System.out.print("Cuanto es "+multiplier+" * "+multiplying+": ");
            number=in.nextInt();

            if(number==result){
                System.out.println("Muy bien!");
            }else{
                System.out.print("No. por favor intenta de nuevo!\n");
            }
        }while(number!=result);*/

        /*Codigo del ejercicio 6.36    
        do{
            System.out.print("Cuanto es "+multiplier+" * "+multiplying+": ");
            number=in.nextInt();

            opt1=option1.nextInt(4)+1;
            opt2=option2.nextInt(4)+1;


            if(number==result){
                switch(opt1){
                    case 1:
                        System.out.println("Muy bien!");
                        break;
                    case 2:
                        System.out.println("Excelente!");
                        break;
                    case 3:
                        System.out.println("Buen trabajo!");
                        break;
                    case 4:
                        System.out.println("Sigue asi!");
                        break;            
                }//end switch
            }else{
                switch(opt2){
                    case 1:
                        System.out.println("No. Por favor intenta de nuevo.");
                        break;
                    case 2:
                        System.out.println("Incorrecto. Intenta una vez mas.");
                        break;
                    case 3:
                        System.out.println("No te rindas!");
                        break;
                    case 4:
                        System.out.println("No Sigue intentando!");
                        break;            
                }//end switch
            }
        }while(number!=result);
        */

        //Codigo 6.37
        do{
            switch(operationOption){
                case 1:
                    System.out.print("Cuanto es "+multiplier+" + "+multiplying+": ");    
                    break;
                case 2:
                    System.out.print("Cuanto es "+multiplier+" - "+multiplying+": ");
                    break;
                case 3:
                    System.out.print("Cuanto es "+multiplier+" * "+multiplying+": ");
                    break;
                case 4:
                    System.out.print("Cuanto es "+multiplier+" / "+multiplying+": ");
                    break;
                case 5:
                    System.out.print("Cuanto es "+multiplier+" + "+multiplying+" - "+multiplier+" * "+multiplying+" / "+multiplying+" = ");
                    break;
                                    
            }//end switch    
            
            number=in.nextInt();

            opt1=option1.nextInt(4)+1;
            opt2=option2.nextInt(4)+1;


            if(number==result){
                switch(opt1){
                    case 1:
                        System.out.println("Muy bien!");
                        break;
                    case 2:
                        System.out.println("Excelente!");
                        break;
                    case 3:
                        System.out.println("Buen trabajo!");
                        break;
                    case 4:
                        System.out.println("Sigue asi!");
                        break;            
                }//end switch
                hitCounter++;
                multiplier=number1.nextInt(10)+1;
                multiplying=number2.nextInt(10)+1;
                result=multiplyTwoNumbers(multiplier, multiplying, operationOption);
            }else{
                switch(opt2){
                    case 1:
                        System.out.println("No. Por favor intenta de nuevo.");
                        break;
                    case 2:
                        System.out.println("Incorrecto. Intenta una vez mas.");
                        break;
                    case 3:
                        System.out.println("No te rindas!");
                        break;
                    case 4:
                        System.out.println("No Sigue intentando!");
                        break;            
                }//end switch
                failureCounter++;
            }
            counter++;
        }while(counter<10);


        System.out.println("Total de ejercicios: "+counter+"\nAciertos: "+hitCounter+"\nFallados: "+failureCounter);        
        prom=(hitCounter*100)/counter;

        System.out.println("Promedio: "+prom);

        if(prom>75){
            System.out.println("Felicidades, esta listo para pasar el siguiente nivel.\n");
            level=2;

        }else{
            System.out.println("Por favor pida ayuda adicional, A su instructor.\n");
        }
    }
    //Se agrego eeste codigo del ejercicio 6.38
    static void guessMultiplicationLevelTwo(int operationOption){
        Scanner in=new Scanner(System.in);
        Random number1=new Random();
        Random number2=new Random();

        Random option1=new Random();
        Random option2=new Random();
        
        int number=0;
        int opt1=0;
        int opt2=0;

        int counter=0;
        int hitCounter=0;
        int failureCounter=0;
        double prom=0;

        int multiplier=number1.nextInt(100)-1;
        int multiplying=number2.nextInt(100)-1;
        int result=multiplyTwoNumbers(multiplier, multiplying, operationOption);
        
        do{
            switch(operationOption){
                case 1:
                    System.out.print("Cuanto es "+multiplier+" + "+multiplying+": ");    
                    break;
                case 2:
                    System.out.print("Cuanto es "+multiplier+" - "+multiplying+": ");
                    break;
                case 3:
                    System.out.print("Cuanto es "+multiplier+" * "+multiplying+": ");
                    break;
                case 4:
                    System.out.print("Cuanto es "+multiplier+" / "+multiplying+": ");
                    break;
                case 5:
                    System.out.print("Cuanto es "+multiplier+" + "+multiplying+" - "+multiplier+" * "+multiplying+" / "+multiplying+" = ");
                    break;
                                    
            }//end switch
            
            number=in.nextInt();

            opt1=option1.nextInt(4)+1;
            opt2=option2.nextInt(4)+1;


            if(number==result){
                switch(opt1){
                    case 1:
                        System.out.println("Muy bien!");
                        break;
                    case 2:
                        System.out.println("Excelente!");
                        break;
                    case 3:
                        System.out.println("Buen trabajo!");
                        break;
                    case 4:
                        System.out.println("Sigue asi!");
                        break;            
                }//end switch
                hitCounter++;
                multiplier=number1.nextInt(100)-1;
                multiplying=number2.nextInt(100)-1;
                result=multiplyTwoNumbers(multiplier, multiplying, operationOption);
            }else{
                switch(opt2){
                    case 1:
                        System.out.println("No. Por favor intenta de nuevo.");
                        break;
                    case 2:
                        System.out.println("Incorrecto. Intenta una vez mas.");
                        break;
                    case 3:
                        System.out.println("No te rindas!");
                        break;
                    case 4:
                        System.out.println("No Sigue intentando!");
                        break;            
                }//end switch
                failureCounter++;
            }
            counter++;
        }while(counter<10);


        System.out.println("Total de ejercicios: "+counter+"\nAciertos: "+hitCounter+"\nFallados: "+failureCounter);        
        prom=(hitCounter*100)/counter;

        System.out.println("Promedio: "+prom);

        if(prom>75){
            level=1;
            System.out.println("Felicidades, Excelente regresa a la practica en el nivel: "+level); 
        }else{
            System.out.println("Por favor pida ayuda adicional, A su instructor.\n");
        }

        
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int option=0;
        int operationOption=0;

        //Agregando codigo del ejecrcio 6.39
        
        
        do{
            System.out.print("====== Elija una opcion del menu. ======\n1.-Suma\n2.-Resta\n3.-Multiplicacion\n4.-Division\n5.-Todas la operaciones Mencionadas\nElija una opcion: ");
            operationOption=in.nextInt();
            
            if(level==1){
                guessMultiplication(operationOption);
            }else{
                guessMultiplicationLevelTwo(operationOption);
            }
            
            System.out.print("\nNivel: "+level+"\n\nPresione -1 para salir del programa o cualquier otro numero para continuar: ");
            option=in.nextInt();
            System.out.print("\n");

        }while(option>=0);
        
    }//end main
}//end class MultiplicationTable