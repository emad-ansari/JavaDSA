package oops.exam;
/*
 * Write a java program to find the number of and sum of all integers greater than50 and less
    than 150 and are divisible by 13.
 */
public class Question_20 {
    public static void main(String[] args) {
        findSum();
        
    }

    static void findSum() {
        int num = 0;
        int sum = 0;
        for (int i = 50; i < 150; i++) {
            if (i % 13 == 0){
                num++;
                sum += i;
            }
        }
        System.out.println("Numbers between 50 and 150 which are divisible by 13: " + num);
        System.out.println("Sum of numbers which are between 50 and 150 and divisible by 13:  " + sum);
    }
    
    
}
