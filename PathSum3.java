class Solution {
    int count=0;
    public int pathSum(TreeNode root, int sum) {
       if(root==null)
           return 0;
        
         call(root,sum,0);
        pathSum(root.left,sum);
        pathSum(root.right,sum);
        return count;
    }
    public void call(TreeNode root,int sum,int curr)
    { if(root==null)
        return ;
       curr=curr+root.val;
     if(curr==sum)
         count++;
     call(root.left,sum,curr);
     call(root.right,sum,curr);
    
    }
}*/
//.................................................................................
class Solution {
   
    HashMap<Integer,Integer> h=new HashMap<>();
   
    int count=0;
    public int pathSum(TreeNode root, int sum) {
         h.put(0,1);
        if(root==null)
            return 0;
        
        call(root,sum,0);
        return count;
    }
    public void call(TreeNode root,int sum,int ans)
    {
        if(root==null)
            return ;
        
        ans=ans+root.val;
        if(h.containsKey(ans-sum))
            count=count+h.get(ans-sum);
        h.put(ans,h.getOrDefault(ans,0)+1);
        
        call(root.left,sum,ans);
        call(root.right,sum,ans);
        h.put(ans,h.get(ans)-1);
        
        
        
        
        
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
}