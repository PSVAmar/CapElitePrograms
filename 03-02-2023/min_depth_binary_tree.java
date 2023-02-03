class Solution {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(left==0 && right ==0){
            return left+1;
        }
        else if(left == 0){
            return right+1;
        }
        else if(right ==0){
            return left+1;
        }
        else{
            return 1+Math.min(left,right);
        }
    }
}