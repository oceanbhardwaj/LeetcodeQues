class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n=bills.length;
       int count5=0;
        int count10=0;
        int g=0;
        if(bills[0]!=5)
            return false;
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
               count5++;
            else if(bills[i]==10 && count5>=1)
            {
               count10++;
                count5--;
            }
            else if(bills[i]==20)
            { if(count10>=1 && count5>=1)
            {
                count10--;
                count5--;
            }
             else if(count5>=3)
             {
                 count5=count5-3;
             }
             else
                 return false;
               
            }
            else
                return false;
        }
        return true;
    }
}