package oops.exam;

import java.util.Stack;

public class InfixToPrefix {


    public int precedence(char op){
        
        switch (op) {
            case '^':
                return 3;
                
            case '/', '*':
                return 2;
                
            case '+', '-':
                return 1;

            default:
                return -1;
                
        }
    }

    public String infixToPrefiix(String infix) {
        StringBuilder rs = new StringBuilder(infix).reverse();

        Stack<Character> st = new Stack<>();

        String result = "";

        for (int i = 0; i < rs.length(); i++) {
            if (rs.charAt(i) >= 'a' && rs.charAt(i) >= 'z' || rs.charAt(i) >= 'A' && rs.charAt(i) >= 'Z'){
                result = result + rs.charAt(i);
            }
            else if (rs.charAt(i) == ')') {
                st.push(rs.charAt(i));
            }
            else if (rs.charAt(i) == '('){
                while (!st.isEmpty() && st.peek() != ')'){
                    result = result + st.peek();
                    st.pop();
                }
                if (!st.isEmpty()){
                    st.pop();
                }

            }
            else {
                while (!st.isEmpty() && precedence(st.peek()) >= precedence(rs.charAt(i))) {
                    result = result + st.peek();
                    st.pop();
                }
                st.push(rs.charAt(i));
            }
            
        }

        while (!st.isEmpty()){
            result = result + st.peek();
            st.pop();
        }

        StringBuilder ans = new StringBuilder(result).reverse();
        return ans.toString();
    } 


    public static void main(String[] args) {
        InfixToPrefix inftoprefix = new InfixToPrefix();

        System.out.println("Infix to prefix : " + inftoprefix.infixToPrefiix("(a-b/c)*(a/k-l)"));

    }
    
  
}
