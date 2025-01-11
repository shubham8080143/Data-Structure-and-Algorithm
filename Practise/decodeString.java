package Practise;
import java.util.*;

public class decodeString {
    public static void main(String[] args) {
        String str="3[a2[c]]";
        System.out.println(Decode(str));
        
    }
    static String Decode(String str){
        Stack<Integer> repeat=new Stack<>();
        Stack<Character> characters =new Stack<>();
        StringBuilder current =new StringBuilder();
        int k=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(Character.isDigit(ch)){
                k=k*10+ (ch - '0');


            }else if(ch == '['){

                repeat.push(k);
                characters.push(ch);
                k=0;
                current =new StringBuilder();
            }else if(ch == ']'){
                int times = repeat.pop();
                StringBuilder temp =new StringBuilder();
                for(int j=0;j<times;j++){
                    temp.append(current);
                }
                current = new StringBuilder(characters.pop().toString() + temp);

        }
    }

    return current.toString();
       }   }