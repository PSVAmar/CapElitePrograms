class BSTIterator {
    Stack<TreeNode> stack = new Stack<>();
    public BSTIterator(TreeNode root) {
        pushAll(root);
    }
    
    public int next() {
        TreeNode tmpnode = stack.pop();
        pushAll(tmpnode.right);
        return tmpnode.val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }
    public void pushAll(TreeNode node){
        for(;node!=null;stack.push(node),node = node.left);
    }
}