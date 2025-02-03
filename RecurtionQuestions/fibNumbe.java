package RecurtionQuestions;
import java.util.*;

public class fibNumbe {

	public static int fib(int N ){
  
        if (N <= 0) {
            return -1; 
        } else if (N == 1) {
            return 0;   
        } else if (N == 2) {
            return 1;  
        } else {
            
            return fib(N - 1) + fib(N - 2);
        }
    


    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fib(n));
    }
}