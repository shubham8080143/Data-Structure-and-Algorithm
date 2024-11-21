

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToInteger {
    public static void main(String[] args){

        List<String> str= Arrays.asList("11","45","67","88",null,null,"78","a67");
        
        System.out.println(convert(str));

    }
static List<Integer> convert(List<String> str){
    List<Integer> list=new ArrayList<>();

    for (int i = 0; i < str.size(); i++) {
        try {
            if (str.get(i) != null) {
                list.add(Integer.parseInt(str.get(i)));
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format at index " + i);
        }
    }
    return list;

}
    
}
