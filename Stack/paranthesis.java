package Stack;

import java.util.Stack;

public class paranthesis {
    public static void main(String[] args) {
        System.out.println(check("({]})"));
        
    }
    static boolean check(String str){

        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Push opening brackets onto the stack
            if (ch == '[' || ch == '(' || ch == '{') {
                stk.push(ch);
            } 
            // Check for matching closing brackets
            else if (ch == '}' || ch == ')' || ch == ']') {
                if (stk.isEmpty()) {
                    return false; // No matching opening bracket
                }
                char top = stk.peek();
                if ((ch == '}' && top == '{') ||
                    (ch == ')' && top == '(') ||
                    (ch == ']' && top == '[')) {
                    stk.pop();
                } else {
                    return false; // Mismatched brackets
                }
            }
        }

        // If the stack is empty, all brackets are matched
        return stk.isEmpty(); 
       
    }
    
}
