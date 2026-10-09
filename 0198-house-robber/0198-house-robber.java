class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        // Step 1: Handle the single-house case
        if(n<2) return nums[n-1];
        // Step 2: Create the DP array
        int[] dp= new int[n];
        // Step 3: Initialize the first two states
        dp[0]=nums[0];
        dp[1]= Math.max(nums[0], nums[1]);
        // Step 4: Calculate the remaining states
        for (int i = 2; i < n; i++) {
            // Write the recurrence here
            dp[i]= Math.max(nums[i]+ dp[i-2], dp[i-1]);
        }
        // Step 5: Return the final answer
        return dp[n-1];
    }
}
