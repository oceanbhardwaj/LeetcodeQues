class Solution {
    int i=0;
    ArrayList<Integer> a=new ArrayList<>();
    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
       return dfs(root,voyage)?a:Arrays.asList(-1);
      
        
        
    }
    public boolean dfs(TreeNode root,int []voyage)
    {
        if(root==null)
            return true;
        if(root.val!=voyage[i++])
            return false;
        if(root.left!=null && root.left.val!=voyage[i])
        {
            a.add(root.val);
            return dfs(root.right,voyage) && dfs(root.left,voyage);
        }
        
        return dfs(root.left,voyage) && dfs(root.right,voyage);
        
        
    }
}