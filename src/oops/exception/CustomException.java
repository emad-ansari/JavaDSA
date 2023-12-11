package oops.exception;

public class CustomException {
    public static void main(String[] args) throws AgeLessThanZeroException{
        validateAge(-5);

    }
    private static void validateAge(int age) throws AgeLessThanZeroException {
       if (age < 0){
           throw new AgeLessThanZeroException("Age can not be negative");
       }
       else {
           System.out.println("All is right");
       }


    }
}
