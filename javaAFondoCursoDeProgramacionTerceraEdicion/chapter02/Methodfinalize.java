public class Methodfinalize{
    
    private static int cont=0;

    public Methodfinalize(){
        cont++;
        System.out.println(cont);
    }
    
    public void finalize(){
        cont--;
    }

    public static void main(String[] args){
        
        while(true){
            new Methodfinalize();
        }

    }//end main
}//end MethodFinalize