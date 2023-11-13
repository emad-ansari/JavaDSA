package practice.Leetcode;
//https://leetcode.com/problems/perfect-squares/
public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(numSquares(12));
    }

//    Not solved

    static int numSquares(int n) {
        if (isPerfectSquare(n)){
            return 1;
        }
        int sum = 0;
        int count = 0;
        int currentNumber = n -1;
        return numSquares2(n, currentNumber, sum, count);
    }
    static int numSquares2(int n, int currentNumber, int sum, int count){
        if (currentNumber == 0){
            return count;
        }
        if (isPerfectSquare(currentNumber)){
            sum = sum + currentNumber;
            if (sum < n){
                return numSquares2(n, currentNumber, sum, count + 1);

            }
            if (sum == n){
                return count + 1;
            }
            else{
                return numSquares2(n, currentNumber - 1, sum - currentNumber,count);
            }
        }
        else {
            return numSquares2(n, currentNumber - 1, sum, count);
        }
    }

    static boolean isPerfectSquare(int num){
        int a = 1;
        while (a * a <= num){
            if (a * a == num){
                return true;
            }
            a++;
        }
        return false;
    }
}
