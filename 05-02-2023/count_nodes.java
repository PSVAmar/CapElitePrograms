class Solution {
    int sum=0;
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        sum+=1;
        return sum;
    }
}