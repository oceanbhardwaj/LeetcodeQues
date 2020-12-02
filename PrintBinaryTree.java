class Solution {
    public List<List<String>> printTree(TreeNode root) {
        List<List<String>> res=new ArrayList<>();
        int row=getHeight(root);
        int column=(int)Math.pow(2,row)-1;
        ArrayList<String> a=new ArrayList<>();
        for(int i=0;i<column;i++)
            a.add("");
        for(int i=0;i<row;i++)
        {
            res.add(new ArrayList<>(a));
        }
       call(res,root,0,row,0,column-1);
       return res;
            
        
    }
    public void call(List<List<String>> res,TreeNode root,int row,int totalrows,int i,int j)
    { if(row==totalrows || root==null)
        return ;
     res.get(row).set((i+j)/2,String.valueOf(root.val));
     call(res,root.left,row+1,totalrows,i,(i+j)/2-1);
     call(res,root.right,row+1,totalrows,(i+j)/2+1,j);
     
     
        
        
        
        
        
        
        
    }
    public int getHeight(TreeNode root)
    {
        if(root==null)
            return 0;
        return 1+Math.max(getHeight(root.left),getHeight(root.right));
    }
    
}