class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            long sum=arr[i];
            if(sum==0)
            count++;
            for(int j=i+1;j<n;j++)
            {
                sum=sum+arr[j];
                if(sum==0)
                count++;
            }
        }
        return count;
    }
}
///////////////////////////////////////////////////
class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    { long count=0;
        HashMap<Long,Long> h=new HashMap<>();
        h.put((long)0,(long)1);
        long sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
            if(h.containsKey(sum))
            {
                count=count+h.get(sum);
            }
            h.put(sum,h.getOrDefault(sum,(long)0)+(long)1);
        }
        return count;
    }
}