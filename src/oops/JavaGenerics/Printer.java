package oops.JavaGenerics;

public class Printer<T>{
    T printAnything;
    public Printer(T printAnything){
        this.printAnything = printAnything;

    }
    public void print(){
        System.out.println("This is the object that passed to this method: " + printAnything);
    }

    
}
