package com.cashapona.collections.jun9;

import java.util.ArrayList;

public class IteratingArrayListusingForEachLoop {
public static void main(String[]args)
{
ArrayList<String> list=new ArrayList<String>();//Creating arraylist
list.add("india");//Adding object in arraylist 
list.add("usa");
list.add("naida");
list.add("mangoliya");
list.add("fero");
for(String countries:list)//Traversing list through for-each loop 
System.out.println(countries);	
}
}


