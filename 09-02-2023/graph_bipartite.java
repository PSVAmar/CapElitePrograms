class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<graph[i].length;j++){
                adj.get(i).add(graph[i][j]);
            }
        }
        int[] color = new int[graph.length];
        for(int i=0;i<color.length;i++){
            color[i]=-1;
        }

        for(int i=0;i<color.length;i++){
            if(color[i]==-1){
                if(!checkBipartite(adj,i,color)){
                    return false;
                }
            }
        }
        return true;
    }
    private boolean checkBipartite(ArrayList<ArrayList<Integer>> adj,int i,int color[]){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(i);
        color[i]= 1;
        while(!queue.isEmpty()){
            int node = queue.poll();
            for(Integer neigh:adj.get(node)){
                if(color[neigh]==-1){
                    color[neigh] = 1-color[node];
                    queue.offer(neigh);
                }
                if(color[neigh]==color[node]){
                    return false;
                }
            }
        }
        return true;
    }
}