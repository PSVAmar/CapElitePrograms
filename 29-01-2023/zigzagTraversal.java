class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
	int i=2;
        Queue<TreeNode> queue =new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> row = new LinkedList<>();
            int size = queue.size();
            
            for(int j=0;j<size;j++){
                TreeNode curr = queue.poll();
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
                if(i%2==0){
                     row.add(curr.val);
                }
                else{
                    row.add(0,curr.val);
                }
            }
            i=i+1;
            result.add(row);
        }
        return result;
    }
}