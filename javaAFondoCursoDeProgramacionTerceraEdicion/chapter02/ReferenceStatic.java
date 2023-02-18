
public final class ReferenceStatic{
    private int a=0;

    public void method(){
        System.out.println("este es un method()");
    }   
    
    public static void main(String[] args){
        ReferenceStatic t=new ReferenceStatic();
        
        System.out.println("a vale: "+t.a);

        t.method();
    } 
}//end ReferenceStatic

