class Solution {
    public int findComplement(int num) {
        int i=0;
        int res=0;
        while(num>0)
        {
            if((num &1)==0)
                res+=1<<i;
                i++;
            num=num>>1;
        }
        return res;
        
    }
}