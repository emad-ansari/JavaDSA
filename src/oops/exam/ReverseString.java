package oops.exam;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        reverseLetter(str);
    }
    public static void reverseLetter(String str){
        StringBuffer ans = new StringBuffer("");
        for (int i = str.length() -1 ; i >= 0; i--) {
            ans.append(str.charAt(i));
        }
        System.out.println(ans);
    }
    
}
