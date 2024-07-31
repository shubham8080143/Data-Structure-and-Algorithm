import java.util.Arrays;

public class insertio {
    void main(String []args){
        int[] a={97,6,8,5,4,6,3,2,1};
       int i=1;
        while(i<a.length){
            int key=a[i];
            int j=i-1;
          while (j>=0 && a[j]>key) {
            a[j+1]=a[j];j--;
          }
          a[j+1]=key;
          
          System.out.println(Arrays.toString(a));

        
          i++;
        }
    }   
}
