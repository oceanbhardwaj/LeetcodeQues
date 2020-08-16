class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int left=0;
        int right=position[position.length-1];
        int ans=0;
        int n=position.length;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(isValid(position,mid,n,m))
            {
                ans=mid;
                left=mid+1;
                
            }else
            {
                right=mid-1;
            }
            
            
        }
        return ans;
        
    }
    static public  boolean isValid(int []position,int mid,int n,int m)
    {  int count=1;
        
      long f=position[0];
        for(int i=1;i<n;i++)
        {
            if(Math.abs(f-position[i])>=mid)
            {
                count++;
                f=position[i];
                if(count==m)
                    return true;
            }
        }
        
        return false;
        
        
        
        
        
    }
}