class Solution {
    public int getWinner(int[] arr, int k) {
        int max=0;
        if(k>arr.length)
        { for(int i=0;i<arr.length;i++)
        {
            max=Math.max(arr[i],max);        }
         return max;}
        
        int curr=arr[0];
        int win=0;
         for(int i=1;i<arr.length;i++)
         { if(arr[i]>curr)
         {
             curr=arr[i];
             win=0;
         }
          win++;
          if(win==k)
              break;
             
         }
        return curr;
    }
}