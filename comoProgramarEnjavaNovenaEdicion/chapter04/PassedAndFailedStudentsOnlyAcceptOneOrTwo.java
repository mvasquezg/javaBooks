/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Programa 22: Show only the students with value one or two, if the value is diferent to into in bucle.
*/
import java.util.Scanner;

public class PassedAndFailedStudentsOnlyAcceptOneOrTwo{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int passed=0;
        int failed=0;
        int studentAccountant=1;
        int result=0;

        while(studentAccountant<=10){
            
            System.out.print(studentAccountant+".-Escriba el resultado (1=Aprobado, 2=Reprobado): ");
            result=in.nextInt();
            
            while(result!=1 && result!=2){
                System.out.print("Escriba el resultado (1=Aprobado, 2=Reprobado): ");
                result=in.nextInt();
            }  
            
            if(result==1){
                passed=passed+1;
            }else{
                failed=failed+1;
            }

            studentAccountant=studentAccountant+1;
        }//end while

        System.out.println("\nAprobados: "+passed+"\nReprobados: "+failed);

        if(passed>8){
            System.out.println("Bono para el instructor.");
        }
    }//end main
}//end PassedAndFailedStudents