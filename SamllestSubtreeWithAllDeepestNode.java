class Solution {
    TreeNode res=null;
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if(root==null)
            return null;
       int left=getHeight(root.left);
        int right=getHeight(root.right);
        if(left<right)
            subtreeWithAllDeepest(root.right);
        else if(left>right)
            subtreeWithAllDeepest(root.left);
       else if(left==right)
       {
           res=root;
           return root;
       }
                  
       return res;
        
        
    }
    public int getHeight(TreeNode root)
    {
        if(root==null)
            return 0;
        return 1+Math.max(getHeight(root.left),getHeight(root.right));
    }
}