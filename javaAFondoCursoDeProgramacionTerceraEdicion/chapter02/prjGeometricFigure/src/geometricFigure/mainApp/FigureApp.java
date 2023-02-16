package geometricFigure.mainApp;

import geometricFigure.abstracClass.GeometricFigure;
import geometricFigure.controller.Circle;
import geometricFigure.controller.Rectangle;
import geometricFigure.controller.Triangle;

public class FigureApp{
    public static void main(String[] args){
        /*Circle circle=new Circle(4);
        Rectangle rectangle=new Rectangle(10,5);
        Triangle triangle=new Triangle(3,6);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(triangle);*/
 
        GeometricFigure array[]={new Circle(23), new Rectangle(12,4),new Triangle(2,5)};

        double prom=GeometricFigure.showPromArea(array);

        System.out.println("\nPromedio: "+prom);
    }//end main
}//end FigureApp