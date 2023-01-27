class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue =new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> row = new LinkedList<>();
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode curr = queue.poll();
                row.add(curr.val);
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
            }
            result.add(row);
        }
        return result;
    }
}