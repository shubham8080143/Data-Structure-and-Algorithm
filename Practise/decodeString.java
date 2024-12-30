package Practise;
import java.util.*;

public class decodeString {
    public static void main(String[] args) {
        
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
            }else if()

        }
    }
}
