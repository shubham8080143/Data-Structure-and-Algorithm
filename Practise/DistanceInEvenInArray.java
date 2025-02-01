package Practise;

import java.util.*;

public class DistanceInEvenInArray  {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        int ans=ArrayProblem6(n,arr);
        System.out.println(ans);
    }
    public static int ArrayProblem6(int n, int[] arr){
        int distance=Integer.MAX_VALUE;int preindex=-1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0 && arr[i]>0){
                if(preindex!=-1){
                    distance=Math.min(distance,i-preindex);
                }
                preindex=i;
                
            }

        }
        if(distance==Integer.MAX_VALUE){
            return -1;
        }else{
            return distance;
        }
    }
}
