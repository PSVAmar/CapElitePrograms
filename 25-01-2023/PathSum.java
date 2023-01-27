class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return has(root,0,targetSum);
    }

    public boolean has(TreeNode t,int sum,int targetSum){
        if(t==null)
            return false;
        sum+=t.val;
        if(t.left==null && t.right==null){
            return sum==targetSum ;

        }
        return has(t.left,sum,targetSum)||has(t.right,sum,targetSum);
    }
}