/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 10:Drawing a Target Shooting Panel
*/
import java.awt.Color;
import java.awt.Graphics;

import java.util.Random;

import javax.swing.JPanel;

public class TargetShootingPanel extends JPanel{

    Random randomNumber=new Random();
    private int width;
    private int height;
    private int r1=randomNumber.nextInt(255);
    private int g1=randomNumber.nextInt(255);
    private int b1=randomNumber.nextInt(255);

    private int r2=randomNumber.nextInt(255);
    private int g2=randomNumber.nextInt(255);
    private int b2=randomNumber.nextInt(255);

    public TargetShootingPanel(int width, int height){
        this.width=width;
        this.height=height;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int h=this.height/2;
        int x=(this.width/5)-10;
        int z=480;

        for(int i=5; i<=h; i+=10){
            z-=20;
            x+=10;
            
            g.setColor(new Color(r1, g1, b1));
            g.fillOval(x, i, z, z);

            z-=20;
            i+=10;
            x+=10;
            g.setColor(new Color(r2, g2, b2));
            g.fillOval(x, i, z, z);
        }
    }//end TargetShootingPanel
}//end TargetShootingPanel


/**********************************Inician pruebas de dibujos que pueden ayudar mas adelante*************************************** */
        /*Draw face
        //g.setColor(Color.BLACK);
        g.setColor(new Color(r1, g1, b1));
        g.fillOval(50, 50, 150, 150);
        //g.fillOval(400, 225, 50, 50);
        
        //g.setColor(Color.GREEN);
        g.setColor(new Color(r2, g2, b2));
        g.fillOval(60, 60, 130, 130);
        //g.fillOval(390, 215, 60, 60);
        
        //g.setColor(Color.BLACK);
        g.setColor(new Color(r1, g1, b1));
        g.fillOval(70, 70, 110, 110);

        //g.setColor(Color.GREEN);
        g.setColor(new Color(r2, g2, b2));
        g.fillOval(80, 80, 90, 90);

        //g.setColor(Color.BLACK);
        g.setColor(new Color(r1, g1, b1));
        g.fillOval(90, 90, 70, 70);

        //g.setColor(Color.GREEN);
        g.setColor(new Color(r2, g2, b2));
        g.fillOval(100, 100, 50, 50);

        //g.setColor(Color.BLACK);
        g.setColor(new Color(r1, g1, b1));
        g.fillOval(110, 110, 30, 30);

        g.setColor(new Color(r2, g2, b2));
        g.fillOval(120, 120, 10, 10);
        /*
        g.setColor(new Color(r1, g1, b1));
        g.fillOval(180, 5, 460, 460);

        g.setColor(new Color(r2, g2, b2));
        g.fillOval(190, 15, 440, 440);

        g.setColor(new Color(r1, g1, b1));
        g.fillOval(200, 25, 420, 420);

        g.setColor(new Color(r2, g2, b2));
        g.fillOval(210, 35, 400, 400);

        g.setColor(new Color(r1, g1, b1));
        g.fillOval(220, 45, 380, 380);

        g.setColor(new Color(r2, g2, b2));
        g.fillOval(230, 55, 360, 360);

        g.setColor(new Color(r1, g1, b1));
        g.fillOval(240, 65, 340, 340);

        g.setColor(new Color(r2, g2, b2));
        g.fillOval(250, 75, 320, 320);

        g.setColor(new Color(r1, g1, b1));
        g.fillOval(260, 85, 300, 300);

        g.setColor(new Color(r2, g2, b2));
        g.fillOval(270, 95, 280, 280);

        g.setColor(new Color(r1, g1, b1));
        g.fillOval(280, 105, 260, 260);

        g.setColor(new Color(r2, g2, b2));
        g.fillOval(290, 115, 240, 240);

        g.setColor(new Color(r1, g1, b1));
        g.fillOval(300, 125, 220, 220);

        g.setColor(new Color(r2, g2, b2));
        g.fillOval(310, 135, 200, 200);

        g.setColor(new Color(r1, g1, b1));
        g.fillOval(320, 145, 180, 180);

        g.setColor(new Color(r2, g2, b2));
        g.fillOval(330, 155, 160, 160);

        g.setColor(new Color(r1, g1, b1));
        g.fillOval(340, 165, 140, 140);

        g.setColor(new Color(r2, g2, b2));
        g.fillOval(350, 175, 120, 120);

        g.setColor(new Color(r1, g1, b1));
        g.fillOval(360, 185, 100, 100);

        g.setColor(new Color(r2, g2, b2));
        g.fillOval(370, 195, 80, 80);

        g.setColor(new Color(r1, g1, b1));
        g.fillOval(380, 205, 60, 60);
        
        g.setColor(new Color(r2, g2, b2));
        g.fillOval(390, 215, 40, 40);

        g.setColor(new Color(r1, g1, b1));
        g.fillOval(400, 225, 20, 20);
        */

        /* Dibujo Extravahgante
        for(int i=10; i<=(this.height/2); i+=10){

            for(int j=10; j<=(this.width/2); j+=10){
                
                    g.setColor(new Color(r1, g1, b1));
                    g.fillOval(j, i, this.width-x, this.width-y);

                    x+=10;
                    y+=10;

                    g.setColor(new Color(r2, g2, b2));
                    g.fillOval(j+10, i+10, this.width-x, this.width-y);
            }  
            System.out.println();
        }*/


        /*Pinta un globo o foco
        for(int i=this.height/2; i>10; i-=10){

            for(int j=this.width/2; j>10; j-=10){
                System.out.print("Alto: "+i+"\nAncho: "+j);

                g.fillOval((this.height-i), (this.width-i), i, i);
                j-=10;
            }  
            System.out.println();
        }*/

        /*for(int i=5; i<=w; i+=10){

            for(j=j; j<=w; j+=10){
                System.out.println("Valor de i: "+i+" Valor de j: "+j);
                g.setColor(new Color(r1, g1, b1));
                g.fillOval(j, i, this.width, this.height);
                
                g.setColor(new Color(r2, g2, b2));
                g.fillOval(j+10, i+10, this.width-20, this.height-20);
 
                break;
            }  
            j+=10;
        }*/

        //*/

        /*g.setColor(new Color(r1, g1, b1));
        g.fillOval(10, 05, this.width-20, this.height-30);

        g.setColor(new Color(r2, g2, b2));
        g.fillOval(20, 15, this.width-40, this.height-50);
        
        g.setColor(new Color(r1, g1, b1));
        g.fillOval(30, 25, t his.width-60, this.height-70);
        //
        
        int h=this.height/2;
        int w=this.width/2;
        int j=10;
        /*for(int i=5; i<=h; i++){
            g.setColor(new Color(r1, g1, b1));
            g.fillOval(j, i, (this.width-5), (this.width-5));
        
            g.setColor(new Color(r2, g2, b2));
            g.fillOval(j, i+10, (this.width-5)-j, (this.width-5)-j);
            
            j+=10;   
            /*for(int j=10; j<=w; j++){
                g.setColor(new Color(r1, g1, b1));
                g.fillOval(j, i, this.width, this.height);

                g.setColor(new Color(r2, g2, b2));
                g.fillOval(j+10, i+10, this.width-20, this.height-20);
                
                i+=10;
                j+=10;    
            }
            
            System.out.println("Valor de i: "+i);
        }*/
        

/**********************************Terminan pruebas de dibujos que pueden ayudar mas adelante*************************************** */