class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int arr1[]=new int[queries.length];
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            prefix[i]=prefix[i-1]^arr[i];
        }
        int d=0;
        for(int a[]:queries)
        {
            int l=a[0];
            int r=a[1];
            if(l==0)
                arr1[d++]=prefix[r];
            else
                arr1[d++]=prefix[r]^prefix[l-1];
        }
        return arr1;
    }
}