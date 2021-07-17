class GfG
{
    int maxLen(int arr[], int n)
    {
        int max=0;
        for(int i=0;i<n;i++)
        {
            int sum=arr[i];
            if(sum==0)
            max=Math.max(max,sum);
            for(int j=i+1;j<n;j++)
            {
                sum=sum+arr[j];
                if(sum==0)
                max=Math.max(max,j-i+1);
            }
        }
        return max;
    }
}
/////////////////////////////////////////
class GfG
{
    int maxLen(int arr[], int n)
    {
       HashMap<Integer,Integer> h=new HashMap<>();
       int max=0;
       int sum=0;
       for(int i=0;i<n;i++)
       {
           sum=sum+arr[i];
           if(sum==0)
           max=Math.max(i+1,max);
           else if(h.containsKey(sum))
           {
               max=Math.max(max,i-h.get(sum));
           }
           else
           h.put(sum,i);
       }
       return max;
    }
}