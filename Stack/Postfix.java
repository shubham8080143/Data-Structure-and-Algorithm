package Stack;import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {

        String expression = "23*1+9";
        System.out.println(calculate(expression));

        
    }
    static int calculate(String str){
        Stack<Integer> stk =new Stack<>();
        for(char c: str.toCharArray()){
            if(Character.isDigit(c)){
                stk.push(c -'0');
            }
            else{
                int b=stk.pop();
                int a=stk.pop();
                switch (c) {
                    case '+' : stk.push(a+b); break;
                    case '-' : stk.push(a - b); break;
                    case '*' : stk.push(a * b); break;
                    case '/' : stk.push(a / b); break;
                }
               
            }

        }
        return stk.peek();
    }
}
