class Solution {
    public String restoreString(String s, int[] indices) {
        char ch[]=s.toCharArray();
        char c[]=new char[s.length()];
        for(int i=0;i<indices.length;i++)
        {
           int d=search(indices,i);
            c[i]=ch[d];
        }
        String str=new String(c);
        return str;
        
    }
    int search(int indices[],int ele)
    { int res=0;
        for(int i=0;i<indices.length;i++)
        {
            if(indices[i]==ele)
            {  res=i;
            break;}
        }
     return res;
    }
}