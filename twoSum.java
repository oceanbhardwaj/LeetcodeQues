class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int arr[]=new int [2];
        for(int i=0;i<nums.length;i++)
        {
            int c=target-nums[i];
            if(h.containsKey(c))
            { arr[0]=i;
             arr[1]=h.get(c);
             break;
                
            }
            else
                h.put(nums[i],i);
        }
        return arr;
        
    }
}