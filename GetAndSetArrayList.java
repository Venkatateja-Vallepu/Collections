package com.cashapona.collections.jun9;

import java.util.ArrayList;

public class GetAndSetArrayList {
public static void main(String[]args) {
//creating array list 	
ArrayList<String> list=new ArrayList<String>();
list.add("apple");//Adding object in arraylist
list.add("bananna");
list.add("mango");
list.add("grapes");
list.add("hamer");
list.add("papaya");
list.add("watermelon");
{
System.out.println(list.get(4));//index is 4 so it reten the 5th element[hamet]

list.set(4,"lemon");
System.out.println(list);//replace the 4 index place with lemon instud of hamer 
list.set(0, "teja");// chainging the elements 
System.out.println(list);

}	
}
}

