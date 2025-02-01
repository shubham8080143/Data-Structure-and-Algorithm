package LeetcodePractise;

import java.util.*;

public class maxCorrectAnswer {
    
    static void ptice(int n, String key) {
        int countA = 0, countB = 0, countG = 0;
        String patternA = "ABC", patternB = "BABC", patternG = "CCAABB";
        for (int i = 0; i < n; i++) {
            if (key.charAt(i) == patternA.charAt(i % 3))
                countA++;
            if (key.charAt(i) == patternB.charAt(i % 4))
                countB++;
            if (key.charAt(i) == patternG.charAt(i % 6))
                countG++;
        }
        int maxMatch = Math.max(countA, Math.max(countB, countG));
        System.out.println(maxMatch);
        if (maxMatch == countA) {
            System.out.println("Adrian");
        }
        if (maxMatch == countB) {
            System.out.println("Bruno");
        }
        if (maxMatch == countG) {
            System.out.println("Goran");
        }
    }  
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //iNPUT ONLY ABC OPTIONS IN STRING FORMAT
        int n;
        n = sc.nextInt(); //N IS THE QUESTION LENGTH
        String str = sc.next(); //STRING OF ABC OPTIONS IS PATTERN OF ANSWER KEY
        ptice(n, str);
        sc.close();
    }

    // QUESTION LINK: https://open.kattis.com/problems/ptice
}


