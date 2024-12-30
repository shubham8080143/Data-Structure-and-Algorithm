package Practise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class GroupAnagram {
    public static void main(String[] args) {
        
        
    }
    static List<String> findAnagram(List<String> list){
        Map<String,List<String>> map=new HashMap<>();
        for(int i=0;i<list.size();i++){
            char[] str=list.get(i).toCharArray();
            Arrays.sort(str);
            String sorted =new String(str);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(list.get(i));

            
        }

        return new ArrayList(map.values());



    }
    // static boolean check(String str1,String str2) {
    //     char[] arr1 =str1.toCharArray();
    //     char[] arr2 =str2.toCharArray();
    //     if(arr1.equals(arr2)){
    //         return true;
    //     }
    //     return false;
    // }
    
}
