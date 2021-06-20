import java.util.*;
class Main
{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int x=sc.nextInt();
  int d=(int)(x*1.08);
  
  if(d<206)
  System.out.println("Yay!");
  else if(d==206)
System.out.println("so-so");
else
  System.out.println(":(");
  
  }
}