class Solution {
    static long ans=0;
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
    int n=nums.length;
        long a=0;
        int mod= (int)1e9 + 7;
        int i=0;
        int j=nums.length-1;
        while(i<=j)
        {
            if((nums[i]+nums[j])<=target)
            {a=a+(pow(2,(j-i),mod))%mod;
             a=a% mod;
             i++;}
            else
                j--;}
        return (int)a;
    }
    static long pow(int x,int y,int mod)
    {
        if(y==0) return 1;
       // if(x==0) return 0;
        if(y==1) return x;
        
        if(y%2==0)
        {
            ans=pow(x,y/2,mod);
            ans=(ans*ans)%mod;
           // ans=ans%mod;
        }
        else
        {
           ans=pow(x,(y-1)/2,mod);
            ans=(((ans*ans)%mod)*x)%mod;
           // ans=ans%mod;
            
            
        }
        return ans%mod;
    }
                
            
            
            
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
}