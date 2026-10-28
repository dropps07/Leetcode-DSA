class Solution {
    public int[][] floodFill(int[][] image, int i, int j, int color) {
        int original = image[i][j];
        if (original == color) return image;
        dfs(image, i, j, color, original);
        return image;
    }
    public void dfs(int[][] image, int i, int j, int color, int original){
        if(i<0 || j<0 || i>=image.length || j >= image[0].length || image[i][j]!= original){
            return;
        }
        image[i][j] = color;
        dfs(image, i+1, j, color, original); //right
        dfs(image, i, j+1, color, original); //left
        dfs(image, i, j-1, color, original); //down
        dfs(image, i-1, j, color, original); //up
    }
}