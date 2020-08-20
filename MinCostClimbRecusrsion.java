class Solution {
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(helper(0,cost),helper(1,cost));
    }
    static int helper(int i,int cost[])
    {
        if(i>=cost.length)
            return 0;
        return Math.min(helper(i+1,cost)+cost[i],helper(i+2,cost)+cost[i]);
        
        
        
        
        
        
    }
}