package practice.Leetcode;
//https://leetcode.com/problems/add-binary/
public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1000", "10"));


    }
    static String addBinary(String a, String b){
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        int sum = 0;
        int first = 0;
        int second = 0;
        String ans = "";
        while (i >= 0 || j >= 0){
            if (i <  0){
                first = 0;
                second = Character.getNumericValue(b.charAt(j));
            }
            else if (j < 0){
                first = Character.getNumericValue(a.charAt(i));
                second = 0;
            }
            else {
                first = Character.getNumericValue(a.charAt(i));
                second = Character.getNumericValue(b.charAt(j));
            }
            sum = first + second + carry;
            carry = 0;
            if (sum > 1){
                int[] binary = DecimalToBinary(sum);
                int val = binary[1];
                carry = binary[0];
                ans = val + ans;
            }
            else {
                ans = sum + ans;
            }
            i--;
            j--;


        }
        if (carry != 0){
            ans = carry + ans;
        }
        return ans;

    }
    static int[] DecimalToBinary(int n){
        if (n == 2){
            return new int[]{1, 0};
        }
        else {
            return new int[]{1, 1};
        }

    }
}
