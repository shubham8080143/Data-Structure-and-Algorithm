import java.util.Arrays;

public class selection {
    void main(String[] args){
        int[] a={9,8,7,6,5,4,3,2,1};
        for(int i=0;i<a.length-1;i++){
            int current=i;
            for(int j=i+1;j<a.length;j++){
                if(a[current]>a[j]){
                    current=j;
                }
            }
            int temp=a[current];
            a[current]=a[i];
            a[i]=temp;
            System.out.println(Arrays.toString(a));
        }
    }
}
