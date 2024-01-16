package oops.JavaGenerics;


public class Main {
    public static void main(String[] args) {
        Printer<Integer>  intPrinter = new Printer<>(20);
        intPrinter.print();

        Printer<String> stringPrinter = new Printer<>("Hello my name is Emad");
        stringPrinter.print();
        
    }
    
}
