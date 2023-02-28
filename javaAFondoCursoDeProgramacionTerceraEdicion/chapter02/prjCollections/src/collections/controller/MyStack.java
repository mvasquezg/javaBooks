package collections.controller;
public class MyStack<T>{

    private static final int INITIAL_CAPABILITY=5;

    private MyCollectionGeneric<T> coll=new MyCollectionGeneric<T>(INITIAL_CAPABILITY);

    public void stack(T elm){
        coll.insert(elm, 0);
    }

    public T desapilar(){
        return coll.delete(0);
    }
}//end MyStack