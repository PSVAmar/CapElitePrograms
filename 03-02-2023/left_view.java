import java.util.ArrayList;

public class Solution 
{
    static int currDepth;
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) 
    {
        //    Write your code here.
        ArrayList<Integer> result = new ArrayList<>();
        checkLeftView(root,result,currDepth);
        return result;
    }
    public static void checkLeftView(TreeNode<Integer> root,List<Integer> result,int currDepth){
        if(root == null){
            return ;
        }
        if(currDepth==result.size()){
            result.add(root.data);
        }
        checkLeftView(root.left, result, currDepth+1);
        checkLeftView(root.right, result, currDepth+1);
    }
}