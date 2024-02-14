package oops.interfaces;

public interface Weapon {
    // abstract method
    public void use();  
    
    // interface allows default and static method since java 8.
    default void defaultMethd(){
        System.out.println("This is default method ");
    }

    public static void staticMethod(){
        System.out.println("This is static method");
    }
}
