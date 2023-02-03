class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        class Obj{
            Node root;
            int hd;
            public Obj(Node root,int hd)
            {
                this.root=root;
                this.hd=hd;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Map<Integer,Integer> map = new TreeMap<>();
        Queue<Obj> queue = new LinkedList<Obj>();
        queue.add(new Obj(root, 0)); 
        while(!queue.isEmpty()){
            Obj temp = queue.remove();
            Node curr = temp.root;
            int off = temp.hd;
            if(map.get(off)==null) map.put(off,curr.data);
            if(curr.left!= null){
                queue.add(new Obj(curr.left,off-1));
            }
            if(curr.right!=null){
                queue.add(new Obj(curr.right,off+1));
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
        
    }
}