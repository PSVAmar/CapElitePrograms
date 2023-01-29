class Solution {
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        height(root);
        return max;


        
    }
    public int height(TreeNode t)
    {
        if(t==null)
        {
            return 0;
        }
        int left = height(t.left);
        int right = height(t.right);
        if(left+right+1>max)
        {
            max = left+right;
        }
        return Math.max(left,right)+1;
    }
}