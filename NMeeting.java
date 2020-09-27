import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<List<Integer>,Integer> h=new HashMap<>();
		
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
		    int n=sc.nextInt();
		    int arr1[]=new int[n];
		    int arr2[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr1[i]=sc.nextInt();
		       // h.put(arr1[i],i+1);
		    }
		    for(int i=0;i<n;i++)
		    {
		        arr2[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++)
		    {   List<Integer> a=new ArrayList<>();
		    a.add(arr1[i]);
		    a.add(arr2[i]);
		        h.put(a,i+1);
		    }
		    int a[][]=new int[n][2];
		    for(int i=0;i<n;i++)
		    {
		        a[i][0]=arr1[i];
		        
		    }
		     for(int i=0;i<n;i++)
		    {
		        a[i][1]=arr2[i];
		    }
		    Comparator co=new Comparator<int[]>(){
		        public int compare(int a[],int b[])
		        {
		            if(a[1]==b[1])
		            return a[0]-b[0];
		            return a[1]-b[1];
		        }
		    };
		    Arrays.sort(a,co);
		    int max=a[0][1];
		    ArrayList<Integer> a1=new ArrayList<>();
		    a1.add(a[0][0]);
		    a1.add(a[0][1]);
		    System.out.print(h.get(a1)+" ");
		    a1.clear();
		    for(int i=1;i<n;i++)
		    {
		        if(a[i][0]>max)
		        { 
		        a1.add(a[i][0]);
		        a1.add(a[i][1]);
		            System.out.print(h.get(a1)+ " ");
		        max=a[i][1];
		            a1.clear();
		        }
		        
		    }
		    System.out.println();
		    
		    
		    
		    
		    
		    
		    
		}
	}
}