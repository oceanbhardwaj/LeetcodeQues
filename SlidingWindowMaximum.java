class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q=new LinkedList<Integer>();
        int n=nums.length;
        if(n==0)
            return nums;
        int arr[]=new int[n-k+1];
        int i=0;
        for(;i<k;i++)
        {  while(!q.isEmpty() && nums[q.peekLast()]<=nums[i])
        {
   q.removeLast();}
        
        q.addLast(i);}
        
        
        for(;i<n;i++)
        {
   arr[i-k]=nums[q.peekFirst()];
            while(!q.isEmpty() && q.peekFirst()<=i-k)
                q.removeFirst();
            
             while(!q.isEmpty() && nums[q.peekLast()]<=nums[i])
        {
   q.removeLast();}
        
        q.addLast(i);}
        arr[i-k]=nums[q.peekFirst()];
    return arr;
        
        
        
        
        
        
        
        
        
        
        
        
    }
}