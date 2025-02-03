package RecurtionQuestions;
import java.io.*;
import java.util.*;

class triangle
{

	public static void solve(int n)
    {
        if(n==0){
            return;
        }
        solve(n-1);
        for(int i=n;i>0;i--){
            System.out.print("* ");
        }
        System.out.println("");
        
        
    }
	
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
		solve(n);

    }
}
    

