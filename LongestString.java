class Solution {
    public String longestDiverseString(int a, int b, int c) {
        int n=a+b+c;
        int a1=0;
        int b1=0;
        int c1=0;
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<n;i++)
        {
            if((a>=b && a>=c && a1<2)||(b1==2 && a>0 )||(c1==2 && a>0))
            {   sb.append("a");
                a--;
                a1++;
                b1=0;
                c1=0;
            }
            else if((b>=a && b>=c && b1<2)||(a1==2 && b>0 )||(c1==2 && b>0))
            {   sb.append("b");
                b--;
                b1++;
                a1=0;
                c1=0;
            }
            else if((c>=a && c>=b && c1<2)||(a1==2 && c>0 )||(b1==2 && c>0))
            {   sb.append("c");
                c--;
                c1++;
                a1=0;
                b1=0;
            }
            
        }
        String s=sb.toString();
        return s;
    }
}