package LeetcodePractise;

public class BuySellStock {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxprofit(prices));
        
    }

    public static int maxprofit(int[] prices){
        int minPrice=Integer.MAX_VALUE;
        int price;int maxprofit=0; int daysell=0;int daytobuy=0;
        for(int i=0;i<prices.length;i++){
            price=prices[i];
            if(prices[i]<minPrice){
                minPrice=prices[i];
                 daytobuy=i+1;
            }else if(price-minPrice> maxprofit){
                maxprofit=price-minPrice;
                 daysell=i;
                
            }


        }
        System.out.println("we cn buy stock on day"+daytobuy+" and sell at day "+daysell);
        return maxprofit;

    }
    
}
