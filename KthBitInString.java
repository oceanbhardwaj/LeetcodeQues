class Solution {
    public char findKthBit(int n, int k) {
        String arr[]=new String[n+1];
        arr[1]="0";
        for(int i=2;i<=n;i++)
        {
            arr[i]=arr[i-1]+"1"+reverse(invert(arr[i-1]));
        }
        
        String d=arr[n];
        char c=d.charAt(k-1);
        
       return c; 
        
    }
    static String reverse(String str)
    {
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String s1=sb.toString();
        return s1;
    }
    static String invert(String str)
    {
       StringBuilder sb1=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='1')
                sb1.append("0");
            else
                sb1.append("1");
        }
        String f=sb1.toString();
        return f;
        
        
}
}