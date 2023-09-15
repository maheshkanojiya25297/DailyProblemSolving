public class PartitionEqualSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 11, 5};
        if (canPartition(arr))
            System.out.println("The array can be partitioned into two equal parts.");
        else
            System.out.println("The array cannot be partitioned into two equal pafrts.");
    }

    private static boolean canPartition(int[] arr) {

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        if (sum % 2 != 0) {
            return false;
        }

        int target = sum / 2;
        int n = arr.length;
        boolean[][] dp = new boolean[n + 1][target + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                if (j > arr[i - 1]) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println("return: " +dp[n][target]);
        return dp[n][target];
    }
}
