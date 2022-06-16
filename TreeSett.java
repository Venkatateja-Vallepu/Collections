package com.cashapona.collections.jun9;

import java.util.TreeSet;

public class TreeSett {
public static void main(String[]args) {
TreeSet<String> set=new TreeSet<String>();
set.add("ravi");
set.add("ram");
set.add("vnu");
set.add("srinu");
System.out.println(set);
set.remove("ravi");
System.out.println(set);
set.removeAll(set);
System.out.println(set);

}}

