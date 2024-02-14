package oops.interfaces;

public class InterfaceImp implements InterfaceA, InterfaceB{
    public void doSomething(){
        System.out.println("this is impletation of doSomething method");
    };

    public static void main(String[] args) {
        InterfaceA a = new InterfaceImp();
        InterfaceB b= new InterfaceImp();
        a.doSomething();
        b.doSomething();
    }
}


