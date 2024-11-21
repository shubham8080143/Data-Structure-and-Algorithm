package Array_And_Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    List<List<String>> groupedAnagrams = groupAnagrams(strs);
    System.out.println(groupedAnagrams);
        
    }
    


    public static List<List<String>> groupAnagrams(String[] strs) {
        // Map to store sorted string as key and the list of anagrams as value
        Map<String, List<String>> map = new HashMap<>();
        
        // Iterate over each string in the array
        for (String s : strs) {
            // Convert string to character array and sort it
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            
            // Convert sorted character array back to string
            String sorted = new String(ch);
            
            // If the map contains the sorted string, add the current string to the list
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        
        // Return the list of grouped anagrams
        return new ArrayList<>(map.values());
    
}

}
