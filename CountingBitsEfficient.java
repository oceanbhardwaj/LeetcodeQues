class Solution {
    public int[] countBits(int num) {
        int arr[]=new int[num+1];
        arr[0]=0;
        for(int i=1;i<=num;i++)
        {
            if(i%2!=0)
            {
                arr[i]=1+arr[i/2];
            }
            else
                
            {
                arr[i]=arr[i/2];
            }
                
        }
        return arr;
    }
}