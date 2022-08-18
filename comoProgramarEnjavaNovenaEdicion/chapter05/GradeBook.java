/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 06: Multiple selection switch
*/
import java.util.Scanner;

public class GradeBook{
    
        private String nameCourse;
        
        private int sumTotalCal;
        private int counterCalf;
        private int aCount;
        private int bCount;
        private int cCount;
        private int dCount;
        private int fCount;
        
        //Constructor
        public GradeBook(String nameCourse){
            this.nameCourse=nameCourse;
        }

        //Methods set
        public void setNameCourse(String nameCourse){
            this.nameCourse=nameCourse;
        }

        //Methods get
        public String getNameCourse(){
            return this.nameCourse;
        }

        //Others methods
        public void showMessage(){
            System.out.print("Bienvenido al libro de calificaciones para: "+getNameCourse());
        }

        public void enterRaiting(){
            Scanner in=new Scanner(System.in);

            int qualification=0;

            System.out.print("Escriba las calificaciones enteras en rango de 0 a 100."+
            "\nEscriba el indicador de fin de archivo para terminar la entrada:\n"+
            "En Unix/Linux/Mac OS X escriba <Ctrl> d y despues oprima intro\n"+
            "En Windows escriba <Ctrl> z y despues oprima intro: ");
        

            //Repite hasta que el usuario introduzca el indicador de fin de archivo
            while(in.hasNext()){
                qualification=in.nextInt();
                sumTotalCal=sumTotalCal+qualification;
                ++counterCalf;
                incrementCounterLetterGrade(qualification);
            }
        }

        private void incrementCounterLetterGrade(int qualification){

            switch(qualification/10){
                case 9: 
                case 10:
                    ++aCount;
                    break;
                case 8:
                    ++bCount;
                    break;
                case 7:
                    ++cCount;
                    break;
                case 6:
                    ++dCount;
                    break;
                default:
                    ++fCount;
                    break;
            }//end switch
        }//incrementCounterLetterGrade

        public void showReportCards(){
            System.out.println("\nReporte de Calificaciones");


            if(counterCalf!=0){
                double average=(double) sumTotalCal/counterCalf;

                System.out.println("El total de las "+counterCalf+" calificaciones introducidas es "+sumTotalCal);
                System.out.println("El promedio de la clase es: "+average);
                System.out.println("Numero de estudiantes que recibieron cada calificacion\n"+
                "A: "+aCount+
                "\nB: "+bCount+
                "\nC: "+cCount+
                "\nD: "+dCount+
                "\nF: "+fCount
                );

            
            }else{
                System.out.println("No se introdujeron calificaciones.");
            }

        }
}//end GradeBook