package Practise;

// Java program to substract two numbers
// represented two arrays.
import java.util.*;

public class substractArrays {

  static int[] subtract(int[] a, int[] b) {
    long number1=0;long number2=0;
    for(int i=0;i<a.length;i++){
      number1=number1*10+a[i];
    }
    for(int i=0;i<b.length;i++){
      number2=number2*10+b[i];
    }
    long sub=number1 - number2;
    boolean isNegative = sub < 0;
    sub = Math.abs(sub);
   String numStr = String.valueOf(sub);

int[] result=new int[numStr.length()];

// if(isNegative){
//   result[index++]=-1;

// }

for(int i=0;i<numStr.length();i++){
  result[i]=numStr.charAt(i) - '0';
}if(isNegative){
  result[0]=-1*result[0];

}

return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
    sc.close();

    int[] res = subtract(arr1, arr2);
    for (int i : res) System.out.println(i);
  }
}
