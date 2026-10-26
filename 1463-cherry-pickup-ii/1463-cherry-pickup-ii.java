class Solution {
    int dp[][][];
    public int cherryPickup(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        dp= new int[m][n][n];
        for (int[][] plane : dp) {
            for (int[] row : plane) {
                Arrays.fill(row, -1);
            }
        }
        return solve(0, 0, n-1, grid);
    }
    public int solve(int i, int j1, int j2, int[][]grid){
        int m = grid.length;
        int n = grid[0].length;
        int cherries;
        if (j1 == j2) {
            cherries = grid[i][j1];
        } else {
            cherries = grid[i][j1] + grid[i][j2];
        } 
        int maxCherries=0;;
        if(i==m-1){
            if(j1==j2) {
                return grid[i][j1];
            }else{ 
                return grid[i][j1]+grid[i][j2];
            }
        }
        if (dp[i][j1][j2] != -1) {
            return dp[i][j1][j2];
        }      
        for(int move1 =-1;move1<=1;move1++){
            for(int move2=-1;move2<=1;move2++){
                int nextj1 = move1+j1;
                int nextj2 = move2+j2;
                if(nextj1>=0 && nextj1<n
                && nextj2>=0 && nextj2<n){
                    int future = solve(i+1, nextj1, nextj2, grid);
                    maxCherries= Math.max(maxCherries, future); 
                }
            }
        }
        return dp[i][j1][j2] = cherries + maxCherries;
    }
}