class Solution {
     int flag=0;
    public TreeNode pruneTree(TreeNode root) {
        TreeNode curr=root;
        call(root);
        if(root.left==null && root.right==null && root.val==0)
            return null;
        return root;
        
    }
    public void call(TreeNode root)
    {
        if(root==null)
            return ;
        boolean left1=check(root.left);
        boolean right1=check(root.right);
        if(left1==false && right1==false)
        {
            root.left=null;
            root.right=null;
            
        }
        else if(left1==false)
            root.left=null;
        else if(right1==false)
            root.right=null;
        call(root.left);
        call(root.right);
        
        
    }
    public boolean check(TreeNode root)
    { if(root==null)
        return false;
       flag=0;
        dfs(root);
        if(flag==1)
            return true;
     
         return false;
        
        
        
        
        
        
        
    }
    public void dfs(TreeNode root)
    {
        if(root==null)
            return ;
        if(root.val==1)
        {
            flag=1;
            return;
        }
        dfs(root.left);
        dfs(root.right);
       
            
        
        
        
        
        
        
        
        
    }
    
}
//.............................................................................................................................................................................................
class Solution {
     
    public TreeNode pruneTree(TreeNode root) {
        if(root==null)
            return null;
           
        return dfs(root)?root:null;
    }
    public boolean dfs(TreeNode root)
    {
        if(root==null)
            return false;
        boolean left=dfs(root.left);
        boolean right=dfs(root.right);
        if(!left)
            root.left=null;
        if(!right)
            root.right=null;
        return left || right || root.val==1;
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}

