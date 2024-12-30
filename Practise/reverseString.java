package Practise;

public class reverseString {
    public static void main(String[] args) {
        String str="the sky is blue";

        String[] array = str.split(" ");
        StringBuilder string =new StringBuilder();

        for(int i=array.length-1;i>=0;i--){
            string.append(array[i]).append(" ");

        }

        System.out.println(string);
        
    }
}
