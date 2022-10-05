package Seminar4;

import java.util.Stack;


public class infix {

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '(' || c == ')';
    }

    private static int checkChar(char ch) {
        switch (ch) {
        case '+':
        case '-':
            return 1;

        case '*':
        case '/':
            return 2;

        case '^':
            return 3;
        }
        return -1;
    }

    private static boolean variables(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')||(ch >= '1' && ch <= '9');
    }

    public static String convertToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuffer postfix = new StringBuffer(infix.length());
        char c;

        for (int i = 0; i < infix.length(); i++) {
            c = infix.charAt(i);

            if (variables(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            }
 
            else if (c == ')') {

                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() != '(')
                    return null;
                else if(!stack.isEmpty())
                    stack.pop();
            }
            else if (isOperator(c))
            {
                if (!stack.isEmpty() && checkChar(c) <= checkChar(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }
        return postfix.toString();
    }
    public static void main(String[] args) {
    System.out.println("Origin is --> "+"3+4*(5^6-7)^(8+9*10)-1"+" or "+"a*b+(c^d)*(e^f/j)^(h+j*z)*4"); 
    System.out.println("Answer is --> "+convertToPostfix("3 + 4 * ( 5 ^ 6 - 7 ) ^ ( 8 + 9 * 1 0 ) - 1")); 
    System.out.println("or "); 
    System.out.println("Origin is --> "+"a*b+(c^d)*(e^f/j)^(h+j*z)*q"); 
    System.out.println("Answer is --> "+convertToPostfix("a*b+(c^d)*(e^f/j)^(h+j*z)*q")); 
    System.out.println("or "); 
    System.out.println("Origin is --> "+"4*b+(10^d)*(100^f/j)^(500+j*13)*q"); 
    System.out.println("Answer is --> "+convertToPostfix("4*b+(10^d)*(100^f/j)^(500+j*13)*q")); 
    }
}