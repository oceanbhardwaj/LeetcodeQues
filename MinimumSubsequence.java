class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        int n=nums.length;
        int sum=0;
        
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
            pq.add(nums[i]);
        }
        ArrayList<Integer> a=new ArrayList<>();
        int c=0;
        
        while(!pq.isEmpty())
        {
            a.add(pq.peek());
            c=c+pq.poll();
            
            if(sum-c<c)
            {
                break;
            }
            
        }
        return a;
    }
}