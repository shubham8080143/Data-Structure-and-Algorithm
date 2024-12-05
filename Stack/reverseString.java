package Stack;

import java.util.Stack;

public class reverseString {
    public static void main(String[] args) {
        System.out.println(reverse("shuhaj"));
        
    }
    static String reverse(String str){
        Stack<Character> stk=new Stack();
        StringBuilder reversed = new StringBuilder();
        
       for(int i=0;i<str.length();i++){
        stk.push(str.charAt(i));

        
       }
       while(!stk.isEmpty()){
        reversed.append(stk.pop());

       }

       return reversed.toString();
       
      

        
    }
    
}
