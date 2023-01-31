class Solution {
    int sum =0;
    public void checkLeft(TreeNode root,boolean isLeft){
        if(root == null){
            return ;
        }
        if(isLeft && root.left == null && root.right == null){
            sum+=root.val;
            return ;
        }
        if(root.left != null) checkLeft(root.left,true);
        if(root.right != null ) checkLeft(root.right,false);

    }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
        checkLeft(root,false);
    return sum;
    }
}