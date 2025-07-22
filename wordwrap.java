import java.util.*;

public class wordwrap {

    // Method to solve word wrap problem
    public static int solveWordWrap(int[] words, int k) {
        int n = words.length;
        int[][] cost = new int[n][n];
        
        // Step 1: Calculate extra spaces in single lines
        for (int i = 0; i < n; i++) {
            int lineLen = -1;
            for (int j = i; j < n; j++) {
                lineLen += (words[j] + 1); // 1 for space
                if (lineLen <= k) {
                    cost[i][j] = (int)Math.pow(k - lineLen, 2);
                } else {
                    cost[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        // Step 2: Use DP to find minimum cost
        int[] dp = new int[n];
        int[] result = new int[n]; // To store solution (not printed here)

        for (int i = n - 1; i >= 0; i--) {
            dp[i] = cost[i][n - 1]; // assume last line
            result[i] = n;

            for (int j = n - 1; j > i; j--) {
                if (cost[i][j - 1] == Integer.MAX_VALUE) continue;
                if (dp[i] > dp[j] + cost[i][j - 1]) {
                    dp[i] = dp[j] + cost[i][j - 1];
                    result[i] = j;
                }
            }
        }

        return dp[0]; // minimum total cost
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 5};
        int k = 6;
        System.out.println("Minimum cost = " + solveWordWrap(arr, k));

        int[] arr2 = {3, 2, 2};
        int k2 = 4;
        System.out.println("Minimum cost = " + solveWordWrap(arr2, k2));
    }
}
