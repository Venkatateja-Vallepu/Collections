package com.cashapona.collections.jun9;

import java.util.HashSet;

public class HashSetAddindElements {
public static void main(String args[]){  
		  //Creating HashSet and adding elements  
		   
		HashSet<String> set=new HashSet<String>();
		set.add("java");
		set.add("spring");
		set.add("springboot");
		set.add(null);//allo the  null valuse 
		set.add(null);
		set.add("jsp");
		set.add("hybernat");
		set.add(null);
		set.add("spring");//does n ot allao duplicates
		System.out.println(set);
}
}
		

				


