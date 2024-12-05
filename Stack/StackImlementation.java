package Stack;

import java.util.Arrays;

public class StackImlementation {
    public static void main(String[] args) {

        StackImlementation stack = new StackImlementation(10);
        stack.push(25);
        stack.pop();
        System.out.println(stack.peek());
        

        
    }
    
    int top;
    int[] stack;
    int size;

    public StackImlementation(int size){
        stack=new int[size];
        top=-1;
        size=this.size;
    }

    public  void push(int x) {
        if(top == size-1){
            System.out.println("stack is overflow");
            
        }
        stack[top+1]=x;
        top++;

    }

    public int peek(){
        if(top==-1){
            System.out.println("stack is empty");
        }

        return stack[top];
    }
    public int pop(){
        if(top==-1){
            System.out.println("stack is empty");
        }

        return stack[top--];
    }
    public boolean isEmplty(){
        return top==-1;
    }
    
}
