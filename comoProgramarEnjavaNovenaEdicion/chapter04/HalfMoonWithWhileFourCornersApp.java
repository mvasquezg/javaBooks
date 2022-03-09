import javax.swing.JFrame;

public class HalfMoonWithWhileFourCornersApp{
    public static void main(String[] args){

        HalfMoonWithWhileFourCorners halfMoonWithWhile=new HalfMoonWithWhileFourCorners();

        JFrame jFrame=new JFrame();

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.add(halfMoonWithWhile);
        jFrame.setSize(250, 250);
        jFrame.setVisible(true);

    }//end main
}//end HalfMoonWithWhileFourCornersApp