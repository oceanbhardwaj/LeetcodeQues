/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;
class GFG {
	public static void main (String[] args) {
	ArrayList<String> a=new ArrayList<>();
	a.add("ocean");
	a.add("riya");
	a.add("oceam");
	Comparator co=new Comparator<String>(){
	    public int compare(String s1,String s2){
	       return s2.compareTo(s1);
	    }
	};
	Collections.sort(a,co);
	System.out.println(a);
	}
}