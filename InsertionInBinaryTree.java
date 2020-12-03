//insertion in binary tree

       q=new LinkedList<>();
        q.add(root);
       
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
      
    }
    
   