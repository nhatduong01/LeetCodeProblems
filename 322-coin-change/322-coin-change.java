class Solution {
    static public int coinChange(int[] coins, int amount)
    {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for(int i = 1; i < amount + 1; i ++)
        {
            for (int coin:coins) {
                if (i - coin >= 0)
                    if (dp[i] > 1 + dp[i - coin])
                        dp[i] = 1 + dp[i - coin];
            }
        }
        return (dp[amount] == amount + 1)? -1 : dp[amount];
    }
}