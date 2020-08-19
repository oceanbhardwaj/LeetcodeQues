class Solution {
    public int numOfSubarrays(int[] arr) {
        int temp[]={1,0};
        int mod=(int)10^9 + 7;
          int val=0;
        for(int i=0;i<arr.length;i++)
        {
            val=(((val+arr[i]))%2+2)%2;
            temp[val]++;
        }
        return temp[0]*temp[1];
        
    }
}