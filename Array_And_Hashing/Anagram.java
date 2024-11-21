package Array_And_Hashing;

 import java.util.HashMap;
import java.util.Map;

class Anagram {
        public static boolean isAnagram(String s, String t) {
            if(s.length()!=t.length()){
                return false;
            }
            Map<Character,Integer> a=new HashMap<>();
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(a.containsKey(ch)){
                    a.put(ch,a.get(ch)+1);
                }else{
                    a.put(ch,1);
                }
    
            }
            for(int i=0;i<t.length();i++){
                char ch=t.charAt(i);
                if(a.containsKey(ch) && a.get(ch)!=0){
                    a.put(ch,a.get(ch)-1);
                }else{
                    return false;
                }
    
            }
            
         return true;   
        }
        public static void main(String[] args) {
            isAnagram("cat","ate");
        }
    
}
