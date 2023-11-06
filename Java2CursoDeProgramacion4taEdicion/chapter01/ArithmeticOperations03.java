/**Libro: Java 2 Curso de Programacion 4ta Edicion.
    Chapter 01.-Fases en el desarrollo de un programa.
    Programa 004.-Operaciones basicas combinadas con tres numeros.
                    Suma
                    Resta
                    Multiplicacion
                    Division    
*/

public class ArithmeticOperations03{
    public static void main(String[] args){
        int data1, data2, data3, result;

        data1=20;
        data2=10;
        data3=5;

        //Sum - diference
        result=data1+data2-data3;
        System.out.println(data1 + " + " + data2 + " - " + data3 + " = " + result);

        //Direfence - product
        result=data1-data2*data3;
        System.out.println(data1 + " - " + data2 + " * " + data3 + " = " + result);

        //Product - Div
        result=data1*data2/data3;
        System.out.println(data1 + " * " + data2 + " / " + data3 + " = " + result);

        //Div - Sum
        result=data1/data2+data3;
        System.out.println(data1 + " / " + data2 + " + " + data3 + " = " + result);                
    }
}