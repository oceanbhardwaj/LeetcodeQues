class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int p1=p.val;
        int p2=q.val;
        
        if(p1>root.val && p2>root.val)
            return lowestCommonAncestor(root.right,p,q);
        else if(p1<root.val && p2<root.val)
    return lowestCommonAncestor(root.left,p,q);
        else 
            return root;
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
