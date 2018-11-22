package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pratik on 9/9/2017.
 */
public class CoinChange {
        public int coinChange(int[] coins, int amount) {
            if(amount < 1){
                return 0;
            }
            int[] dp = new int[amount];
            return coinChange(coins, amount, dp);

        }

        public int coinChange(int[] coins, int remAmount, int[] dp){
            if(remAmount < 0){
                return -1;
            }
            if(remAmount == 0 ){
                return  0;
            }

            if (dp[remAmount - 1] != 0) return dp[remAmount - 1];

            int minValue = 9999;
            int val = 0;
            for(int i = 0 ; i < coins.length ; i++){
                val = 1 + coinChange(coins, remAmount - coins[i], dp );
                if(minValue > val && val >= 1){
                    minValue = val;
                }
            }

            return minValue;


        }

        public int coinChangeDP(int[] coins, int amount){
            int []dp = new int[amount + 1];
            int []result = new int[amount + 1];
            Arrays.fill(result, -1);
            Arrays.fill(dp, amount+1);
            dp[0] = 0;
            for(int i=1 ; i <= amount ; i++){
                for(int j=0 ; j < coins.length ; j++){
                    if(coins[j] <= i){
//                        dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]] );
                        if(dp[i] >= 1 + dp[i - coins[j]]){
                            dp[i] = 1 + dp[i - coins[j]];
                            result[i] = j;
                        }
                    }

                }
            }

//            for(int i = 0 ; i < result.length ; i++){
//                System.out.println(result[i]);
//            }
//            HashMap<Integer,Integer> map = new HashMap<>();
            int[] resultCount = new int[coins.length];
            if(dp[amount] > amount){
                return -1;
            }else {
                int n = amount;
                while (n > 0){
//                    System.out.println("Answers "+ result[n]);
                    resultCount[result[n]]++;
                    n = n - coins[result[n]];

                }
                for (int i = 0 ; i < coins.length ; i++) {
                    System.out.println(coins[i] +":"+ resultCount[i]);
                }

                return dp[amount];
            }


        }

}
