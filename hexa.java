class Solution {
    public String toHex(int num) {
        String hexvalue="";
        if(num<0)
        {  
        }
        while(num!=0)
        {
            int g=num%16;
            if(g<=9)
            {
                hexvalue=(char)(g+'0')+hexvalue;
            }
            else
            {
                hexvalue=(char)(g-10+'a')+hexvalue;
            }
            num=num/16;
        }
     return hexvalue;
    }
}