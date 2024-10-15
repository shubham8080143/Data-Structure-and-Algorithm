import java.util.Arrays;

public class merge {
   void main(String[]args){
    int[] a={97,6,8,5,4,6,3,2,1};
    merg(a, 0, a.length-1);

   }
   static void merg(int[] a,int s,int e){
      if(a.length<0){
        return;
      }
      int mid=s+e/2;
      merg(a, s, mid);
      merg(a,mid+1,e);
      sort(a,s,mid,e);
      System.out.println(Arrays.toString(a));


   }
 static void sort(int[] a, int s, int mid, int e) {
    int[] b=new int[e-s+1];
    int i=s;
    int j=mid+1;
    int count=0;
    while(i<=mid && j<=e){
        if(a[i]<a[j]){
            b[count++]=a[i++];

        }else{
            b[count++]=a[j++];
        }
    }
    while(i<=mid){
        b[count++]=a[i++];
    }
    while(j<=e){
        b[count++]=a[j++];
    }
    int k;
    for (k=s;key<b.length;k++) {
        a[key++]=b[count];

        
    }

}
}
