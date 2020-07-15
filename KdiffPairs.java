class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        if(k<0)
            return 0;
        for(int i=0;i<nums.length;i++)
        {
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        int count=0;
        for(int n:h.keySet())
        {
            if(k==0)
            {
                if(h.get(n)>=2)
                    count++;
            }
            else
                if(h.containsKey(n+k))
                    count++;
           }
        return count;
        
    }
}