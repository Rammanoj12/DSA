// You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

// On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it 
// then immediately sell it on the same day.

// Find and return the maximum profit you can achieve.

 

// Example 1:

// Input: prices = [7,1,5,3,6,4]
// Output: 7
// Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
// Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
// Total profit is 4 + 3 = 7.
// Example 2:

// Input: prices = [1,2,3,4,5]
// Output: 4
// Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
// Total profit is 4.









////////////////////////////////////////////////////////////
// public class buyandsellstock2 {
//     public static void main(String[] args) {
//         int profit=0;
//         for(int i=1; i<prices.length; i++){
//             if(prices[i]>prices[i-1]){
//                 profit+=prices[i]-prices[i-1];
//             }
//         }
//         return profit;
//     }
// }
//////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////
// class Solution {
//     public int maxProfit(int[] prices) {
// //declare profit,stock purchase as stock and final ans for return
//         int profit=0,stock=prices[0],ans=0;
//         int n = prices.length;
//     //ittrate loop from 1 index 
//         for(int i=1;i<n;i++){
//             // if price of stock less next day sell stock on same day and buy stock next day
//             if(prices[i]<stock){
//                 stock = prices[i];
//             }
// //if next day price hike calculate the profit and add with ans
//            if(prices[i]>prices[i-1]){
//                profit=prices[i]-stock;
//                stock = prices[i];
//                ans+=profit;
//            }
//         }
//         return ans;
//     }
// }
//////////////////////////////////////////////////////////