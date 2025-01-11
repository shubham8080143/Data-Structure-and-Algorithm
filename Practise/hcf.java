package Practise;

public class hcf {
    public static void main(String[] args) {
        checkhcf(15, 25);
        
    }
    static void checkhcf(int a,int b){
        int min=Math.min(a, b);
        for(int i=min;i>0;i--){
            if(a %i ==0 && b%i==0){
                System.out.print(i);
                return;
            }
        }
    }
    
}
