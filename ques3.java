import java.util.*;
class Main
{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int arr[]=new int[n];
  int count=0;
  for(int i=0;i<n;i++)
  {
      arr[i]=sc.nextInt();
  }
  for(int i=0;i<n;i++)
  {
      for(int j=i+1;j<n;j++)
      {
          if(arr[i]!=arr[j])
          count++;
      }
  }
  System.out.println(count);
  
  
  }
}
/////////////////////////////////////////
import java.util.*;
class Main
{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  long arr[]=new long[n];
  long count=0;
  HashMap<Long,Long> h=new HashMap<>();
  for(int i=0;i<n;i++)
  {
      arr[i]=sc.nextInt();
      h.put(arr[i],h.getOrDefault(arr[i],(long)0)+(long)1);
  }
  for(int i=0;i<n;i++)
  {
      count=count+(n-1-i);
      long d=0;
      if(h.containsKey(arr[i]))
      {d=h.get(arr[i]);
      count=count-(d-1);
      d=d-1;
      if(d>0)
      h.put(arr[i],d);
      else
      h.remove(arr[i]);
      }
      
      
      
  }
 
  System.out.println(count);
  
  
  }
}