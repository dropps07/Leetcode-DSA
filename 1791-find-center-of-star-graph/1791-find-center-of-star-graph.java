class Solution {
    public int findCenter(int[][] edges) {
        //pehle edge ka first node
        int a = edges[0][0];
        //doosri edge ka sec node
        int b = edges[0][1];
        if(a == edges[1][0] || a == edges[1][1]){
            return a;
        }
        return b;
    }
}