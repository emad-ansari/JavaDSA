package practice.Leetcode;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(2));

    }
    public static  boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(fast != slow);

        if (slow == 1){
            return true;
        }
        return false;

    }
    private static int findSquare(int number){
        int ans = 0;
        while (number != 0){
            int rem = number % 10;
            ans = ans + rem * rem;
            number /= 10;
        }
        return ans;
    }
}
