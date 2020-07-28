class Solution {
    public boolean isPowerOfFour(int num) {
        if(num==1)
            return true;
        int g=0;
      while(num!=0 && g==0)
      {
         g=num%4;
          num=num/4;
          if(g==0 && num==1)
              return true;
      }
        return false;
        
    }
}