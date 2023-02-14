import java.util.Scanner;

public class AgricultereYield{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] arrayMonth=new int[12];//Se declara el arreglo y se asgigna valor.
        int countMayorMonths=0;//Se declara el contador de meses mayores,
        int countMenorMonths=0;//Se declara el contador de meses menores.
        int sumTon=0; //se declara la suma total de las toneladas.
        int promYear=0; //Se declara el promedio anual de las toneladas.
        int tonMayor=0;  
        int monthMayor=0;//Se declara el mes con mayor productividad.

        //Con el ciclo for se llena el arreglo, pidiendo los valores en pantalla.
        for(int i=0; i<arrayMonth.length; i++){
            System.out.print((i+1)+".- Ingrese la tonelada porducida: ");
            arrayMonth[i]=in.nextInt();
            sumTon=sumTon+arrayMonth[i];//suma de cada tonelada para obtener el total del año.
        }
    
        promYear=sumTon/arrayMonth.length; //Se calcula el promedio anual
    
        /*Con un ciclo for se determina la cantidad de meses
        que produjeron mayor cantidad al promedio anual
        y se obtiene el mes con mayor produccion   
        */
        tonMayor=arrayMonth[0];

        for(int i=0; i<arrayMonth.length; i++){
            if(arrayMonth[i]>promYear){
                countMayorMonths++;            
            }

            if(arrayMonth[i]>tonMayor){
                tonMayor=arrayMonth[i];
                monthMayor=i;
            }
        }
        monthMayor++;

        /*Con un ciclo for se determina la cantidad de meses
        que produjeron menor cantidad al promedio anual  
        */
        for(int i=0; i<arrayMonth.length; i++){
            
            if(arrayMonth[i]<promYear){
                countMenorMonths++; 
            }
        }

        //Impriendo en pantalla todos los datos
        System.out.println("\n\nEl promedio anual de toneladas producidas: "+promYear+"\n");
        System.out.println("La cantidad de meses que produjeron mayor al promedio son: "+countMayorMonths+" meses\n");
        System.out.println("La cantidad de meses que produjeron menor al promedio son: "+countMenorMonths+" meses\n");
        System.out.println("El mes que produjo mas toneladas es el mes: "+monthMayor+"\n");
    }
}//end AgricultereYield