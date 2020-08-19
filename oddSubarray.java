class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod=(int)1e9 + 7;
        int temp[]={1,0};
        int res=0;
        int curr=0;
        for(int i:arr){
         curr^=i&1;
            res=(res+temp[1-curr])%mod;
            temp[curr]++;
        
    }
    return res;}
}