class CBTInserter {
    TreeNode root=null;
    Queue<TreeNode> q;
    public CBTInserter(TreeNode root) {
        this.root=root;
    }
    
    public int insert(int v) {
       q=new LinkedList<>();
        q.add(root);
        TreeNode curr=null;
        while(!q.isEmpty())
        {
             curr=q.poll();
            if(curr.left==null)
            { 
                curr.left=new TreeNode(v);
                break;
            }
            else
                q.add(curr.left);
            
            if(curr.right==null)
            {
                curr.right=new TreeNode(v);
                break;
            }
            else
                q.add(curr.right);
        }
        return curr.val;
    }
    
    public TreeNode get_root() {
        return root;
        
    }
   
}

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(v);
 * TreeNode param_2 = obj.get_root();
 */