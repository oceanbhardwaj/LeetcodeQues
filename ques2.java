import java.util.*;
class Main
{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int sum=sc.nextInt();
  int day=1;
  while(sum-day>0)
  {
      sum=sum-day;
      day++;
  }
  System.out.println(day);
  
  }
}