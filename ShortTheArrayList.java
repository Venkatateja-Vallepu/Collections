package com.cashapona.collections.jun9;

import java.util.ArrayList;
import java.util.Collections;

public class ShortTheArrayList {
public static void main(String[]args)
{
ArrayList<String> list1=new ArrayList<String>();
list1.add("venkat");
list1.add("sai");
list1.add("krethi");
list1.add("anu");
list1.add("sri");
Collections.sort(list1);
for(String name:list1)
System.out.println(name);

System.out.println("shorting the numbers ");
ArrayList<Integer>list2=new ArrayList<Integer>();
list2.add(1);
list2.add(2);
list2.add(100);
list2.add(34);
Collections.sort(list2);
for(Integer number:list2)
System.out.println(number);
}
}