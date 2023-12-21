package practice.searchingalgorithm;
// find the number with even number of digits.
public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {12 , 345, 2, 6, 7896};
        // how many number in arr have even digits
        // call the evenDigit function

        evenDigit(arr);


    }

    static void evenDigit(int[] num){
        for (int element : num){
            if(checkDigit(element)){
                System.out.println( element + " have even digit");
            }
        }
    }
    static boolean checkDigit(int num){
        int countOfDigits = digit(num);

        return (countOfDigits % 2 == 0);
    }

    static int digit(int num){
        if(num < 0){
            num = num * (-1);
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while (num != 0){
            count++;
            num /= 10;
        }
        return count;
    }
}
