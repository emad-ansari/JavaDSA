package practice.exam;

import java.util.Stack;

public class PostfixExpressionEvaluator {

    public static int evaluatePostfixExpression(String postfixExpression) {
        Stack<Integer> operandStack = new Stack<>();
        

        for (char token : postfixExpression.toCharArray()) {
            if (Character.isDigit(token)) {
                // If the token is a digit, push it onto the stack
                operandStack.push(Character.getNumericValue(token));
            } else {
                // If the token is an operator, pop operands from the stack and perform the operation
                int operand2 = operandStack.pop();
                int operand1 = operandStack.pop();

                switch (token) {
                    case '+':
                        operandStack.push(operand1 + operand2);
                        break;
                    case '-':
                        operandStack.push(operand1 - operand2);
                        break;
                    case '*':
                        operandStack.push(operand1 * operand2);
                        break;
                    case '/':
                        operandStack.push(operand1 / operand2);
                        break;
                    // Add more operators as needed
                }
            }
        }

        // The result should be the only element left in the stack
        return operandStack.pop();
    }

    public static void main(String[] args) {
        String postfixExpression = "235*+";
        int result = evaluatePostfixExpression(postfixExpression);
        System.out.println("Result of the postfix expression '" + postfixExpression + "': " + result);
    }
}

