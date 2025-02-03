package RecurtionQuestions;


    import java.util.*;

public class count7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count7(n));
        sc.close();
    }

    public static int count7(int n) {
        // your code here
        if(n==0){
            return 0;
        }
        int count=0;
        if(n%10==7){
            count=1;
        }
        return count+count7(n/10);

    }
}
    

