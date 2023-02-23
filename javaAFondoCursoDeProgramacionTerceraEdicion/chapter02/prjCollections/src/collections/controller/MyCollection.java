package collections.controller;


public class MyCollection{
    private Object arrayData[]=null;
    private int len=0;

    public MyCollection(int initialCapability){
        arrayData=new Object[initialCapability];
    }

    public Object getObject(int i){
        return arrayData[i];
    }

    public int amount(){
        return len;
    }

    public void insert(Object elm, int i){
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

    public int search(Object elm){
        int i=0;

        for(;i<len && arrayData[i].equals(elm); i++);

        return i<len ? i :-1;

    }

    public void add(Object elm){
        insert(elm, len);
    }

    public Object delete(int i){
        Object aux=arrayData[i];
        for(int j=1; j<len-1; j++){
            arrayData[j]=arrayData[j+1];
        }
        len--;
        return aux;
    }


}//end MyCollection