class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0], nums[1]);
        int first= helper(nums, 1, n);
        int sec = helper(nums, 0, n-1);
        return Math.max(first, sec);
    }
    public int helper(int nums[], int start, int end){
        int prev2 = nums[start];
        int prev1 = Math.max(nums[start], nums[start+1]);
        for(int i=start+2;i<end;i++){
            int cur = Math.max(nums[i]+prev2, prev1);
            prev2= prev1;
            prev1 = cur;
        }
        return prev1;
    }
}