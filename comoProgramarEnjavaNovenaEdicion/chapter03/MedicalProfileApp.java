/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 03: Introduction to classes. objects, methods and string,
  *Program 10.-Class for execute the app. 
*/
import java.util.Scanner;

public class MedicalProfileApp{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        MedicalProfile medicalProfile01=new MedicalProfile("", "", "", 0, 0, 0, 0,0);

        System.out.print("Ingrese el nombre del paciente: ");
        medicalProfile01.setName(in.next());

        System.out.print("Ingrese el apellido del paciente: ");
        medicalProfile01.setLastName(in.next());

        System.out.print("Ingrese el sexo del paciente: ");
        medicalProfile01.setSex(in.next());

        System.out.print("Ingrese La fecha de nacimiento del paciente\ndia: ");
        medicalProfile01.setDay(in.nextInt());

        System.out.print("mes: ");
        medicalProfile01.setMonth(in.nextInt());
        
        System.out.print("anho: ");
        medicalProfile01.setYear(in.nextInt());

        System.out.print("Ingrese la altura del paciente en centimetros: ");
        medicalProfile01.setHeightInCentimeters(in.nextInt());
        
        System.out.print("Ingrese el peso del paciente en Kg: ");
        medicalProfile01.setWeightInKilograms(in.nextInt());

        System.out.println("\n\nNombre paciente: "+medicalProfile01.getName());
        System.out.println("Apellido paciente: "+medicalProfile01.getLastName());
        System.out.println("Fecha de nacimiento: "+medicalProfile01.getMonth()+"/"+medicalProfile01.getDay()+"/"+medicalProfile01.getYear());
        System.out.println("Edad: "+medicalProfile01.calculateAge()+" anhos");
        System.out.println("Frecuencia Cardiaca Maxima: "+medicalProfile01.calculateHeartRate());
        System.out.println("Rango de frecuencia:\n");
        medicalProfile01.expectedHeartRate();
        medicalProfile01.calculateBodyMassIndex();

    }//end main
}//end MedicalProfileApp