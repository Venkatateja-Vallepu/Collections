package com.cashapona.collections.jun9;

import java.util.TreeSet;

public class FindLoestValueSAndHighestuInTreeSet {
	 public static void main(String args[]){    
		 TreeSet<String> set=new TreeSet<String>();    
		         set.add("teja");    
		         set.add("sathish");    
		         set.add("nani");    
		         set.add("Anusha");    
		         System.out.println("Lowest Value: "+set.pollFirst());    
		         System.out.println("Highest Value: "+set.pollLast());    
		 }    
		}

