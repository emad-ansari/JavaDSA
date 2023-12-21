package practice.Leetcode;
//https://leetcode.com/problems/valid-parentheses/
public class ValidParantheses {
    public static void main(String[] args) {
        System.out.println(isValid("{)"));
    }
    static boolean isValid(String s) {
        if(s.length() == 1){
            return false;
        }
        boolean closed = true;
        int i = 0;
        int j = s.length() -1;
        while (i <= j){
            if(isClosed( s.charAt(i),s.charAt(j))){
                i++;
                j--;
            }
            else {
                boolean first = isClosed(s.charAt(i), s.charAt(i + 1));
                boolean second = isClosed(s.charAt(j - 1) , s.charAt(j));
                if(!first || !second){
                    closed = false;
                }
                i = i + 2;
                j = j - 2;
            }
        }
        return closed;
    }
    static boolean isClosed(char open, char close ){
        if(open == '(' && close == ')'){
            return true;
        }
        if(open == '{' && close == '}'){
            return true;
        }
        if(open == '[' && close == ']'){
            return true;
        }
        return false;
    }
}
