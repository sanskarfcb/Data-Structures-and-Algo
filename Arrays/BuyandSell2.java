package Arrays;

public class BuyandSell2 {
        public int maxProfit(int[] prices) {
            int b=0;
            for(int i =1;i<prices.length;i++){
                if(prices[i]>prices[i-1]){
                    b=b+(prices[i]-prices[i-1]);
                }
            }
            return b;
        }
    }


