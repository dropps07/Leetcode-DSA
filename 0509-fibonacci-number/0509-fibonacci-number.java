class Solution {
    public int fib(int n) {
        int memo[] = new int[n+1];
        return solve(n, memo);
    }
    private int solve(int n, int[] memo){
        if(n<=1) return n;
        if(memo[n]!=0){
            return memo[n];  //DP problems mein, jahan answer zero bhi ho sakta hai, -1 se initialize karna ya visited[] use kro.
        }
        memo[n] = solve(n-1, memo)+solve(n-2, memo);
        return memo[n];
    }
}