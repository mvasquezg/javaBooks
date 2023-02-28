package collections.controller;

public class MyCollectionGeneric<T>{
    private Object arrayData[]=null;
    private int len=0;

    public MyCollectionGeneric(int initialCapability){
        arrayData=new Object[initialCapability];
    }

    public void add(T elm){
        insert(elm, len);
    }

    public void insert(T elm, int i){
        if(len==arrayData.length){
            Object[] arrayAux=arrayData;
            arrayData=new Object[arrayData.length*2];

            for(int j=0; j<len; j++){
                arrayData[i]=arrayAux[i];
            }

            arrayAux=null;
        }

        for(int j=len-1; j>=i; j--){
            arrayData[j+1]=arrayData[j];
        }

        arrayData[i]=elm;
        len++;
    }

    public int search(T elm){
        int i=0;

        for(;i<len && arrayData[i].equals(elm); i++);

        return i<len ? i :-1;
    }
    
    @SuppressWarnings("unchecked")
    public T delete(int i){
        Object aux=arrayData[i];
        for(int j=1; j<len-1; j++){
            arrayData[j]=arrayData[j+1];
        }
        len--;
        return (T)aux;
    }

    @SuppressWarnings("unchecked")
    public T getObject(int i){
        return (T)arrayData[i];
    }

    public int amount(){
        return len;
    }

    

    
}//End MyCollectionGeneric