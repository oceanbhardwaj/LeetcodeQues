/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	 	ArrayList<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(30);
		a.add(4);
		a.add(20);
		//method 1-----------------------------------------------------
	/*	Comparator co=new Comparator<Integer>(){
		    public int compare(Integer a1,Integer a2){
		        return a2-a1;
		    }
		    };
		    Collections.sort(a,co);
		    System.out.println(a);
		    */
		    
		    //method 2------------------------------------------------
		 /*   Collections.sort(a,new Comparator<Integer>(){
		        public int compare(Integer a1,Integer a2){
		        return a2-a1;
		    }
		     
		    });
		    System.out.println(a);*/
		    
		    //method 3-------------------------------------------------
		   Comparator<Integer> c=(o1,o2)->(o1<o2)?1:(o1>o2)?-1:0;
		   Collections.sort(a,c);
		   System.out.println(a);
	  }
	  
	  
		
	
}