/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(dfs(s,s.length()-1));
	}
	public static String dfs(String s,int n)
	{
	    if(s.length()==0)
	    return "";
	    
	    return s.charAt(n)+dfs(s.substring(0,n),n-1);
	}
}