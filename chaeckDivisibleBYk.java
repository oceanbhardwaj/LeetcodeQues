class Solution {
    public boolean canArrange(int[] arr, int k) {
        //Arrays.sort(arr);
        int count[]=new int[arr.length];
        int counts=0;
       for(int i=0;i<arr.length;i++)
       {  
           for(int j=i+1;j<arr.length;j++)
           {
               if((arr[i]+arr[j])%k==0 && count[j]==0 && count[i]==0)
               {  counts++;
                //count[i]=1;
                count[j]=1;
               break;}
           }
       }
        return counts==arr.length/2;
    }
}