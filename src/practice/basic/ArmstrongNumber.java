package practice.basic;

public class ArmstrongNumber {
    public static void main(String[] args) {
//        System.out.println(isArmstrong(15));
        allArmstrong();

    }
//  check whether a given number is Armstrong or not.
    static boolean isArmstrong(int num){
        int original_number = num;
        int sum = 0;
        while (num != 0){
            int last_digit = num % 10;
            sum += (int)Math.pow(last_digit, 3);
            num /= 10;
        }
        return sum == original_number;
    }


    // find all armstrong number between 1 and 1000.
    static void allArmstrong(){
        for (int i = 0; i <= 1000; i ++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
}
