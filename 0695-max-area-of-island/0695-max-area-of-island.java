class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxA=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    int area = dfs(grid, i, j);
                    maxA = Math.max(maxA, area);
                }
            }
        }
        return maxA;

    }
    private int dfs(int[][]grid, int i, int j){
        if(i<0 || j<0 
        || i>=grid.length
        || j>=grid[0].length
        || grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0; //marking vis
        int area=1;
        area += dfs(grid, i+1, j); //down
        area += dfs(grid, i-1, j); //up
        area += dfs(grid, i, j+1);  //rigth
        area += dfs(grid, i, j-1); //left
        return area;
    }
}