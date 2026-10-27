class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int x[] : edges){
            int v = x[0];
            int u = x[1];
            adj.get(v).add(u);
            adj.get(u).add(v);
        }
        boolean[] visited= new boolean[n];
        return solve(source, destination, adj, visited);
    }
    private boolean solve(int source, int destination, List<List<Integer>> adj, boolean[] visited){
        //base case
        if(source == destination) return true;
        visited[source]= true;
        for(int x: adj.get(source)){
            if(!visited[x]){
                if(solve(x,destination, adj, visited)){
                    return true;
                }
            }
        }
        return false;
    }
}