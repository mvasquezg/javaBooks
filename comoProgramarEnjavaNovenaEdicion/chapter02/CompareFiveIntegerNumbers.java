/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 02: Introduction to apps in Java,
  *Program 13.- Compare 5 integers and decide which one(s) are higher as well as which one(s) are lower than the five, only with if statement.
*/
import java.util.Scanner;

public class CompareFiveIntegerNumbers{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int a=0, b=0, c=0, d=0, e=0;
        String mayorNumber="\n\nNumero(s) Mayor(es)";
        String menorNumber="\n\nNumero(s) Menor(es)";

        System.out.print("Ingresa el primer numero: ");
        a=in.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        b=in.nextInt();
        System.out.print("Ingresa el tercer numero: ");
        c=in.nextInt();
        System.out.print("Ingresa el carto numero: ");
        d=in.nextInt();
        System.out.print("Ingresa el quinto numero: ");
        e=in.nextInt();

        if(a==b){

            if(b==c){

                if(c==d){

                    if(d==e){
                        System.out.println("Todos los numeros son iguales.");
                    }else if(d>e){
                        System.out.println(mayorNumber+"\n"+a+"\n"+b+"\n"+c+"\n"+d+menorNumber+"\n"+e);
                    }else{
                        System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+a+"\n"+b+"\n"+c+"\n"+d);
                    }

                }else if(c>d){

                    if(c==e){
                        System.out.println(mayorNumber+"\n"+a+"\n"+b+"\n"+c+"\n"+e+menorNumber+"\n"+d);
                    }else if(c>e){
                        if(d==e){
                            System.out.println(mayorNumber+"\n"+a+"\n"+b+"\n"+c+menorNumber+"\n"+d+"\n"+e);
                        }else if(d>e){
                            System.out.println(mayorNumber+"\n"+a+"\n"+b+"\n"+c+menorNumber+"\n"+e);
                        }else{
                            System.out.println(mayorNumber+"\n"+a+"\n"+b+"\n"+c+"\n"+menorNumber+"\n"+d);
                        }
                    }else{
                        System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+d);
                    }
                }else{

                    if(d==e){
                        System.out.println(mayorNumber+"\n"+d+"\n"+e+menorNumber+"\n"+a+"\n"+b+"\n"+c);
                    }else if(d>e){
                        if(c==e){
                            System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+a+"\n"+b+"\n"+c+"\n"+e);
                        }else if(c>e){
                            System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+e);
                        }else{
                            System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+a+"\n"+b+"\n"+c);
                        }
                    }else{
                        System.out.println(mayorNumber+"\n"+e+"\n"+menorNumber+"\n"+a+"\n"+b+"\n"+c);
                    }
                }
            }else if(b>c){

                if(b==d){

                    if(d==e){
                        System.out.println(mayorNumber+"\n"+a+"\n"+b+"\n"+d+"\n"+e+menorNumber+"\n"+c);
                    }else if(d>e){
                        
                        if(c==e){
                            System.out.println(mayorNumber+"\n"+a+"\n"+b+"\n"+d+menorNumber+"\n"+c+"\n"+e);
                        }else if(c>e){
                            System.out.println(mayorNumber+"\n"+a+"\n"+b+"\n"+d+menorNumber+"\n"+e);
                        }else{
                            System.out.println(mayorNumber+"\n"+a+"\n"+b+"\n"+d+menorNumber+"\n"+c);
                        }
                        
                        
                    }else{
                        System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+c);
                    }
                }else if(b>d){

                    if(b==e){

                        if(c==d){
                            System.out.println(mayorNumber+"\n"+a+"\n"+b+"\n"+e+menorNumber+"\n"+c+"\n"+d);
                        }else if(c>d){
                            System.out.println(mayorNumber+"\n"+a+"\n"+b+"\n"+e+menorNumber+"\n"+d);
                        }else{
                            System.out.println(mayorNumber+"\n"+a+"\n"+b+"\n"+e+menorNumber+"\n"+c);
                        }

                    }else if(b>e){

                        if(c==d){
                            if(d==e){
                                System.out.println(mayorNumber+"\n"+a+"\n"+b+"\n"+menorNumber+"\n"+c+"\n"+d+"\n"+e);
                            }else if(d>e){
                                System.out.println(mayorNumber+"\n"+a+"\n"+b+"\n"+menorNumber+"\n"+e);
                            }else{
                                System.out.println(mayorNumber+"\n"+a+"\n"+b+"\n"+menorNumber+"\n"+c+"\n"+d);
                            }
                        }else if(c>d){

                            if(c==e){
                                System.out.println(mayorNumber+"\n"+a+"\n"+b+"\n"+menorNumber+"\n"+d);
                            }else if(c>e){
                                
                                if(d==e){
                                    System.out.println(mayorNumber+"\n"+a+"\n"+b+"\n"+menorNumber+"\n"+d+"\n"+e);
                                }else if(d>e){
                                    System.out.println(mayorNumber+"\n"+a+"\n"+b+"\n"+menorNumber+"\n"+e);
                                }else{
                                    System.out.println(mayorNumber+"\n"+a+"\n"+b+"\n"+menorNumber+"\n"+d);
                                }
                            }else{
                                System.out.println(mayorNumber+"\n"+a+"\n"+b+"\n"+menorNumber+"\n"+d);
                            }

                        }else{

                            if(d==e){
                                System.out.println(mayorNumber+"\n"+a+"\n"+b+menorNumber+"\n"+c);
                            }else if(d>e){
                                if(c==e){
                                    System.out.println(mayorNumber+"\n"+a+"\n"+b+menorNumber+"\n"+c+"\n"+e);
                                }else if(c>e){
                                    System.out.println(mayorNumber+"\n"+a+"\n"+b+menorNumber+"\n"+e);
                                }else{
                                    System.out.println(mayorNumber+"\n"+a+"\n"+b+menorNumber+"\n"+c);
                                }
                            }else{
                                System.out.println(mayorNumber+"\n"+a+"\n"+b+menorNumber+"\n"+c);    
                            }

                        }
                    }else{
                        if(c==d){
                            System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+c+"\n"+d);
                        }else if(c>d){
                            System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+d);
                        }else{
                            System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+c);
                        }
                    }

                }else{
                   if(d==e){
                       System.out.println(mayorNumber+"\n"+d+"\n"+e+menorNumber+"\n"+c);
                   }else if(d>e){
                       if(b==e){
                           System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+c);
                       }else if(b>e){

                           if(c==e){
                               System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+c+"\n"+e);
                           }else if(c>e){
                               System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+e);
                           }else{
                               System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+c);
                           }

                       }else{
                           System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+c);
                       }
                   }else{
                       System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+c);
                   }
                }

            }else{
                if(c==d){

                    if(d==e){
                        System.out.println(mayorNumber+"\n"+c+"\n"+d+"\n"+e+menorNumber+"\n"+a+"\n"+b);
                    }else if(d>e){

                        if(b==e){
                            System.out.println(mayorNumber+"\n"+c+"\n"+d+"\n"+menorNumber+"\n"+a+"\n"+b+"\n"+e);
                        }else if(b>e){
                            System.out.println(mayorNumber+"\n"+c+"\n"+d+"\n"+menorNumber+"\n"+e);
                        }else{
                            System.out.println(mayorNumber+"\n"+c+"\n"+d+"\n"+menorNumber+"\n"+a+"\n"+b);
                        }

                    }else{
                        System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+a+"\n"+b);
                    }
                }else if(c>d){

                    if(c==e){

                        if(b==d){
                            System.out.println(mayorNumber+"\n"+c+"\n"+e+"\n"+menorNumber+"\n"+a+"\n"+b+"\n"+d);
                        }else if(b>d){
                            System.out.println(mayorNumber+"\n"+c+"\n"+e+"\n"+menorNumber+"\n"+d);
                        }else{
                            System.out.println(mayorNumber+"\n"+c+"\n"+e+"\n"+menorNumber+"\n"+a+"\n"+b);
                        }
                    }else if(c>e){
                        
                        if(b==d){

                            if(d==e){
                                System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+a+"\n"+b+"\n"+d+"\n"+e);
                            }else if(d>e){
                                System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+e);
                            }else{
                                System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+a+"\n"+b+"\n"+d);
                            }

                        }else if(b>d){

                            if(b==e){
                                System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+d);      
                            }else if(b>e){

                                if(d==e){
                                    System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+d+"\n"+e);      
                                }else if(d>e){
                                    System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+e+"linea 228");      
                                }else{
                                    System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+d);      
                                }

                            }else{
                                System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+d);      
                            }

                        }else{

                            if(d==e){
                                System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+a+"\n"+b);
                            }else if(d>e){
                                if(b==e){
                                    System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+a+"\n"+b+"\n"+e);
                                }else if(b>e){
                                    System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+e);
                                }else{
                                    System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+a+"\n"+b);
                                }
                            }else{
                                System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+a+"\n"+b);
                            }

                        }
                    }else{

                        if(b==d){
                            System.out.println(mayorNumber+"\n"+e+"\n"+menorNumber+"\n"+a+"\n"+b+"\n"+d);
                        }else if(b>d){
                            System.out.println(mayorNumber+"\n"+e+"\n"+menorNumber+"\n"+d);
                        }else{
                            System.out.println(mayorNumber+"\n"+e+"\n"+menorNumber+"\n"+a+"\n"+b);
                        }
                    }

                }else{

                    if(d==e){
                        System.out.println(mayorNumber+"\n"+d+"\n"+e+menorNumber+"\n"+a+"\n"+b);
                    }else if(d>e){

                        if(c==e){
                            System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+a+"\n"+b);
                        }else if(c>e){

                            if(b==e){
                                System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+a+"\n"+b+"\n"+e);
                            }else if(b>e){
                                System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+e);
                            }else{
                                System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+a+"\n"+b);
                            }

                        }else{
                            System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+a+"\n"+b);
                        }


                    }else{
                        System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+a+"\n"+b);
                    }

                }
            }

        }
        else if(a>b){

            if(a==c){

                if(c==d){

                    if(d==e){
                        System.out.println(mayorNumber+"\n"+a+"\n"+c+"\n"+d+"\n"+e+menorNumber+"\n"+b);
                    }else if(d>e){
                        
                        if(b==e){
                            System.out.println(mayorNumber+"\n"+a+"\n"+c+"\n"+d+"\n"+menorNumber+"\n"+b+"\n"+e);
                        }else if(b>e){
                            System.out.println(mayorNumber+"\n"+a+"\n"+c+"\n"+d+"\n"+menorNumber+"\n"+e);
                        }else{
                            System.out.println(mayorNumber+"\n"+a+"\n"+c+"\n"+d+"\n"+menorNumber+"\n"+b);
                        }

                    }else{
                        System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+b);
                    }
                }else if(c>d){

                    if(c==e){

                        if(b==d){
                            System.out.println(mayorNumber+"\n"+a+"\n"+c+"\n"+e+menorNumber+"\n"+b+"\n"+d);
                        }else if(b>d){
                            System.out.println(mayorNumber+"\n"+a+"\n"+c+"\n"+e+menorNumber+"\n"+d);
                        }else{
                            System.out.println(mayorNumber+"\n"+a+"\n"+c+"\n"+e+menorNumber+"\n"+b);
                        }

                    }else if(c>e){

                        if(b==d){

                            if(d==e){
                                System.out.println(mayorNumber+"\n"+a+"\n"+c+"\n"+menorNumber+"\n"+b+"\n"+d+"\n"+e);
                            }else if(d>e){
                                System.out.println(mayorNumber+"\n"+a+"\n"+c+"\n"+menorNumber+"\n"+e);
                            }else{
                                System.out.println(mayorNumber+"\n"+a+"\n"+c+"\n"+menorNumber+"\n"+b+"\n"+d);
                            }

                        }else if(b>d){
                            if(b==e){
                                System.out.println(mayorNumber+"\n"+a+"\n"+c+"\n"+menorNumber+"\n"+d);
                            }else if(b>e){
                                if(d==e){
                                    System.out.println(mayorNumber+"\n"+a+"\n"+c+"\n"+menorNumber+"\n"+d+"\n"+e);
                                }else if(d>e){
                                    System.out.println(mayorNumber+"\n"+a+"\n"+c+"\n"+menorNumber+"\n"+e);
                                }else{
                                    System.out.println(mayorNumber+"\n"+a+"\n"+c+"\n"+menorNumber+"\n"+d);
                                }
                            }else{
                                System.out.println(mayorNumber+"\n"+a+"\n"+c+"\n"+menorNumber+"\n"+d);
                            }
                        }else{
                            if(d==e){
                                System.out.println(mayorNumber+"\n"+a+"\n"+c+"\n"+menorNumber+"\n"+b);
                            }else if(d>e){

                                if(b==e){
                                    System.out.println(mayorNumber+"\n"+a+"\n"+c+"\n"+menorNumber+"\n"+b+"\n"+e);
                                }else if(b>e){
                                    System.out.println(mayorNumber+"\n"+a+"\n"+c+"\n"+menorNumber+"\n"+e);
                                }else{
                                    System.out.println(mayorNumber+"\n"+a+"\n"+c+"\n"+menorNumber+"\n"+b);
                                }

                            }else{
                                System.out.println(mayorNumber+"\n"+a+"\n"+c+"\n"+menorNumber+"\n"+b);
                            }
                        }
                    }else{
                        if(b==d){
                            System.out.println(mayorNumber+"\n"+e+"\n"+menorNumber+"\n"+b+"\n"+d);
                        }else if(b>d){
                            System.out.println(mayorNumber+"\n"+e+"\n"+menorNumber+"\n"+d);
                        }else{
                            System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+b);
                        }
                    }


                }else{

                    if(d==e){
                        System.out.println(mayorNumber+"\n"+d+"\n"+e+"\n"+menorNumber+"\n"+b);
                    }else if(d>e){

                        if(c==e){
                            System.out.println(mayorNumber+"\n"+d+"\n"+menorNumber+"\n"+b);
                        }else if(c>e){
                            if(b==e){
                                System.out.println(mayorNumber+"\n"+d+"\n"+menorNumber+"\n"+b+"\n"+e);
                            }else if(b>e){
                                System.out.println(mayorNumber+"\n"+d+"\n"+menorNumber+"\n"+e);
                            }else{
                                System.out.println(mayorNumber+"\n"+d+"\n"+menorNumber+"\n"+b);
                            }
                        }else{
                            System.out.println(mayorNumber+"\n"+d+"\n"+menorNumber+"\n"+b);
                        }
                    }else{
                        System.out.println(mayorNumber+"\n"+e+"\n"+menorNumber+"\n"+b);
                    }
                }

            }else if(a>c){

                if(a==d){

                    if(d==e){

                        if(b==c){
                            System.out.println(mayorNumber+"\n"+a+"\n"+d+"\n"+e+menorNumber+"\n"+b+"\n"+c);
                        }else if(b>c){
                            System.out.println(mayorNumber+"\n"+a+"\n"+d+"\n"+e+menorNumber+"\n"+c);
                        }else{
                            System.out.println(mayorNumber+"\n"+a+"\n"+d+"\n"+e+menorNumber+"\n"+b);
                        }

                    }else if(d>e){

                        if(b==c){

                            if(c==e){
                                System.out.println(mayorNumber+"\n"+a+"\n"+d+menorNumber+"\n"+b+"\n"+c+"\n"+e);
                            }else if(c>e){
                                System.out.println(mayorNumber+"\n"+a+"\n"+d+menorNumber+"\n"+e); 
                            }else{
                                System.out.println(mayorNumber+"\n"+a+"\n"+d+menorNumber+"\n"+b+"\n"+c);
                            }
                        }else if(b>c){

                            if(b==e){
                                System.out.println(mayorNumber+"\n"+a+"\n"+d+"\n"+menorNumber+"\n"+c);
                            }else if(b>e){
                                if(c==e){
                                    System.out.println(mayorNumber+"\n"+a+"\n"+d+"\n"+menorNumber+"\n"+c+"\n"+e);
                                }else if(c>e){
                                    System.out.println(mayorNumber+"\n"+a+"\n"+d+menorNumber+"\n"+e);
                                }else{
                                    System.out.println(mayorNumber+"\n"+a+"\n"+d+menorNumber+"\n"+c);
                                }
                            }else{
                                System.out.println(mayorNumber+"\n"+a+"\n"+d+"\n"+menorNumber+"\n"+c);
                            }

                        }else{

                            if(c==e){
                                System.out.println(mayorNumber+"\n"+a+"\n"+d+menorNumber+"\n"+b);
                            }else if(c>e){

                                if(b==e){
                                    System.out.println(mayorNumber+"\n"+a+"\n"+d+menorNumber+"\n"+b+"\n"+e);
                                }else if(b>e){
                                    System.out.println(mayorNumber+"\n"+a+"\n"+d+menorNumber+"\n"+e);
                                }else{
                                    System.out.println(mayorNumber+"\n"+a+"\n"+d+menorNumber+"\n"+b);
                                }

                            }else{
                                System.out.println(mayorNumber+"\n"+a+"\n"+d+"\n"+e+menorNumber+"\n"+b);
                            }

                        }

                    }else{
                        if(b==c){
                            System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+b+"\n"+c);
                        }else if(b>c){
                            System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+c);
                        }else{
                            System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+b);
                        }

                    }
                }else if(a>d){

                    if(a==e){

                        if(b==c){

                            if(c==d){
                                System.out.println(mayorNumber+"\n"+a+"\n"+e+menorNumber+"\n"+b+"\n"+c+"\n"+d);
                            }else if(c>d){
                                System.out.println(mayorNumber+"\n"+a+"\n"+e+menorNumber+"\n"+d);
                            }else{
                                System.out.println(mayorNumber+"\n"+a+"\n"+e+menorNumber+"\n"+b+"\n"+c);
                            }
                        }else if(b>c){
                            
                            if(b==d){
                                System.out.println(mayorNumber+"\n"+a+"\n"+e+menorNumber+"\n"+c);
                            }else if(b>d){

                                if(c==d){
                                    System.out.println(mayorNumber+"\n"+a+"\n"+e+menorNumber+"\n"+c+"\n"+d);
                                }else if(c>d){
                                    System.out.println(mayorNumber+"\n"+a+"\n"+e+menorNumber+"\n"+d);
                                }else{
                                    System.out.println(mayorNumber+"\n"+a+"\n"+e+menorNumber+"\n"+c);
                                }

                            }else{
                                System.out.println(mayorNumber+"\n"+a+"\n"+e+menorNumber+"\n"+c);
                            }

                        }else{

                            if(c==d){
                                System.out.println(mayorNumber+"\n"+a+"\n"+e+menorNumber+"\n"+b);
                            }else if(c>d){

                                if(b==d){
                                    System.out.println(mayorNumber+"\n"+a+"\n"+e+menorNumber+"\n"+b+"\n"+d);        
                                }else if(b>d){
                                    System.out.println(mayorNumber+"\n"+a+"\n"+e+menorNumber+"\n"+d);
                                }else{
                                    System.out.println(mayorNumber+"\n"+a+"\n"+e+menorNumber+"\n"+b);
                                }

                            }else{
                                System.out.println(mayorNumber+"\n"+a+"\n"+e+menorNumber+"\n"+b);
                            }

                        }


                    }else if(a>e){

                        if(b==c){

                            if(c==d){

                                if(d==e){
                                    System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+b+"\n"+c+"\n"+d+"\n"+e);
                                }else if(d>e){
                                    System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+e);
                                }else{
                                    System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+b+"\n"+c+"\n"+d);
                                }
                            }else if(c>d){

                                if(c==e){
                                    System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+d);
                                }else if(c>e){

                                    if(d==e){
                                        System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+d+"\n"+e);
                                    }else if(d>e){
                                        System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+e+"linea 552");
                                    }else {
                                        System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+d);
                                    }

                                }else{
                                    System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+d);
                                }

                            }else{
                                
                                if(d==e){
                                    System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+b+"\n"+c);
                                }else if(d>e){

                                    if(c==e){
                                        System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+b+"\n"+c+"\n"+e);
                                    }else if(c>e){
                                        System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+e);
                                    }else{
                                        System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+b+"\n"+c);
                                    }

                                }else {
                                    System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+b+"\n"+c);
                                }

                            }

                        }else if(b>c){

                            if(b==d){

                                if(d==e){
                                    System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+c);
                                }else if(d>e){

                                    if(c==e){
                                        System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+c+"\n"+e);
                                    }else if(c>e){
                                        System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+e);
                                    }else{
                                        System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+c);
                                    }

                                }else{
                                    System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+c);
                                }

                            }else if(b>d){

                                if(b==e){

                                    if(c==d){
                                        System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+c+"\n"+d);
                                    }else if(c>d){
                                        System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+d);
                                    }else{
                                        System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+c);
                                    }
                                }else if(b>e){

                                    if(c==d){

                                        if(d==e){
                                            System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+c+"\n"+d+"\n"+e);
                                        }else if(d>e){
                                            System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+e);
                                        }else{
                                            System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+c+"\n"+d);
                                        }

                                    }else if(c>d){

                                        if(c==e){
                                            System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+d);
                                        }else if(c>e){

                                            if(d==e){
                                                System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+d+"\n"+e);
                                            }else if(d>e){
                                                System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+e);
                                            }else{
                                                System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+d);
                                            }

                                        }else{
                                            System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+d);
                                        }

                                    }else{

                                        if(d==e){
                                            System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+c);
                                        }else if(d>e){

                                            if(c==e){
                                                System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+c+"\n"+e);
                                            }else if(c>e){
                                                System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+e);
                                            }else{
                                                System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+c);
                                            }

                                        }else{
                                            System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+c);
                                        }

                                    }
                                }else {
                                    
                                    if(c==d){
                                        System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+c+"\n"+d);
                                    }else if(c>d){
                                        System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+d);
                                    }else{
                                        System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+c);
                                    }

                                }

                            }else{

                                if(d==e){
                                    System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+c);
                                }else if(d>e){

                                    if(b==e){
                                        System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+c);
                                    }else if(b>e){

                                        if(c==e){
                                            System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+c+"\n"+e);
                                        }else if(c>e){
                                            System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+e);
                                        }else{
                                            System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+c);
                                        }

                                    }else{
                                        System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+c);
                                    }

                                }else{
                                    System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+c);
                                }

                            }

                        }else{

                            if(c==d){

                                if(d==e){
                                    System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+b);
                                }else if(d>e){

                                    if(b==e){
                                        System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+b+"\n"+e);
                                    }else if(b>e){
                                        System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+e);
                                    }else{
                                        System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+b);
                                    }

                                }else{
                                    System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+b);
                                }

                            }else if(c>d){

                                if(c==e){

                                    if(b==d){
                                        System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+b+"\n"+d);
                                    }else if(b>d){
                                        System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+d);
                                    }else{
                                        System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+b);
                                    }

                                }else if(c>e){

                                    if(b==d){

                                        if(d==e){
                                            System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+b+"\n"+d+"\n"+e);
                                        }else if(d>e){
                                            System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+e);
                                        }else{
                                            System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+b+"\n"+d);
                                        }

                                    }else if(b>d){

                                        if(b==e){
                                            System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+d);
                                        }else if(b>e){

                                            if(d==e){
                                                System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+d+"\n"+e);
                                            }else if(d>e){
                                                System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+e);
                                            }else{
                                                System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+d);
                                            }

                                        }else{
                                            System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+d);
                                        }

                                    }else{

                                        if(d==e){
                                            System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+b);
                                        }else if(d>e){

                                            if(b==e){
                                                System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+b+"\n"+e);
                                            }else if(b>e){
                                                System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+e);
                                            }else{
                                                System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+b);
                                            }

                                        }else {
                                            System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+b);
                                        }

                                    }

                                }else{

                                    if(b==d){
                                        System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+b+"\n"+d);
                                    }else if(b>d){
                                        System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+d);
                                    }else{
                                        System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+b);
                                    }

                                }

                            }else{

                                if(d==e){
                                    System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+b);
                                }else if(d>e){

                                    if(c==e){
                                        System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+b);
                                    }else if(c>e){

                                        if(b==e){
                                            System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+b+"\n"+e);
                                        }else if(b>e){
                                            System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+e);
                                        }else{
                                            System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+b);
                                        }

                                    }else{
                                        System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+b);
                                    }

                                }else{
                                    System.out.println(mayorNumber+"\n"+a+menorNumber+"\n"+b);
                                }

                            }

                        }


                    }else{

                        if(b==c){

                            if(c==d){
                                System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+b+"\n"+c+"\n"+d);
                            }else if(c>d){
                                System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+d);
                            }else{
                                System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+b+"\n"+c);
                            }

                        }else if(b>c){

                            if(b==d){
                                System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+c);
                            }else if(b>d){

                                if(c==d){
                                    System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+c+"\n"+d);
                                }else if(c>d){
                                    System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+d);
                                }else{
                                    System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+c);
                                }

                            }else{
                                System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+c);
                            }

                        }else{

                            if(c==d){
                                System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+b);
                            }else if(c>d){

                                if(b==d){
                                    System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+b+"\n"+d);
                                }else if(b>d){
                                    System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+d);
                                }else{
                                    System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+b);
                                }

                            }else{
                                System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+b);
                            }

                        }

                    }    
                }else{

                    if(d==e){

                        if(b==c){
                            System.out.println(mayorNumber+"\n"+d+"\n"+e+menorNumber+"\n"+b+"\n"+c);
                        }else if(b>c){
                            System.out.println(mayorNumber+"\n"+d+"\n"+e+menorNumber+"\n"+c);
                        }else{
                            System.out.println(mayorNumber+"\n"+d+"\n"+e+menorNumber+"\n"+b);
                        }

                    }else if(d>e){

                        if(a==e){

                            if(b==c){
                                System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+b+"\n"+c);
                            }else if(b>c){
                                System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+c);
                            }else{
                                System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+b);
                            }

                        }else if(a>e){

                            if(b==c){

                                if(c==e){
                                    System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+b+"\n"+c+"\n"+e);
                                }else if(c>e){
                                    System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+e);
                                }else{
                                    System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+b+"\n"+c);
                                }

                            }else if(b>c){

                                if(b==e){
                                    System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+c);
                                }else if(b>e){

                                    if(c==e){
                                        System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+c+"\n"+e);
                                    }else if(c>e){
                                        System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+e);
                                    }else{
                                        System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+c);
                                    }

                                }else{
                                    System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+c);
                                }

                            }else{

                                if(c==e){
                                    System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+b);
                                }else if(c>e){

                                    if(b==e){
                                        System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+b+"\n"+e);
                                    }else if(b>e){
                                        System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+e);
                                    }else{
                                        System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+b);
                                    }

                                }else{
                                    System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+b);
                                }

                            }

                        }else{

                            if(b==c){
                                System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+b+"\n"+c);
                            }else if(b>c){
                                System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+c);
                            }else{
                                System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+b);
                            }

                        }

                    }else{
                        if(b==c){
                            System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+b+"\n"+c);
                        }else if(b>c){
                            System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+c);
                        }else{
                            System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+b);
                        }
                    }

                }

            }else{

                if(c==d){

                    if(d==e){
                        System.out.println(mayorNumber+"\n"+c+"\n"+d+"\n"+e+menorNumber+"\n"+b);
                    }else if(d>e){

                        if(a==e){
                            System.out.println(mayorNumber+"\n"+c+"\n"+d+menorNumber+"\n"+b);
                        }else if(a>e){

                            if(b==e){
                                System.out.println(mayorNumber+"\n"+c+"\n"+d+menorNumber+"\n"+b+"\n"+e);
                            }else if(b>e){
                                System.out.println(mayorNumber+"\n"+c+"\n"+d+menorNumber+"\n"+e);
                            }else{
                                System.out.println(mayorNumber+"\n"+c+"\n"+d+menorNumber+"\n"+b);
                            }

                        }else{
                            System.out.println(mayorNumber+"\n"+c+"\n"+d+menorNumber+"\n"+b);
                        }

                    }else{
                        System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+b);
                    }

                }else if(c>d){

                    if(c==e){

                        if(a==d){
                            System.out.println(mayorNumber+"\n"+c+"\n"+e+menorNumber+"\n"+b);
                        }else if(a>d){
                            if(b==d){
                                System.out.println(mayorNumber+"\n"+c+"\n"+e+menorNumber+"\n"+b+"\n"+d);
                            }else if(b>d){
                                System.out.println(mayorNumber+"\n"+c+"\n"+e+menorNumber+"\n"+d);
                            }else{
                                System.out.println(mayorNumber+"\n"+c+"\n"+e+menorNumber+"\n"+b);
                            }
                        }else{
                            System.out.println(mayorNumber+"\n"+c+"\n"+e+menorNumber+"\n"+b);
                        }

                    }else if(c>e){

                        if(a==d){

                            if(d==e){
                                System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+b);
                            }else if(d>e){
                                if(b==e){
                                    System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+b+"\n"+e);
                                }else if(b>e){
                                    System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+e);
                                }else{
                                    System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+b);
                                }
                            }else{
                                System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+b);
                            }

                        }else if(a>d){
                            if(a==e){
                                if(b==d){
                                    System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+b+"\n"+d);
                                }else if(b>d){
                                    System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+d);
                                }else{
                                    System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+b);
                                }
                            }else if(a>e){
                                if(b==d){
                                    if(d==e){
                                        System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+b+"\n"+d+"\n"+e);
                                    }else if(d>e){
                                        System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+e);
                                    }else{
                                        System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+b+"\n"+d);
                                    }
                                }else if(b>d){
                                    if(b==e){
                                        System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+d);
                                    }else if(b>e){
                                        if(d==e){
                                            System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+d+"\n"+e);
                                        }else if(d>e){
                                            System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+e);
                                        }else{
                                            System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+d);
                                        }
                                    }else{
                                        System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+d);
                                    }
                                }else{

                                    if(d==e){
                                        System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+b);
                                    }else if(d>e){
                                        if(b==e){
                                            System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+b+"\n"+e);
                                        }else if(b>e){
                                            System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+e);
                                        }else{
                                            System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+b);
                                        }
                                    }else{
                                        System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+b);
                                    }

                                }
                            }else{
                                if(b==d){
                                    System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+b+"\n"+d);
                                }else if(b>d){
                                    System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+d);
                                }else{
                                    System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+b);
                                }
                            }
                        }else{
                            if(d==e){
                                System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+b);
                            }else if(d>e){
                                if(a==e){
                                    System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+b);
                                }else if(a>e){
                                    if(b==e){
                                        System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+b+"\n"+e);
                                    }else if(b>e){
                                        System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+e);
                                    }else{
                                        System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+b);
                                    }
                                }else{
                                    System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+b);
                                }
                            }else{
                                System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+b);
                            }
                        }

                    }else{
                        if(a==d){
                            System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+b);
                        }else if(a>d){
                            if(b==d){
                                System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+b+"\n"+d);
                            }else if(b>d){
                                System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+d);
                            }else{
                                System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+b);
                            }
                        }else{
                            System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+b);
                        }
                    }

                }else{
                    if(d==e){
                        System.out.println(mayorNumber+"\n"+d+"\n"+e+menorNumber+"\n"+b);
                    }else if(d>e){
                        if(c==e){
                            System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+b);
                        }else if(c>e){
                            if(a==e){
                                System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+b);
                            }else if(a>e){
                                if(b==e){
                                    System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+b+"\n"+e);
                                }else if(b>e){
                                    System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+e);
                                }else{
                                    System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+b);
                                }
                            }else{
                                System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+b);
                            }
                        }else{
                            System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+b);
                        }
                    }else{
                        System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+b);
                    }
                }

            }

        }else{

            if(b==c){
                if(c==d){
                    if(d==e){
                        System.out.println(mayorNumber+"\n"+b+"\n"+c+"\n"+d+"\n"+e+menorNumber+"\n"+a);
                    }else if(d>e){
                        if(a==e){
                            System.out.println(mayorNumber+"\n"+b+"\n"+c+"\n"+d+menorNumber+"\n"+a+"\n"+e);
                        }else if(a>e){
                            System.out.println(mayorNumber+"\n"+b+"\n"+c+"\n"+d+menorNumber+"\n"+e);
                        }else{
                            System.out.println(mayorNumber+"\n"+b+"\n"+c+"\n"+d+menorNumber+"\n"+a);
                        }
                    }else{
                        System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+a);
                    }
                }else if(c>d){
                    if(c==e){
                        if(a==d){
                            System.out.println(mayorNumber+"\n"+b+"\n"+c+"\n"+e+menorNumber+"\n"+a+"\n"+d);
                        }else if(a>d){
                            System.out.println(mayorNumber+"\n"+b+"\n"+c+"\n"+e+menorNumber+"\n"+d);
                        }else{
                            System.out.println(mayorNumber+"\n"+b+"\n"+c+"\n"+e+menorNumber+"\n"+a);
                        }
                    }else if(c>e){
                        if(a==d){
                            if(d==e){
                                System.out.println(mayorNumber+"\n"+b+"\n"+c+menorNumber+"\n"+a+"\n"+d+"\n"+e);
                            }else if(d>e){
                                System.out.println(mayorNumber+"\n"+b+"\n"+c+menorNumber+"\n"+e);
                            }else{
                                System.out.println(mayorNumber+"\n"+b+"\n"+c+menorNumber+"\n"+a+"\n"+d);       
                            }
                        }else if(a>d){
                            if(a==e){
                                System.out.println(mayorNumber+"\n"+b+"\n"+c+menorNumber+"\n"+d);
                            }else if(a>e){
                                if(d==e){
                                    System.out.println(mayorNumber+"\n"+b+"\n"+c+menorNumber+"\n"+d+"\n"+e);
                                }else if(d>e){
                                    System.out.println(mayorNumber+"\n"+b+"\n"+c+menorNumber+"\n"+e);
                                }else{
                                    System.out.println(mayorNumber+"\n"+b+"\n"+c+menorNumber+"\n"+d);
                                }
                            }else{
                                System.out.println(mayorNumber+"\n"+b+"\n"+c+menorNumber+"\n"+d);
                            }
                        }else{
                            if(d==e){
                                System.out.println(mayorNumber+"\n"+b+"\n"+c+menorNumber+"\n"+a);
                            }else if(d>e){
                                if(a==e){
                                    System.out.println(mayorNumber+"\n"+b+"\n"+c+menorNumber+"\n"+a+"\n"+e);
                                }else if(a>e){
                                    System.out.println(mayorNumber+"\n"+b+"\n"+c+menorNumber+"\n"+e);
                                }else{
                                    System.out.println(mayorNumber+"\n"+b+"\n"+c+menorNumber+"\n"+a);
                                }
                            }else{
                                System.out.println(mayorNumber+"\n"+b+"\n"+c+menorNumber+"\n"+a);
                            }
                        }
                    }else{
                        if(a==d){
                            System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+a+"\n"+d);
                        }else if(a>d){
                            System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+d);
                        }else{
                            System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+a);
                        }
                    }
                }else{

                    if(d==e){
                        System.out.println(mayorNumber+"\n"+d+"\n"+e+menorNumber+"\n"+a);
                    }else if(d>e){

                        if(c==e){
                            System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+a);
                        }else if(c>e){
                            if(a==e){
                                System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+a+"\n"+e);
                            }else if(a>e){
                                System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+e);
                            }else{
                                System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+a);
                            }
                        }else{
                            System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+a);
                        }

                    }else{
                        System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+a);
                    }
                }
            }else if(b>c){
                if(b==d){
                    if(d==e){
                        if(a==c){
                            System.out.println(mayorNumber+"\n"+b+"\n"+d+"\n"+e+menorNumber+"\n"+a+"\n"+c);
                        }else if(a>c){
                            System.out.println(mayorNumber+"\n"+b+"\n"+d+"\n"+e+menorNumber+"\n"+c);
                        }else{
                            System.out.println(mayorNumber+"\n"+b+"\n"+d+"\n"+e+menorNumber+"\n"+a);
                        }
                    }else if(d>e){
                        if(a==c){
                            if(c==e){
                                System.out.println(mayorNumber+"\n"+b+"\n"+d+menorNumber+"\n"+a+"\n"+c+"\n"+e);
                            }else if(c>e){
                                System.out.println(mayorNumber+"\n"+b+"\n"+d+menorNumber+"\n"+e);
                            }else{
                                System.out.println(mayorNumber+"\n"+b+"\n"+d+menorNumber+"\n"+a+"\n"+c);
                            }
                        }else if(a>c){
                            if(a==e){
                                System.out.println(mayorNumber+"\n"+b+"\n"+d+menorNumber+"\n"+c);
                            }else if(a>e){
                                if(c==e){
                                    System.out.println(mayorNumber+"\n"+b+"\n"+d+menorNumber+"\n"+c+"\n"+e);
                                }else if(c>e){
                                    System.out.println(mayorNumber+"\n"+b+"\n"+d+menorNumber+"\n"+e);
                                }else{
                                    System.out.println(mayorNumber+"\n"+b+"\n"+d+menorNumber+"\n"+c);
                                }
                            }else{
                                System.out.println(mayorNumber+"\n"+b+"\n"+d+menorNumber+"\n"+c);
                            }
                        }else{
                            if(c==e){
                                System.out.println(mayorNumber+"\n"+b+"\n"+d+menorNumber+"\n"+a);
                            }else if(c>e){
                                if(a==e){
                                    System.out.println(mayorNumber+"\n"+b+"\n"+d+menorNumber+"\n"+a+"\n"+e);
                                }else if(a>e){
                                    System.out.println(mayorNumber+"\n"+b+"\n"+d+menorNumber+"\n"+e);
                                }else{
                                    System.out.println(mayorNumber+"\n"+b+"\n"+d+menorNumber+"\n"+a);
                                }
                            }else{
                                System.out.println(mayorNumber+"\n"+b+"\n"+d+menorNumber+"\n"+a);
                            }
                        }
                    }else{
                        System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+a);
                    }
                }else if(b>d){
                    if(b==e){
                        if(a==c){
                            if(c==d){
                                System.out.println(mayorNumber+"\n"+b+"\n"+e+menorNumber+"\n"+a+"\n"+c+"\n"+d);
                            }else if(c>d){
                                System.out.println(mayorNumber+"\n"+b+"\n"+e+menorNumber+"\n"+d);
                            }else{
                                System.out.println(mayorNumber+"\n"+b+"\n"+e+menorNumber+"\n"+a+"\n"+c);
                            }               
                        }else if(a>c){
                            if(a==d){
                                System.out.println(mayorNumber+"\n"+b+"\n"+e+menorNumber+"\n"+c);
                            }else if(a>d){
                                if(c==d){
                                    System.out.println(mayorNumber+"\n"+b+"\n"+e+menorNumber+"\n"+c+"\n"+d);    
                                }else if(c>d){
                                    System.out.println(mayorNumber+"\n"+b+"\n"+e+menorNumber+"\n"+d);    
                                }else{
                                    System.out.println(mayorNumber+"\n"+b+"\n"+e+menorNumber+"\n"+c);    
                                }

                            }else{
                                System.out.println(mayorNumber+"\n"+b+"\n"+e+menorNumber+"\n"+c);    
                            }
                        }else{
                            if(c==d){
                                System.out.println(mayorNumber+"\n"+b+"\n"+e+menorNumber+"\n"+a);    
                            }else if(c>d){
                                if(a==d){
                                    System.out.println(mayorNumber+"\n"+b+"\n"+e+menorNumber+"\n"+a+"\n"+d);    
                                }else if(a>d){
                                    System.out.println(mayorNumber+"\n"+b+"\n"+e+menorNumber+"\n"+d);    
                                }else{
                                    System.out.println(mayorNumber+"\n"+b+"\n"+e+menorNumber+"\n"+a);    
                                }
                            }else{
                                System.out.println(mayorNumber+"\n"+b+"\n"+e+menorNumber+"\n"+a);    
                            }
                        }
                    }else if(b>e){
                        if(a==c){
                            if(c==d){
                                if(d==e){
                                    System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+a+"\n"+c+"\n"+d+"\n"+e);
                                }else if(d>e){
                                    System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+e);
                                }else{
                                    System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+a+"\n"+c+"\n"+d);
                                }
                            }else if(c>d){
                                if(c==e){
                                    System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+d);
                                }else if(c>e){
                                    if(d==e){
                                        System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+d+"\n"+e);
                                    }else if(d>e){
                                        System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+e);
                                    }else{
                                        System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+d);
                                    }
                                }else{
                                    System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+d);
                                }
                            }else{
                                if(d==e){
                                    System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+a+"\n"+c);
                                }else if(d>e){
                                    if(c==e){
                                        System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+a+"\n"+c+"\n"+e);
                                    }else if(c>e){
                                        System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+e);
                                    }else{
                                        System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+a+"\n"+c);
                                    }
                                }else{
                                    System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+a+"\n"+c);
                                }
                            }
                        }else if(a>c){
                            if(a==d){
                                if(d==e){
                                    System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+c);
                                }else if(d>e){
                                    if(c==e){
                                        System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+c+"\n"+e);
                                    }else if(c>e){
                                        System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+e);
                                    }else{
                                        System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+c);
                                    }
                                }else{
                                    System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+c);
                                }
                            }else if(a>d){
                                if(a==e){
                                    if(c==d){
                                        System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+c+"\n"+d);
                                    }else if(c>d){
                                        System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+d);
                                    }else{
                                        System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+c);
                                    }
                                }else if(a>e){
                                    if(c==d){
                                        if(d==e){
                                            System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+c+"\n"+d+"\n"+e);
                                        }else if(d>e){
                                            System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+e);
                                        }else{
                                            System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+c+"\n"+d);
                                        }
                                    }else if(c>d){
                                        if(c==e){
                                            System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+d);
                                        }else if(c>e){
                                            if(d==e){
                                                System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+d+"\n"+e);
                                            }else if(d>e){
                                                System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+e);
                                            }else{
                                                System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+d);
                                            }
                                        }else{
                                            System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+d);
                                        }
                                    }else{
                                        if(d==e){
                                            System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+c);
                                        }else if(d>e){
                                            if(c==e){
                                                System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+c+"\n"+e);
                                            }else if(c>e){
                                                System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+e);
                                            }else{
                                                System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+c);
                                            }
                                        }else{
                                            System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+c);
                                        }
                                    }
                                }else{
                                    if(c==d){
                                        System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+c+"\n"+d);
                                    }else if(c>d){
                                        System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+d);
                                    }else {
                                        System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+c);
                                    }
                                }
                            }else{
                                if(d==e){
                                    System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+c);
                                }else if(d>e){
                                    if(a==e){
                                        System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+c);
                                    }else if(a>e){
                                        if(c==e){
                                            System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+c+"\n"+e);
                                        }else if(c>e){
                                            System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+e);
                                        }else{
                                            System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+c);
                                        }
                                    }else{
                                        System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+c);
                                    }
                                }else{
                                    System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+c);
                                }
                            }
                        }else{
                            if(c==d){
                                if(d==e){
                                    System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+a);
                                }else if(d>e){
                                    if(a==e){
                                        System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+a+"\n"+e);
                                    }else if(a>e){
                                        System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+e);
                                    }else {
                                        System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+a);
                                    }
                                }else{
                                    System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+a);
                                }
                            }else if(c>d){
                                if(c==e){
                                    if(a==d){
                                        System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+a+"\n"+d);
                                    }else if(a>d){
                                        System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+d);
                                    }else{
                                        System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+a);
                                    }
                                }else if(c>e){
                                    if(a==d){
                                        if(d==e){
                                            System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+a+"\n"+d+"\n"+e);
                                        }else if(d>e){
                                            System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+e);
                                        }else{
                                            System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+a+"\n"+d);
                                        }
                                    }else if(a>d){
                                        if(a==e){
                                            System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+d);
                                        }else if(a>e){
                                            if(d==e){
                                                System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+d+"\n"+e);
                                            }else if(d>e){
                                                System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+e);
                                            }else{
                                                System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+d);
                                            }
                                        }else{
                                            System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+d);
                                        }
                                    }else{
                                        if(d==e){
                                            System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+a);
                                        }else if(d>e){
                                            if(a==e){
                                                System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+a+"\n"+e);
                                            }else if(a>e){
                                                System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+e);
                                            }else{
                                                System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+a);
                                            }
                                        }else{
                                            System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+a);
                                        }
                                    }
                                }else{
                                    if(a==d){
                                        System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+a+"\n"+d);
                                    }else if(a>d){
                                        System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+d);
                                    }else{
                                        System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+a);
                                    }
                                }
                            }else{
                                if(d==e){
                                    System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+a);
                                }else if(d>e){
                                    if(c==e){
                                        System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+a);
                                    }else if(c>e){
                                        if(a==e){
                                            System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+a+"\n"+e);
                                        }else if(a>e){
                                            System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+e);
                                        }else{
                                            System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+a);
                                        }
                                    }else{
                                        System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+a);
                                    }
                                }else{
                                    System.out.println(mayorNumber+"\n"+b+menorNumber+"\n"+a);
                                }
                            }
                        }
                    }else{
                        if(a==c){
                            if(c==d){
                                System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+a+"\n"+c+"\n"+d);
                            }else if(c>d){
                                System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+d);
                            }else{
                                System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+a+"\n"+c);
                            }
                        }else if(a>c){
                            if(a==d){
                                System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+c);
                            }else if(a>d){
                                if(c==d){
                                    System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+c+"\n"+d);
                                }else if(c>d){
                                    System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+d);
                                }else{
                                    System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+c);
                                }
                            }else{
                                System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+c);
                            }
                        }else{
                            if(c==d){
                                System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+a);
                            }else if(c>d){
                                if(a==d){
                                    System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+a+"\n"+d);
                                }else if(a>d){
                                    System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+d);
                                }else{
                                    System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+a);
                                }
                            }else{
                                System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+a);
                            }
                        }
                    }
                }else{
                    if(d==e){
                        if(a==c){
                            System.out.println(mayorNumber+"\n"+d+"\n"+e+menorNumber+"\n"+a+"\n"+c);
                        }else if(a>c){
                            System.out.println(mayorNumber+"\n"+d+"\n"+e+menorNumber+"\n"+c);
                        }else{
                            System.out.println(mayorNumber+"\n"+d+"\n"+e+menorNumber+"\n"+a);
                        }
                    }else if(d>e){
                        if(b==e){
                            if(a==c){
                                System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+a+"\n"+c);
                            }else if(a>c){
                                System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+c);
                            }else{
                                System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+a);
                            }
                        }else if(b>e){
                            if(a==c){
                                if(c==e){
                                    System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+a+"\n"+c+"\n"+e);
                                }else if(c>e){
                                    System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+e);
                                }else{
                                    System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+a+"\n"+c);
                                }
                            }else if(a>c){
                                if(a==e){
                                    System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+c);
                                }else if(a>e){
                                    if(c==e){
                                        System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+c+"\n"+e);
                                    }else if(c>e){
                                        System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+e);
                                    }else{
                                        System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+c);
                                    }
                                }else{
                                    System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+c);
                                }
                            }else{
                                if(c==e){
                                    System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+a);
                                }else if(c>e){
                                    if(a==e){
                                        System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+a+"\n"+e);
                                    }else if(a>e){
                                        System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+e);
                                    }else{
                                        System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+a);
                                    }
                                }else{
                                    System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+a);
                                }
                            }
                        }else{
                            if(a==c){
                                System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+a+"\n"+c);        
                            }else if(a>c){
                                System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+c);
                            }else{
                                System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+a);
                            }
                        }
                    }else{
                        if(a==c){
                            System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+a+"\n"+c);
                        }else if(a>c){
                            System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+c);
                        }else{
                            System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+a);
                        }
                    }
                }
            }else{

                if(c==d){

                    if(d==e){
                       System.out.println(mayorNumber+"\n"+c+"\n"+d+"\n"+e+menorNumber+"\n"+a);         
                    }else if(d>e){
                        if(b==e){
                            System.out.println(mayorNumber+"\n"+c+"\n"+d+menorNumber+"\n"+a);
                        }else if(b>e){
                            if(a==e){
                                System.out.println(mayorNumber+"\n"+c+"\n"+d+menorNumber+"\n"+a+"\n"+e);
                            }else if(a>e){
                                System.out.println(mayorNumber+"\n"+c+"\n"+d+menorNumber+"\n"+e);
                            }else{
                                System.out.println(mayorNumber+"\n"+c+"\n"+d+menorNumber+"\n"+a);
                            }
                        }else{
                            System.out.println(mayorNumber+"\n"+c+"\n"+d+menorNumber+"\n"+a);
                        }
                    }else{
                        System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+a);
                    }
                }else if(c>d){

                    if(c==e){
                        if(b==d){
                            System.out.println(mayorNumber+"\n"+c+"\n"+e+menorNumber+"\n"+a);
                        }else if(b>d){
                            if(a==d){
                                System.out.println(mayorNumber+"\n"+c+"\n"+e+menorNumber+"\n"+a+"\n"+d);          
                            }else if(a>d){
                                System.out.println(mayorNumber+"\n"+c+"\n"+e+menorNumber+"\n"+d);
                            }else{
                                System.out.println(mayorNumber+"\n"+c+"\n"+e+menorNumber+"\n"+a);
                            }         
                        }else{
                            System.out.println(mayorNumber+"\n"+c+"\n"+e+menorNumber+"\n"+a);
                        }
                    }else if(c>e){

                        if(b==d){

                            if(d==e){
                                System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+a);
                            }else if(d>e){
                                if(a==e){
                                    System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+a+"\n"+e);
                                }else if(a>e){
                                    System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+e);
                                }else{
                                    System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+a);
                                }
                            }else{
                                System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+a);
                            }

                        }else if(b>d){
                            if(b==e){
                                if(a==d){
                                    System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+a+"\n"+d);
                                }else if(a>d){
                                    System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+d);
                                }else{
                                    System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+a);
                                }
                            }else if(b>e){
                                if(a==d){
                                    if(d==e){
                                        System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+a+"\n"+d+"\n"+e);
                                    }else if(d>e){
                                        System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+e);
                                    }else{
                                        System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+a+"\n"+d);
                                    }
                                }else if(a>d){
                                    if(a==e){
                                        System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+d);
                                    }else if(a>e){
                                        if(d==e){
                                            System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+d+"\n"+e);
                                        }else if(d>e){
                                            System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+e);
                                        }else{
                                            System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+d);
                                        }
                                    }else{
                                        System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+d);
                                    }
                                }else{
                                    if(d==e){
                                        System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+a);
                                    }else if(d>e){
                                        if(a==e){
                                            System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+a+"\n"+e);
                                        }else if(a>e){
                                            System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+e);
                                        }else{
                                            System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+a);
                                        }
                                    }else{
                                        System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+a);
                                    }
                                }
                            }else{
                                System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+a);
                            }
                        }else {
                            if(d==e){
                                System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+a);
                            }else if(d>e){
                                if(b==e){
                                    System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+a);
                                }else if(b>e){
                                    if(a==e){
                                        System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+a+"\n"+e);
                                    }else if(a>e){
                                        System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+e);
                                    }else{
                                        System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+a);
                                    }
                                }else{
                                    System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+a);
                                }
                            }else{
                                System.out.println(mayorNumber+"\n"+c+menorNumber+"\n"+a);
                            }
                        }


                    }else{
                        if(b==d){
                            System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+a);
                        }else if(b>d){
                            if(a==d){
                                System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+a+"\n"+d);
                            }else if(a>d){
                                System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+d);
                            }else{
                                System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+a);
                            }
                        }else{
                            System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+a);
                        }
                    }
                }else{
                    if(d==e){
                        System.out.println(mayorNumber+"\n"+d+"\n"+e+menorNumber+"\n"+a);
                    }else if(d>e){
                        if(c==e){
                            System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+a);
                        }else if(c>e){
                            if(b==e){
                                System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+a);
                            }else if(b>e){
                                if(a==e){
                                    System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+a+"\n"+e);
                                }else if(a>e){
                                    System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+e);
                                }else{
                                    System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+a);
                                }
                            }else{
                                System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+a);
                            }
                        }else{
                            System.out.println(mayorNumber+"\n"+d+menorNumber+"\n"+a);
                        }
                    }else{
                        System.out.println(mayorNumber+"\n"+e+menorNumber+"\n"+a);
                    }
                }

                
            }
                
            
        }  

    }//end main

}//end CompareFiveIntegerNumbers