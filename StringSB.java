class Solution {
    public String makeGood(String s) {
        StringBuilder sb=new StringBuilder(); 
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            int last=sb.length()-1;
            if(last>=0 && (Math.abs((int)(sb.charAt(last))-(int)c)==32))
                sb.deleteCharAt(last);
            else
                sb.append(c);
        }
        
        
        String str=sb.toString();
        return str;
        
    }
}