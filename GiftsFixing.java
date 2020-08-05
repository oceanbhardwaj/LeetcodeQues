/*package whatever //do not write package name here */

import java.util.*;

public class GiftsFixing {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i1=0;i1<t;i1++)
		{
		    int n=sc.nextInt();
		    long arr1[]=new long[n];
		     long arr2[]=new long[n];
		      long min1=Long.MAX_VALUE;
		    long min2=Long.MAX_VALUE;
		    for(int j=0;j<n;j++)
		    {
		        arr1[j]=sc.nextInt();
		        min1=Math.min(arr1[j],min1);
		    }
		     for(int j=0;j<n;j++)
		    {
		        arr2[j]=sc.nextInt();
		        min2=Math.min(arr2[j],min2);
		    }
		    for(int i=0;i<n;i++)
		    {
		        arr1[i]=arr1[i]-min1;
		    }
		    for(int i=0;i<n;i++)
		    {
		        arr2[i]=arr2[i]-min2;
		    }
		    long sum=0;
		    for(int i=0;i<n;i++)
		    {
		        sum=sum+Math.max(arr1[i],arr2[i]);
		    }
		    System.out.println(sum);
		    
		    
		    
		    
		    
		    
		    
		    
		    
		   
		}
	}
}