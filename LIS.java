class Solution {
    public int lengthOfLIS(int[] nums) {
        int lis[]=new int[nums.length];
        Arrays.fill(lis,1);
        if(nums.length==0)
            return 0;
        int max=1;
        for(int i=1;i<nums.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j] && lis[i]<=lis[j])
                    lis[i]=lis[j]+1;
                    max=Math.max(lis[i],max);
            }
        }
        return max;
    }
}
//this lis approach fails for arr containing same element i.e 2,2,2
// class Solution {
//     public int lengthOfLIS(int[] nums) {
//         int arr[]=new int[nums.length];
//         for(int i=0;i<nums.length;i++)
//         {
//             arr[i]=nums[i];
//         }
//         Arrays.sort(arr);
//         int n=nums.length;
//         //lcs 
//         int dp[][]=new int[n+1][n+1];
//         for(int i=1;i<=n;i++)
//         {
//             for(int j=1;j<=n;j++)
//             {
//                 if(arr[i-1]==nums[j-1])
//                     dp[i][j]=1+dp[i-1][j-1];
//                 else
//                     dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
//             }
//         }
//         return dp[n][n];
//     }
// }
        
        
        
        
        
        
        
        
        
    