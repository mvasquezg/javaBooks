/**Libro: Java 2 Curso de Programacion 4ta Edicion.
    Chapter 01.-Fases en el desarrollo de un programa.
    Programa 003.-Operaciones basicas con tres numeros.
                    Suma
                    Resta
                    Multiplicacion
                    Division    
*/

public class ArithmeticOperations02{
    public static void main(String[] args){
        int data1, data2, data3, result;

        data1=20;
        data2=10;
        data3=5;

        //Sum
        result=data1+data2+data3;
        System.out.println(data1 + " + " + data2 + " + " + data3 + " = " + result);

        //Direfence
        result=data1-data2-data3;
        System.out.println(data1 + " - " + data2 + " - " + data3 + " = " + result);

        //Product
        result=data1*data2*data3;
        System.out.println(data1 + " * " + data2 + " * " + data3 + " = " + result);

        //Div
        result=data1/data2/data3;
        System.out.println(data1 + " / " + data2 + " / " + data3 + " = " + result);                
    }
}