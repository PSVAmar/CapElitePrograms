class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        checkRightView(root,result,0);
        return result;
    }
    public void checkRightView(TreeNode root,List<Integer> result,int currDepth){
        if(root == null){
            return;
        }
        if(currDepth == result.size()){
            result.add(root.val);
        }
        checkRightView(root.right,result,currDepth+1);
        checkRightView(root.left,result,currDepth+1);
    }
}