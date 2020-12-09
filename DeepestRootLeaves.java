//....................................................................................................................................BFS.....................................................................................................
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        if(root==null)
            return 0;
        int sum=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        { sum=0;
            
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=q.poll();
                sum=sum+curr.val;
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }
        return sum;
    }
}*/
//......................................................................................................DFS.................................................................................................................................
class Solution {
    int sum=0;
    public int deepestLeavesSum(TreeNode root) {
        if(root==null)
            return 0;
        
    int d=depth(root);
        dfs(root,1,d);
        return sum;
        
        
        
        
        
        
        
        
    }
    public int depth(TreeNode root)
    {
        if(root==null)
            return 0;
        return 1+Math.max(depth(root.left),depth(root.right));
    }
    
    public void dfs(TreeNode root,int depth,int d)
    { if(root==null)
        return;
     if(depth==d)
         sum=sum+root.val;
     dfs(root.left,depth+1,d);
     dfs(root.right,depth+1,d);
        
    }
    
    
    
    
    
    
    
}