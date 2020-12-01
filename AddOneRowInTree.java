class Solution {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(d==1)
        {
            TreeNode r=new TreeNode(v);
            r.left=root;
            r.right=null;
            return r;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int depth=0;
        TreeNode Left=null;
        TreeNode Right=null;
        TreeNode curr=null;
        for(int j=0;j<d-2;j++){
        
         
         int size=q.size();
         for(int i=0;i<size;i++)
         { curr=q.poll();
            
            
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);}}
        while(!q.isEmpty()){
          curr=q.poll();
                Left=curr.left;
            curr.left=new TreeNode(v);
            curr.left.left=Left;
            Right=curr.right;
            curr.right=new TreeNode(v);
            curr.right.right=Right;
                
            
            
        }
       
        return root;
        
    }
}*/

//.............................................................................
class Solution {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(d==1)
        {
            TreeNode r=new TreeNode(v);
            r.left=root;
            r.right=null;
            return r;
        }
        dfs(root,1,v,d);
        return root;
    }
    public void dfs(TreeNode root,int depth,int v,int d)
    { if(root==null)
        return ;
        if(depth<d-1)
        { 
            dfs(root.left,depth+1,v,d);
        
            dfs(root.right,depth+1,v,d);
            
        }
        else
        {
            TreeNode Left=root.left;
            TreeNode Right=root.right;
            root.left=new TreeNode(v);
            root.right=new TreeNode(v);
            root.left.left=Left;
            root.right.right=Right;
            
        }
        
    }
        
        
        
        
        
        
        
        
        
        
    
}