class Solution {
    int sum=0;
    void inorder(TreeNode root) {
        if(root==null){
            return;
        }
        inorder(root.right);
        sum+=root.val;
        root.val = sum;
        inorder(root.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        if(root==null){
            return null;
        }
        inorder(root);
        return root;
    }
}