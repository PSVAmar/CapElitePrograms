class Solution {
    int checkbalance(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = checkbalance(root.left);
        if(left == -1) return -1;
        int right = checkbalance(root.right);
        if(right == -1) return -1;
        if(Math.abs(left- right)>1){
            return -1;
        }
        return Math.max(left,right)+1;
    }
    public boolean isBalanced(TreeNode root) {
        
        if(checkbalance(root)==-1){
            return false;
        }
        return true;
    }
}