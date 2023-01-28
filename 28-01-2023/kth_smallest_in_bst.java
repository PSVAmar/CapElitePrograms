class Solution {
    List<Integer> list =new ArrayList<>();
    public void usingList(TreeNode root) {
        if(root == null){
            return;
        }
        usingList(root.left);
        list.add(root.val);
        usingList(root.right);
    } 
    public int kthSmallest(TreeNode root, int k) {
        if(root == null){
            return 0;
        }
        usingList(root);
        return list.get(k-1);
    }
}