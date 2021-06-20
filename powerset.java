
class LexSort
{
    //Function to return the lexicographically sorted power-set of the string.
   //static ArrayList<String> res=new ArrayList<>();
    static ArrayList<String> powerSet(String s)
    {
        //res=new ArrayList<>();
        ArrayList<String> res=new ArrayList<>();
        dfs(s,"",0,res);
        
        return res;
        
        
    }
    public static void dfs(String s,String ans,int i,ArrayList<String> res)
    {
        if(i>=s.length())
        {
            
            res.add(ans);
            return;
        }
        String newString=ans+s.charAt(i)+"";
        dfs(s,newString,i+1,res);
         dfs(s,ans,i+1,res);
        
       
        
        
    }
}


 /////////////////////////////////////////
class LexSort
{
    //Function to return the lexicographically sorted power-set of the string.
    static ArrayList<String> powerSet(String s)
    {
        ArrayList<String> res=new ArrayList<>();
        int len=s.length();
        int mask=1<<len;
        for(int i=0;i<mask;i++)
        {
            String ans="";
            for(int j=0;j<s.length();j++)
            {
                if(((i>>j)&1)!=0) //set
                ans=ans+s.charAt(j);
            }
            res.add(ans);
            
        }
        return res;
        
    }
}
