package oops.exam;

public class StaticBlock {
    // In Java static block is used to initialize the static data members. Important point to note is that static block is executed before the main method at the time of class loading.
    static int a;
    
    static {
        System.out.println("this is a static block which execute before execution of main method");
        a = 10;
    }
    public static void main(String[] args) {
        System.out.println(a);
        
    }

    
}
