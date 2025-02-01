package LeetcodePractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

//QUESTION LINK: https://www.geeksforgeeks.org/print-distinct-palindromic-substrings-of-a-given-string/

public class DistinctpalidromicSubstrings {
    
    static void palindromeSubStrs(String s) {
        LinkedHashSet<String> result = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (isPalidromic(s.substring(i, j))) {
                    result.add(s.substring(i, j));
                }
            }
        }

        // Convert LinkedHashSet to ArrayList
        List<String> list = new ArrayList<>(result);

        // Sort the list
        Collections.sort(list);

        // Print the sorted palindromic substrings
        for (String str : list) {
            System.out.println(str);
        }
    }

    static boolean isPalidromic(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        palindromeSubStrs(s);
    }
}

