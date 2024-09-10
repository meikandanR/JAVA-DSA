public class CoinChange {

        public static int countWays(int coins[], int m, int N) {
            int[] dp = new int[N+1];

            // Initialize dp[0] = 1 because there's one way to make 0 with 0 coins
            dp[0] = 1;

            // Iterate over the coins
            for (int i = 0; i < m; i++) {
                // Update the dp array for each coin
                for (int j = coins[i]; j <= N; j++) {
                    dp[j] += dp[j - coins[i]];
                }
            }

            return dp[N];
        }

        public static void main(String[] args) {
            int coins[] = {1, 2, 3};
            int N = 4;
            int m = coins.length;

            System.out.println("Number of ways to make change for " + N + " cents: " + countWays(coins, m, N));

            int coins2[] = {2, 5, 3, 6};
            int N2 = 10;
            int m2 = coins2.length;

            System.out.println("Number of ways to make change for " + N2 + " cents: " + countWays(coins2, m2, N2));
        }
    }


