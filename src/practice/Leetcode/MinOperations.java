package practice.Leetcode;

public class MinOperations {
    public static void main(String[] args) {
        int n = 39;
        System.out.println(minOperations(n));

    }
    static int minOperations(int n){
        int count = 0;
       return helper(n, count);
    }
    static int helper(int num, int count){
        if (num == 0){
            return count;
        }
        int k = 0;
        while ((int)Math.pow(2, k) <= num){
            k ++;
        }
        return helper(num - (int)Math.pow(2, k- 1), count + 1);
    }
}
