#include<iostream>
using namespace std;

int main(){
    int lenghtArray=12; //Se declara el Tamaño del arreglo.
    int arrayMonth[lenghtArray];//Se declara el arreglo y se asgigna valor.
    int countMayorMonths=0;//Se declara el contador de meses mayores,
    int countMenorMonths=0;//Se declara el contador de meses menores.
    int sumTon=0; //se declara la suma total de las toneladas.
    int promYear=0; //Se declara el promedio anual de las toneladas.
    int tonMayor=0;  
    int monthMayor=0;//Se declara el mes con mayor productividad.

    //Con el ciclo for se llena el arreglo, pidiendo los valores en pantalla.
    for(int i=0; i<lenghtArray; i++){
        cout<<(i+1)<<".- Ingrese la tonelada porducida: ";
        cin>>arrayMonth[i];
        sumTon=sumTon+arrayMonth[i];//suma de cada tonelada para obtener el total del año.
    }
    
    promYear=sumTon/lenghtArray; //Se calcula el promedio anual
    
    /*Con un ciclo for se determina la cantidad de meses
      que produjeron mayor cantidad al promedio anual
      y se obtiene el mes con mayor produccion   
    */
    tonMayor=arrayMonth[0];

    for(int i=0; i<lenghtArray; i++){
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
    for(int i=0; i<lenghtArray; i++){
    
        if(arrayMonth[i]<promYear){
            countMenorMonths++; 
        }
    }

    //Impriendo en pantalla todos los datos
    cout<<"\n\nEl promedio anual de toneladas producidas: "<<promYear<<"\n";
    cout<<"La cantidad de meses que produjeron mayor al promedio son: "<<countMayorMonths<<" meses\n";
    cout<<"La cantidad de meses que produjeron menor al promedio son: "<<countMenorMonths<<" meses\n";
    cout<<"El mes que produjo mas toneladas es el mes: "<<monthMayor<<"\n";

    return 0;
}