package practice.Recursion;

public class PrintNumber {
    public static void main(String[] args) {
        printNumber(1);

    }

    static void printNumber(int n){
        // base condition
        if(n > 5){
            return;
        }

        printNumber(n + 1);
        System.out.println(n);
    }


}
