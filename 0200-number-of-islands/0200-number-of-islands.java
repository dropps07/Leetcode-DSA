class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] vis= new boolean[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    count++;

                    dfs(i, j, vis, grid);
                }
            }
        }
        return count;
    }
    private void dfs(int r, int c, boolean[][] vis, char[][]grid){
        vis[r][c]= true;

        int[] dr= {-1,1,0,0};
        int[] dc= {0,0, -1, 1};

        for(int k=0;k<4;k++){
            int nr = r+ dr[k];
            int nc = c+ dc[k];

            if(nr>=0 && nr<grid.length 
            && nc>=0 && nc<grid[0].length){
                if(!vis[nr][nc] && grid[nr][nc]=='1'){
                    dfs(nr, nc, vis, grid);
                }
            }
        }
    }
}