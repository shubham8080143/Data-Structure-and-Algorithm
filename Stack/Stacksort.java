package Stack;
import java.util.Collections;
import java.util.Stack;
public class Stacksort {
    public static void main(String[] args) { 
       
        Stack<Integer> stk = new Stack<>();
        Collections.addAll(stk, 4, 3, 56, 47, 34, 56);

        sorted(stk);

        System.out.println(stk.toString());
    }

    static void sorted(Stack<Integer> stk){
        if(!stk.isEmpty()){
            int temp=stk.pop();
            
            sorted(stk);
            insertsorted(stk, temp);
            
        }
    }

    static void insertsorted(Stack<Integer> stk,int value){
        if(stk.isEmpty() || stk.peek()<value){
            stk.push(value);
            return;
        }

        int temp=stk.pop();
        insertsorted(stk, value);
    stk.push(temp);

    }
    
}
