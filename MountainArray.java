class Solution {
    public int longestMountain(int[] A) {
        int left=0;
        int right=0;
        int max=0;
        int n=A.length;
        if(n<3)
            return 0;
        while(left<n-2 )// skip decending
        {while(left<n-1 && A[left]>=A[left+1])
            left++;
        right=left+1;
        while(right<n-1 && A[right]<A[right+1])//up
            right++;
        while(right<n-1 && A[right]>A[right+1])//down
        { right++;
        max=Math.max(max,right-left+1);
        }
        left=right;}
        return max;
        
        
        