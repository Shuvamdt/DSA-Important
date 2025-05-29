public class BuyAndSellStocks{
    public static void main(String[] args) {
        int prices[]={7, 1, 5, 3, 6, 4};
        int bp=Integer.MAX_VALUE,maxProfit=0;
        for(int i=0 ; i<prices.length ; i++){
            if(bp<prices[i]){
                int profit = prices[i]-bp;
                maxProfit=Math.max(maxProfit, profit);
            }else{
                bp=prices[i];
            }
        }
        System.out.println("The maximum profit is: "+maxProfit);
    }
}