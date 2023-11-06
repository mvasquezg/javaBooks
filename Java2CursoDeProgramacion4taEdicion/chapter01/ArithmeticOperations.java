/**Libro: Java 2 Curso de Programacion 4ta Edicion.
    Chapter 01.-Fases en el desarrollo de un programa.
    Programa 002.-Operaciones basicas con dos numeros.
                    Suma
                    Resta
                    Multiplicacion
                    Division    
*/

public class ArithmeticOperations{
    public static void main(String[] args){
        int data1, data2, result;

        data1=20;
        data2=10;

        //Sum
        result=data1+data2;
        System.out.println(data1 + " + " + data2 + " = " + result);

        //Direfence
        result=data1-data2;
        System.out.println(data1 + " - " + data2 + " = " + result);

        //Product
        result=data1*data2;
        System.out.println(data1 + " * " + data2 + " = " + result);

        //Div
        result=data1/data2;
        System.out.println(data1 + " / " + data2 + " = " + result);                
    }
}