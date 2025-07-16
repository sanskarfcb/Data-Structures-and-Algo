package Arrays;

public class BuyandSell {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int a = prices[0];
        int b = 0;

        for(int i=0;i<n;i++){
            a = Math.min(a , prices[i]);
            int c = prices[i]-a;
            b = Math.max(c,b);
        }
        return b;
    }
}
