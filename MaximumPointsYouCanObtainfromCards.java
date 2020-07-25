class Solution {
    public int maxScore(int[] cardPoints, int k) {
       // int i=0;
     int n= cardPoints.length;
        int max=0;
        int sum=0;
        int d=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+ cardPoints[i];
        }
        for(int i=0;i<n-k;i++)
        {
         d=d+ cardPoints[i];
        }
        max=Math.max(sum-d,max);
        for(int i=n-k;i<n;i++)
        {
            d=d+ cardPoints[i];
          //  if((i-(n-k))>=0)
            d=d- cardPoints[i-(n-k)];
            max=Math.max(sum-d,max);
        }
        return max;
        
        
        
        
        
        
    }
}