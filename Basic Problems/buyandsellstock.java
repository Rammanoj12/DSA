//BUY AND SELL STOCK
// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

// Example 1:

// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.















//////////////////////////////////////////////////////////
//Most optimized code
// class Solution {
//     public int maxProfit(int[] prices) {
//         int buy = Integer.MAX_VALUE;
//          int sell =0;
        
//      for(int i =0 ;i<prices.length;i++){
//           buy = Math.min(buy,prices[i]);
//           sell = Math.max (sell,prices[i]-buy);
//      
//}
//  return sell;
// }
///////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////
public class buyandsellstock {
    public static  int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }
    public static void main(String[] args) {
        int[] prices ={2,100,150,120};
        int result = maxProfit(prices);
        System.out.println(result);
    }
}
///////////////////////////////////////////////////////////







/////////////////////////////////////////////////////////////
//KADANE'S ALGORITHM
// public class buyandsellstock {
//     public static void main(String[] args) {
        
//                 int maxCur = 0, maxSoFar = 0;
//                 for(int i = 1; i < prices.length; i++) {
//                     maxCur += prices[i] - prices[i-1];
//                     maxCur = Math.max(0, maxCur);
//                     maxSoFar = Math.max(maxCur, maxSoFar);
//                 }
//                 return maxSoFar;
            
         
//     }
// }
////////////////////////////////////////////////////////////