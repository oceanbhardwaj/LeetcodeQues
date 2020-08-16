class Solution {
    public int minOperations(int n) {
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=2*i+1;
        }
        for(int i=0;i<n;i++)
            sum=sum+arr[i];
        int d=sum/n;
        int count=0;
      
       for(int i=0;i<n;i++)
       {
           if(arr[i]>d)
               count+=arr[i]-d;
           else
               count+=d-arr[i];
       }
        return count/2;
       
}}