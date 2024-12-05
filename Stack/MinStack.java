package Stack;

import java.util.Stack;

//Design a stack that supports push, pop, top, and retrieving the minimum element in O(1) time.

public class MinStack {
    public static void main(String[] args) {
        
    }

    private Stack<Integer> stk;
    private Stack<Integer> minstk;


    MinStack(){
        stk =new Stack<>();
        minstk =new Stack<>();
    }

    void push(int x){
        stk.push(x);

        if(minstk.peek()> x || minstk.isEmpty() ){
            minstk.push(x);
        }
    }

    void pop(){
        if(minstk.peek().equals(stk.peek())){
            minstk.pop();
        }
        stk.pop();

    }

    int top(){
        return stk.peek();
    }

    int min(){
        return minstk.peek();
    }
    
}
