/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 33: Quality Points.
*/
import java.util.Scanner;

public class QualityPoints{
    static void calculatePointQuality(int cal){
        System.out.println("El valor de cal "+cal);
        if(cal>=90 && cal<=100){
            System.out.println("El estudiante tiene una puntuacion de 4");
        }else if(cal>=80 && cal<90){
            System.out.println("El estudiante tiene una puntuacion de 3");        
        }else if(cal>=70 && cal<80){
            System.out.println("El estudiante tiene una puntuacion de 2");
        }else if(cal>=60 && cal<70){
            System.out.println("El estudiante tiene una puntuacion de 1");
        }else{
            System.out.println("El estudiante tiene una puntuacion de 0");
        }

    }//end calculatePointQuality 
    
    public static void main(String[] arrgs){
        Scanner in=new Scanner(System.in);
        int cal=0;

        do{
            System.out.print("Ingrese la calficacion promedio del alumno: ");
            cal=in.nextInt();

        }while(cal<0 || cal>100);

        calculatePointQuality(cal);
    }//end main
}//end QualityPoints