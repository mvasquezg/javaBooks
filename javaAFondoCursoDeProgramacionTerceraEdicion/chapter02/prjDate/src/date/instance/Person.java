package date.instance;

import date.controller.Date;
import date.controller.DetailsDate;

public class Person{
    private String name;
    private String dni;
    private Date dateBirth;

    private int cont=0;

    public Person(String name, String dni, Date dateBirth){
        this.name=name;
        this.dni=dni;
        this.dateBirth=dateBirth;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setDni(String dni){
        this.dni=dni;
    }

    public void setDateBirth(Date dateBirth){
        this.dateBirth=dateBirth;
    }

    public String getName(){
        return this.name;
    }

    public String getDni(){
        return this.dni;
    }

    public Date getDateBirth(){
        return this.dateBirth;
    }

    public String toString(){
        cont++;

        return this.name+", DNI: "+this.dni+", nacido el "+this.dateBirth+"("+cont+")";
    }

}//end Person