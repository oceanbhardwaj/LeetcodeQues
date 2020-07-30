class Solution {
    public boolean hasAlternatingBits(int n) {
       StringBuffer sb=new StringBuffer();
        while(n>0)
        {
            int g=n%2;
            sb.append(String.valueOf(g));
            n=n/2;
        }
        sb.reverse();
        String str=sb.toString();
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
                return false;
        }
        return true;
        
    }
}