import java.util.*;

public class MalaikaStringGame {
    
    // Function to find the minimum String Factor
    public static int findMinStringFactor(String X, String Y, int S, int R) {
        int m = X.length();
        int n = Y.length();
        
        // dp[i] will store the minimum String Factor to form X[0..i-1]
        int[] dp = new int[m + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);  // Fill with a large value
        dp[0] = 0;  // No substrings required to form the empty string
        
        // Precompute the reversed string of Y
        String reversedY = new StringBuilder(Y).reverse().toString();
        
        // Check for every position in X
        for (int i = 1; i <= m; i++) {
            // Try to match a substring from Y
            for (int len = 1; len <= i && len <= n; len++) {
                String subX = X.substring(i - len, i);  // Current substring in X
                
                // Match with Y
                if (Y.contains(subX)) {
                    dp[i] = Math.min(dp[i], dp[i - len] + S);
                }
                
                // Match with reversed Y
                if (reversedY.contains(subX)) {
                    dp[i] = Math.min(dp[i], dp[i - len] + R);
                }
            }
        }
        
        return dp[m] == Integer.MAX_VALUE ? -1 : dp[m];  // Return the result
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input
        String X = sc.next();
        String Y = sc.next();
        int S = sc.nextInt();
        int R = sc.nextInt();
        
        // Find the minimum String Factor
        int result = findMinStringFactor(X, Y, S, R);
        
        // Output the result
        System.out.println(result);
        
        sc.close();
    }
}
