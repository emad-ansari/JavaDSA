package practice.basic;

public class FindPower {
    public static void main(String[] args) {
        System.out.println(myPow(2.00000, -2147483647));


    }
    static double myPow(double x, int n){
        if (n == 0){
            return 1;
        }
        if (x == 1.0){
            return x;

        }
        long times = 0;

        if (n == Integer.MIN_VALUE){
            x = 1/x;
            times = Integer.MAX_VALUE + 1;
        }
        else if (n < 0 && n != Integer.MIN_VALUE ){
            x = 1/x;
            times = n * (-1);
        }
        else {
            times = n;
        }
        double pow = 1;

        for (int i = 0; i < times; i++) {
            pow = pow * x;
        }
//        return findPow(x, times, pow);
        return pow;
    }
}
