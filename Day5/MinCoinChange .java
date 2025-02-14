
public class MinCoinChange {
    public static int minCoins(int[] coins, int amount) {
        int n = coins.length;
        int[] dp = new int[amount + 1];
        
        // Initialize dp array with a large value
        for (int i = 0; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
            System.out.println(dp[i]);

        }
        dp[0] = 0; // Base case: 0 coins needed to make amount 0

        // Build the dp table
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < n; j++) {
                if (coins[j] <= i && dp[i - coins[j]] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int result = minCoins(coins, amount);
        System.out.println(result);
    }
}