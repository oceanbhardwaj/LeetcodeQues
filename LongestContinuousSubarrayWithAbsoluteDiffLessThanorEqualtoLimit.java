class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int n=nums.length;
        Deque<Integer> inc=new LinkedList<Integer>();
        Deque<Integer> max=new LinkedList<Integer>();
        int res=1;
        int l=0;
        for(int r=0;r<n;r++)
        {
            while(!inc.isEmpty() && inc.peekLast()>nums[r])
                inc.removeLast();
            
            inc.addLast(nums[r]);
            
            while(!max.isEmpty() && max.peekLast()<nums[r])
                max.removeLast();
            
            max.addLast(nums[r]);
            
            while((max.peekFirst()-inc.peekFirst())>limit)
            {
                
                
                if(max.peekFirst()==nums[l])
                    max.pollFirst();
                if(inc.peekFirst()==nums[l])
                    inc.pollFirst();
                
             ++l;
                
                
                
            }
            res=Math.max(res,r-l+1);
             
            
        }  
            return res;
            
            
            
        
        
        
        
        