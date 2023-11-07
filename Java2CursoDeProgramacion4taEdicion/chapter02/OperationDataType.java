/**Libro: Java 2 Curso de Programacion 4ta Edicion.
    Chapter 02.-Introduccion a Java.
    Programa 002.-Operacion matematica con difrente tipos de datos.
*/
public class OperationDataType{
    public static void main(String[] args){
        double a=10;
        float b=20;
        int c=2, r=0;

        r=(int)(7.5*Math.sqrt(a)-b/c);

        System.out.println("Resulatdo: "+r);

    }
}