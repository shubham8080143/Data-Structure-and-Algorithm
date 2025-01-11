package Practise;

import java.util.*;

public class Building{

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    int[] ar={3,1,2,4,5};
    buildings(arr, n);
  }

  public static void buildings(int[] arr, int n) {
    int maxheight = 0;
     for(int i = 0; i < n; i++){
    if(arr[i] > maxheight){
        maxheight = arr[i];
    }}
    for(int i=maxheight;i>0;i--){
      for(int j=0;j<n;j++){
        if(arr[j]>=i){
          System.out.print("* ");
           
        }else{
          System.out.print("  ");
        }
      }
      System.out.println("");

    }
  }
}
   
    


