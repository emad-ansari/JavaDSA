package practice.exam;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Perhaps";
        System.out.println(reverse(str, str.length() - 1, ""));

    }
//    Write a java program to reverse a string using recursion.

    static String reverse(String str,int index,  String ans){
        if (index < 0){
            return ans;
        }
        ans = ans  + str.charAt(index);
        return reverse(str, index - 1, ans);
    }
}
