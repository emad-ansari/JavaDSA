package practice.Leetcode;
//https://leetcode.com/problems/add-strings/description/
public class AddString {
    public static void main(String[] args) {
        System.out.println(addString("1", "9"));

    }
    static String addString(String num1, String num2){
        int carry = 0;
        int sum = 0;
        String ans = "";
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        while (i >= 0 || j >= 0){
            int first;
            int second;
            if (i < 0){
                first = 0;
                second = Character.getNumericValue(num2.charAt(j));
            }
            else if (j < 0){
                first = Character.getNumericValue(num1.charAt(i));
                second = 0;
            }
            else {
                first = Character.getNumericValue(num1.charAt(i));
                second = Character.getNumericValue(num2.charAt(j));
            }
            sum = first + second + carry;
            carry = 0;
            if (sum > 9){
                int[] arr = ValAndCarry(sum);
                ans = arr[0] + ans;
                carry = arr[1];
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

    static int[] ValAndCarry(int number){
        int[] ans = new int[2];
        int index  = 0;
        while (number != 0){
            ans[index] = number % 10;
            number /= 10;
            index ++;
        }
        return ans;
    }
}
