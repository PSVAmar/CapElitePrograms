class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode tn = new TreeNode(val,null,null);
        TreeNode parent=null;
        TreeNode curr= root;
        if(root == null){
            return tn;
        }
        while(curr!=null){
            parent = curr;
            if(val<curr.val){
                curr = curr.left;
            }
            else{
                curr = curr.right;
            }
        }
        if(val<parent.val){
            parent.left = tn;
        }
        else{
            parent.right = tn;
        }
        return root;
    }
}