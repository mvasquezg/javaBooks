package collections.controller;

public class Queue<T>{

    private static final int INITIAL_CAPABILITY=5;

    private MyCollectionGeneric<T> coll=new MyCollectionGeneric<T>(INITIAL_CAPABILITY);

    public void encolar(T elm){
        coll.insert(elm, 0);
    }

    public T desencolar(){
        return coll.delete(0);
    }

}//end Queue