package LeetcodePractise;
import java.util.*;
import java.io.*;

public class CompressedString {
    static void compressedString(String s) {
        int count = 1;
        StringBuilder str = new StringBuilder();
        str.append(s.charAt(0)); 
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                count++;
            } else {
                if (count > 1) {
                    str.append(count); // Append count only if greater than 1
                }
                str.append(s.charAt(i)); // Append next character
                count = 1; // Reset count
            }
        }
        if (count > 1) {
            str.append(count);
        }
        
        System.out.print(str);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            compressedString(s);
            System.out.println();
        }
    }
}

