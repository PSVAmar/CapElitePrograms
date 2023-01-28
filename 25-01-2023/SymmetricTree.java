class Solution {
    public boolean isSymmetric(TreeNode root) {
        boolean ans = Traversal(root,root);
        return ans;
    }
    public boolean Traversal(TreeNode root1 , TreeNode root2){
        if(root1==null && root2==null){
            return true;
        }
        if((root1==null && root2!=null) || (root1!=null && root2==null) ){
            return false;
        }
        if(root1.val!=root2.val){
            return false ;
        }
        
        boolean left  = Traversal(root1.left,root2.right);
        if(left == false){
            return false ;
        }
        boolean right = Traversal(root1.right , root2.left);
        if(right == false){
            return false ;
        }
        return left && right ;
    }
}