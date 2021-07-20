class Solution{
    static String longestPalin(String S){
    //check for even and odd length;
    int start=0;
    int max=1;
    int n=S.length();
    for(int i=1;i<S.length();i++)
    {
        //even length;
        int low=i-1;
        int high=i;
       
        while(low>=0 && high<n && S.charAt(low)==S.charAt(high))
        {
            //start=low;
            if(max<high-low+1)
            {  
                start=low;
                max=high-low+1;
            }
            low--;
            high++;
        }
        
        //odd
         low=i-1;
         high=i+1;
        while(low>=0 && high<n && S.charAt(low)==S.charAt(high))
        {
            
            if(max<high-low+1)
            {
                start=low;
                max=high-low+1;
            }
            low--;
            high++;
        }
    }
    return S.substring(start,start+max);
        
    }
}