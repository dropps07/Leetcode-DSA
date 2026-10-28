class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        boolean[][] vis = new boolean[m][n];
        
        int fresh=0;
        int time=0;

        for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(grid[i][j]==2){
                        q.offer(new int[]{i,j});
                    }else if(grid[i][j]==1){
                        fresh++;
                    }
                }
            }
        while(!q.isEmpty() && fresh>0){
            int len = q.size();
            for(int i=0;i<len;i++){
                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];
                //directions
                int[] dr = {-1, 1, 0, 0};
                int[] dc = {0, 0, -1, 1};
                for(int k=0;k<4;k++){
                    //neighbor coordinates
                    int nr = r+ dr[k];
                    int nc = c+ dc[k];
                    if(nr >=0 && nr<m
                    && nc >=0 && nc<n){
                        if(grid[nr][nc]==1){
                            grid[nr][nc]=2;
                        fresh--;
                        q.offer(new int[]{nr, nc});
                        }
                    }
                }
            }time++;
        }
        if(fresh==0){
            return time;
        }else{
            return -1;
        }
    }
}