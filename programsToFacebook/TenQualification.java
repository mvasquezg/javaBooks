import java.util.Scanner;

public class TenQualification{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);//se crea el objeto para poder leer datos desde la terminal
        
        int[] arrayQualification=new int[10];//Se declara un arreglo de 10 elementos
        
        int sumTotalQualification=0;//Variable que almacena la suma de todas las calificaciones
        int cal8=0;//almacena las calificaciones mayores a 8
        int cal6=0;//almacena las calificaciones mayores a 6
        int cal=0;//almacena las calificaciones menores a 6
        int averageApro=0;//almacena el porcentaje de alumnos aprovados
        int averageRepro=0;//almacena el porcentaje de alumnos reprovados

        //Comienza el ciclo for para leer diez calificaciones
        for(int i=0; i<arrayQualification.length; i++){

            //Ciclo do-while para no permitir una calificacion diferente entre 0 y 10
            do{
                System.out.print((i+1)+".-Ingrese calificacion: ");
                arrayQualification[i]=in.nextInt();
           
            }while(arrayQualification[i]<0 || arrayQualification[i]>10);
             
            sumTotalQualification+=arrayQualification[i];//Suma el valor que tiene el elemento del array

            if(arrayQualification[i]>6){//Valida que el elemento del array sea mayor a 6
                if(arrayQualification[i]>8){//Si el elemento del array es mayor a 8
                    cal8++;//Si el elemento del array es mayor que 8, se incrementa el contador en 1
                }
                cal6++;//Si el elemento del array es mayor a 6 y no a 8 se incremneta el contador en 1
            }else{
                cal++;//Si el elemento del array no es mayor a 8 se incrementa en 1
            }
        }
        
        averageApro=(cal6*100)/arrayQualification.length;//Se obtiene el porcentaje de alumnos aprobados
        averageRepro=(cal*100)/arrayQualification.length;//Se obtiene el porcentaje de alumnos Reprobados

        //Se imprimen en pantalla los resultados
        System.out.println("\nTotal de alumnos aprobados: "+cal6);
        System.out.println("Total de alumnos reprobados: "+cal);
        System.out.println("Total de alumnos con calificacion mayor a 8: "+cal8);
        System.out.println("\nPorcentaje de alumnos aprobados: "+averageApro+"%\nPorcentaje de alumnos reprobados: "+averageRepro+"%");
    }//end main
}//end TenQualification