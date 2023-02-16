package geometricFigure.abstracClass;

public abstract class GeometricFigure{
    private String name;

    public GeometricFigure(String name){
        this.name=name;
    }
    
    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }
    
    //Abstract Method
    public abstract double showArea();

    public String toString(){
        return this.name+"\nArea: "+showArea()+"\n";
    }

    public static double showPromArea(GeometricFigure[] arrayGeometricfigure){
        int sum=0;

        for(int i=0; i<arrayGeometricfigure.length; i++){
            sum += arrayGeometricfigure[i].showArea();
        }

        return sum/arrayGeometricfigure.length;
    }

}//end GeometricFigure