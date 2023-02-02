class Solution {
    private TreeNode first,prev,middle,last;
    private void inorder(TreeNode root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        if(prev!=null && (root.val<prev.val)){
            if(first == null){
                first = prev;
                middle = root;
            }
            else{
                last = root;
            }
        }
        prev= root;
        inorder(root.right);
    }
    public void recoverTree(TreeNode root) {
        first = last =middle = null;
        prev = new TreeNode(Integer.MIN_VALUE);
        inorder(root);
        if(first!=null && last!=null){
            int t = first.val;
            first.val = last.val;
            last.val = t;
        }
        else{
            int t = first.val;
            first.val = middle.val;
            middle.val = t;
        }
    }
}