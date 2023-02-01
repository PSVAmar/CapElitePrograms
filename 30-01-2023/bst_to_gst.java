class Solution {
    int sum =0;
    public void checkk(TreeNode root){
        if(root == null){
            return ;
        }
        checkk (root.right);
        sum+=root.val;
        root.val=sum;
        checkk(root.left);
    }
    public TreeNode convertBST(TreeNode root) {
        if(root == null){
            return root;
        }
        checkk(root);
        return root;
    }
}