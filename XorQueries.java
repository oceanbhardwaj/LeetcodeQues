class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int arr1[]=new int[queries.length];
        int sum=0;
        int d=0;
       for(int[]a:queries)
       {
          int  start=a[0];
          int end=a[1];
           if(start==end)
           {

           arr1[d++]=arr[start];
           
           }
           else
           { sum=arr[start];
               for(int i=start+1;i<=end;i++)
               {
                   sum=sum^arr[i];
               }
            arr1[d++]=sum;
           }
       }
       return arr1; 
    }
}