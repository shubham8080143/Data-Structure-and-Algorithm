package RecurtionQuestions;

public class CheckPalidrome {
    public static boolean isPalidrome(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        return (s.charAt(start) == s.charAt(end)) && isPalidrome(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String s = "madam";
        int start = 0;
        int end = s.length() - 1;
        System.out.println(isPalidrome(s, start, end));
    }
    
}
