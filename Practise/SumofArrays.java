package Practise;

import java.util.*;

public class SumofArrays{
  static int[] calSum(int a[], int b[], int n, int m) {
    int number1=0;int number2=0;
    for(int i=0;i<a.length;i++){
      number1=number1*10+a[i];
    }
    for(int i=0;i<b.length;i++){
      number2=number2*10+b[i];
    }
    int sum=number1+number2;
    System.out.println(number1+" "+number2+" "+sum);
   String numStr = String.valueOf(sum);
int[] result=new int[numStr.length()];
for(int i=0;i<numStr.length();i++){
  result[i]=numStr.charAt(i) - '0';
}
return result;
  }

  /* Driver program to test above function */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
    sc.close();

    int[] res = calSum(arr1, arr2, n1, n2);
    for (int i : res) System.out.println(i);
  }
}
