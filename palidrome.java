
import java.util.*;

class palidrome {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String s = sc.next();
      camelCase(s);
      System.out.println(); 
      
    }
  }

  static void camelCase(String s) {
    // your code here
    StringBuilder str=new StringBuilder();
    for(int i=1;i<s.length();i++){
        
       if(s.charAt(i-1)=='_'){
        str.append(Character.toUpperCase(s.charAt(i)));

       }else{
        str.append(s.charAt(i-1));

       }
       System.out.print(str);
    }
  }
}
