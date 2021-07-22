/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		String str="abc";
		 sub(str,"",0);
	}
	public static void sub(String s,String ans,int i)
	{
	    if(i>=s.length())
	    {
	        System.out.println("sub :="+ans);
	        return;
	    }
	    String newString=ans+s.charAt(i);
	    sub(s,newString,i+1);
	    sub(s,ans,i+1);
	}
	
}
/////////////////////////////////////////
/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	   String s="abc";
	   int n=s.length();
	   int d=1<<n;
	   for(int i=0;i<d;i++)
	   {  String ans="";
	       for(int j=0;j<n;j++)
	       {
	           if(((i>>j) & 1)!=0) //set
	           {
	              ans=ans+s.charAt(j);
	           }
	       }
	       System.out.println(ans);
	   }
	
	
	}
}