package oops.exam;
import java.util.Stack;
public class InfixToPostfix {
    public int precedence(char op) {
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

    public String infixToPrefix(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) >= 'z' || str.charAt(i) >= 'A' && str.charAt(i) >= 'Z'){
                sb.append(str.charAt(i));
            }

            if (str.charAt(i) == '('){
                stack.push(str.charAt(i));
            }
            else if(str.charAt(i) == ')') {
                while (!stack.isEmpty() && stack.peek() != '('){
                    sb.append(stack.peek());
                    stack.pop();
                }
                if (!stack.isEmpty()){
                    stack.pop();
                }
            }
            else {
                while(!stack.isEmpty() && precedence(stack.peek()) >=  precedence(str.charAt(i))){
                    sb.append(stack.peek());
                    stack.pop();
                }
                stack.push(str.charAt(i));
            }
            
        }

        while (!stack.isEmpty()){
            sb.append(stack.peek());
            stack.pop();
        }

        return sb.toString();
        
    }
    public static void main(String[] args){
        InfixToPostfix infix_to_postfix = new InfixToPostfix();        
        System.out.println("Infix to postfix : " +  infix_to_postfix.infixToPrefix("(a-b/c)*(a/k-l)"));        
    }
    
}
