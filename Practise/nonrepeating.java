package Practise;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class nonrepeating {
    public static void main(String[] args) {
        String str="leelLTlcode";
        System.out.println(nrc(str));
        
    }
    static Character nrc(String str){
        Set<Character> set =new LinkedHashSet<>();
        Set<Character> seen =new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            char ch = Character.toLowerCase(str.charAt(i));
            if(set.contains(ch)){
                set.remove(str.charAt(i));
                seen.add(ch);
            }
            if(!seen.contains(ch)){
                set.add(ch);
            }
        }

        return set.iterator().next();

    }
    
}
