package oops.exception;

public class NullPointer {
    public static void main(String[] args) {
        String str = null;
        int[] arr = {1, 2};
        try {
            arr[3] = 8;
            System.out.println(3 /0);
            // System.out.println("this line will throw  null pointer exception " + str.length()); // here length of str is null and we are trying to print the length of this         
            // hence this will through null pointer exception
        }    
       
        catch(ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());

        }
        catch(Exception e){
            System.out.println(e.getMessage());
            // we can also create try and catch block inside a catch block but it is not a good practise.
            
            // try {

            // }
            // catch(Exception error) {
            //     System.out.println("this is nested try catch" + error);
            // }
        }

        // finally is a block which does not care about whether exception is occur or not it always run.
        finally{
            System.out.println("This is finally block");
        }
        // statements after finally block is also execute.  
        // It is missconception about finally block is that after finally block no code execute
        System.out.println("Statement after finally block");
    }
}
