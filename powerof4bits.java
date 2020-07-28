class Solution {
    public boolean isPowerOfFour(int num) {
       if(num!=0 && (num & (num-1))==0 && (num & 0xAAAAAAAA)==0)
           return true;
        else 
            return false;
        
        
        
    }
}