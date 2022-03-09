import java.awt.Graphics;
import javax.swing.JPanel;

public class HalfMoonWithWhileFourCorners extends JPanel{
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int width=getWidth();
        int height=getHeight();
        int x=0, y=0;
        int w=20, h=0;
        
        //Esquina superior izquierda hacia abajo
        System.out.println("x="+x+" y+"+y+" width="+w+" height"+height);
        while(y<height){
            if(y==0){
                g.drawLine(x, y, w, height);
                y+=10;
                w+=10;
                System.out.println("x="+x+" y+"+y+" width="+w+" height"+height);
            }else{
                y+=10;
                w+=10; 
                System.out.println("x="+x+" y+"+y+" width="+w+" height"+height);
                g.drawLine(x, y, w, height);
            }   
        }//end while
        
        //Esquina superior izquierda de abajo hacia arriba
        width=getWidth();
        height=getHeight();
        x=0; y=0;
        w=0; h=0;
        System.out.println("x="+x+" y+"+y+" width="+w+" height"+height);
        while(w<250){
            g.drawLine(x, height, w, h);
            System.out.println("x="+x+" y+"+y+" width="+w+" height"+height);
            x++;
            w+=10;
            height-=10;
               
        }//end while
        
        //Esquina superior izquierda de abajo hacia arriba
        width=getWidth();
        height=getHeight();
        x=0; y=0;
        w=0; h=getHeight()-15;
        System.out.println("x="+x+" y+"+y+" width="+w+" height"+height);
        while(x<250){
            g.drawLine(x, height, width, h);
            System.out.println("x="+x+" y+"+y+" width="+w+" height"+height);
            x+=10;
            h-=15;
               
        }//end while
        
        width=getWidth();
        height=getHeight();
        x=getWidth(); y=0;
        w=0; 
        System.out.println("x="+x+" y+"+y+" width="+w+" height"+height);
        while(x>0){
            x-=10;
            height-=10;
            y+=1;
            g.drawLine(x, y, width, height);                
        }//end while
    }//end paintComponent
}//end HalfMoonWithWhileFourCorners