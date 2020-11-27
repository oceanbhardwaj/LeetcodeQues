class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> path1=new ArrayList<>();
        ArrayList<TreeNode> path2=new ArrayList<>();
       if(call(root,p,path1)==false || call(root,q,path2)==false)
           return null;
        TreeNode max=null;
       for(int i=0;i<path1.size() && i<path2.size();i++)
       {
           if(path1.get(i)==path2.get(i))
              max=path1.get(i);
       }
        return max;
        
    }
    public boolean call (TreeNode root,TreeNode p,ArrayList<TreeNode> path)
    {
        if(root==null)
            return false;
        path.add(root);
        if(root.val==p.val)
            return true;
      if(call(root.left,p,path) || call(root.right,p,path))
          return true;
        
        path.remove(path.size()-1);
        
        
        
        
        
        
        
       return false;
        
        
        
    }
}