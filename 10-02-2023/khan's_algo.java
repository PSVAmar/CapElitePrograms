class Solution
{
    
    static void findTopoSort(int i,ArrayList<ArrayList<Integer>> adj,int[] visited,Stack<Integer> st){
        visited[i]=1;
        for(int neigh:adj.get(i)){
            if(visited[neigh]==0){
                findTopoSort(neigh,adj,visited,st);
            }
        }
        st.push(i);
    }
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        
        int[] visited = new int[V];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<V;i++){
            if(visited[i]==0){
                findTopoSort(i,adj,visited,st);
            }
        }
        int[] arr = new int[V];
        int ind=0;
        while(!st.isEmpty()){
            arr[ind++] = st.pop();
        }
        return arr;
    }
}
