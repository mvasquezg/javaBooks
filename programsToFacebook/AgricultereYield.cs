class AgricultereYield{
    public static void Main(string[] args){
    int[] arrayMonth=new int[12];//Se declara el arreglo y se asgigna valor.
    int countMayorMonths=0;//Se declara el contador de meses mayores,
    int countMenorMonths=0;//Se declara el contador de meses menores.
    int sumTon=0; //se declara la suma total de las toneladas.
    int promYear=0; //Se declara el promedio anual de las toneladas.
    int tonMayor=0;  
    int monthMayor=0;//Se declara el mes con mayor productividad.

    //Con el ciclo for se llena el arreglo, pidiendo los valores en pantalla.
    for(int i=0; i<arrayMonth.Length; i++){
        System.Console.Write((i+1)+".- Ingrese la tonelada porducida: ");
        arrayMonth[i]=int.Parse(System.Console.ReadLine());
        sumTon=sumTon+arrayMonth[i];//suma de cada tonelada para obtener el total del año.
    }
    
    promYear=sumTon/arrayMonth.Length; //Se calcula el promedio anual
    
    /*Con un ciclo for se determina la cantidad de meses
      que produjeron mayor cantidad al promedio anual
      y se obtiene el mes con mayor produccion   
    */
    tonMayor=arrayMonth[0];

    for(int i=0; i<arrayMonth.Length; i++){
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
    for(int i=0; i<arrayMonth.Length; i++){
    
        if(arrayMonth[i]<promYear){
            countMenorMonths++; 
        }
    }

    //Impriendo en pantalla todos los datos
    System.Console.WriteLine("\n\nEl promedio anual de toneladas producidas: "+promYear+"\n");
    System.Console.WriteLine("La cantidad de meses que produjeron mayor al promedio son: "+countMayorMonths+" meses\n");
    System.Console.WriteLine("La cantidad de meses que produjeron menor al promedio son: "+countMenorMonths+" meses\n");
    System.Console.WriteLine("El mes que produjo mas toneladas es el mes: "+monthMayor+"\n");
}//end main        
}//end AgricultereYield