/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 07: Arrays and ArrayList Object.
  *Programa 13: Grade Book using Two-Dimensional array.
*/

public class GradeBookBidimensionalArray{
    private String nameCourse;

    private int[][] arrayQualification;

    public GradeBookBidimensionalArray(String nameCourse, int[][] arrayQualification){
       this.nameCourse=nameCourse;
        this.arrayQualification=arrayQualification; 
    }

    public void setNameCourse(String nameCourse){
        this.nameCourse=nameCourse;
    }//end setNameCourse

    public String getNameCourse(){
        return nameCourse;
    }//End getNameCourse

    public void showMessage(){
        System.out.printf("¡Bienvenido al libro de calificaciones para %s!\n\n", getNameCourse());
    }

    public void processQualification(){
        printQualification();

        //System.out.printf("\nEl promedio de la clase es: %.2f\n", getAverage());

        System.out.printf("\n\nLa calificacion mas baja en el libro de calificaciones es: %d\nLa calificacion mas alta en el libro de calificaciones es: %d\n", getMinimun(), getMaximun());

        printBartChart();
    }

    public int getMinimun(){
        int calMinimun=arrayQualification[0][0];

        //Itera a traves de la fila
        for(int[] calif: arrayQualification){
            
            //Itera a traves de la columnas
            for(int cal: calif){
                if(cal<calMinimun){
                    calMinimun=cal;
                }
            }
        }

        return calMinimun;
    }

    public int getMaximun(){
        int calMaximun=arrayQualification[0][0];

        for(int[] cali: arrayQualification){
            for(int cal: cali){

                if(cal>calMaximun){
                    calMaximun=cal;
                }
            }
            
        }

        return calMaximun;
    }

    public double getAverage(int[] arrayCal){
        int total=0;

        for(int cal:arrayCal){
            total+=cal;
        }   

        return (double) total/arrayCal.length;
    }

    public void printBartChart(){
        System.out.println("\n\nDistribucion de calificaciones: ");

        int[] arrayFrequency=new int[11];

        for(int[] cali: arrayQualification){
            for(int cal: cali){
                ++arrayFrequency[ cal/10];
            } 
        }

        for(int i=0; i<arrayFrequency.length; i++){
            if(i==10){
                System.out.printf("%5d: ", 100);
            }else{
                System.out.printf("%02d-%02d: ", i*10, i*10+9);
            }

            for(int j=0; j<arrayFrequency[i]; j++){
                System.out.printf("*");
            }
            System.out.println();
        }

        System.out.println();
    }  

    public void printQualification(){
        System.out.println("Las calificaciones son:\n ");
        System.out.print("               ");

        for(int i=0; i<arrayQualification[0].length; i++){
            System.out.printf("Prueba %d ", i+1);
        }

        System.out.println("Promedio");

        for(int j=0; j<arrayQualification.length; j++){
            System.out.printf("Estudiante %2d", j+1);

            for(int test: arrayQualification[j]){
                System.out.printf("%8d", test);
            }
            double average=getAverage(arrayQualification[j]);
            System.out.printf("%9.2f\n", average);
        }

        



    }
    
}//end GradeBookBidimensionalArray