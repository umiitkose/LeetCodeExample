package com.umiitkose.top150.arrayandstring;

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int transaction = 0;
        if (prices.length < 2) {
            return transaction;
        }
        int buy = prices[0];
        int sell;

        int i = 0;
        do {
            if (i < prices.length - 1) {
                sell = prices[i + 1];

                if (buy >= sell) {

                    buy = prices[i];

                } else {
                    transaction = Math.max(transaction, sell - buy);

                }
            }

            i++;
        } while (i < prices.length);
        return transaction;

    }
/** Saçma düşünceye gerek yokmuş :)
 *
 * int buyprice = Integer.MAX_VALUE;
 *     int op = 0;// overall profit
 *     int pist = 0; // profit if sold today****
 *     for(int i = 0; i < prices.length; i++){
 *         if(prices[i] < buyprice){
 *             buyprice = prices[i];
 *         }
 *         pist = prices[i] - buyprice;
 *         if(op < pist){
 *             op = pist;
 *         }
 *     }
 *     return op;
 *     */

}


/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * <p>
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * Example 2:
 * <p>
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 */