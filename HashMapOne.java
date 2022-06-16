package com.cashapona.collections.jun14;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
/**
* @author venkat
* created HashMapRunner class and applied HashMap methods
*/
public class HashMapOne {
	/**
	 * @param args
	 */
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		/*
		 * created empty HashMap reference <Integer, String> type
		 * allows only one null key
		 * does not allows duplicate keys, allow duplicate values
		 * doesnot maintain insertion order
		 */
		HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
		/**
		 * put(K,V), insert an entry in the HashMap using put()
		 */
		hashMap.put(null, null);
		hashMap.put(null, null);
		hashMap.put(1, "venkat");
		hashMap.put(3, "Teja");
		hashMap.put(2, "prasad");
		hashMap.put(4, "Venu");
		hashMap.put(5, "Srinu");
		hashMap.put(9, "nani");
		hashMap.put(3, "anusha");
		System.out.println("HashMap : "+hashMap);
		/**
		 * remove specified key element using remove(Object key)
		 */
		System.out.println("Remove(null) element : "+hashMap.remove(null));
		System.out.println("After remove(null) HashSet : "+hashMap);
		/*
		 * traversing HashMap elements using iterator
		 */
		Iterator<Entry<Integer, String>> iterator=hashMap.entrySet().iterator();	
		System.out.println("Traverse elemenets using iterator : ");
		while(iterator.hasNext()) {
			Map.Entry<Integer,String>element=(Entry<Integer, String>)iterator.next();
			System.out.println(element.getKey()+" , "+element.getValue());
		}
		/*
		 * traversing HashMap elements using enhanced for
		 */
		System.out.println("traverse elements using enhanced for : ");
		for(Map.Entry<Integer,String> map:hashMap.entrySet()) {
			System.out.println(map.getKey()+" , "+map.getValue());
		}
		/**
		 * traversing HashMap elements using for-Each
		 */
		System.out.println("traverse elements using forEach : ");
		hashMap.forEach((k,v)->{
			System.out.println("Key :"+k+"  "+"Value : "+v);
		});
		/*
		 * containsKey(Object key), returns true if some key equal to the key exists within the map, else return false. 
		 */
		System.out.println("HashMap : "+hashMap);
		System.out.println("containsKey(1) : "+hashMap.containsKey(1));
		System.out.println("containsKey(10) : "+hashMap.containsKey(10));
		/*
		 * containsValue(Object value), returns true if some value equal to the value exists within the map, else return false.
		 */
		System.out.println("HashMap : "+hashMap);
		System.out.println("containsValue(null) : "+hashMap.containsValue(null));
		System.out.println("containsValue(10) : "+hashMap.containsValue(6));
		/**
		 * count number of elements in HashMap using size()
		 */
		System.out.println( "Size of HashMap : "+hashMap.size());
		/*
		 * entrySet(), return a collection view of the mappings contained in this map
		 */
		System.out.println("View of mappings contained in a map "+hashMap.entrySet() );
		/*
		 * keySet(), return a set view of the keys contained in this map
		 */
		System.out.println("View of key mappings contained in a map "+hashMap.keySet() );
		/*
		 * values(), return a set view of the keys contained in this map
		 */
		System.out.println("View of values mappings contained in a map "+hashMap.values() );
		/*
		 * isEmpty(), returns true if the map is empty; returns false if it contains at least one key.
		 */
		System.out.println("HashMap empty : "+hashMap.isEmpty() );
		/*
		 * get(Object key), returns the object that contains the value associated with the key
		 */
		System.out.println("HashMap : "+hashMap);
		System.out.println("get(3) : "+hashMap.get(3));
		/*
		 * replace(K key, V value), replaces the specified value for a specified key
		 */
		System.out.println("HashMap : "+hashMap);
		System.out.println("replace(2,venkat) with (2,teja) : "+hashMap.replace(2,"teja"));
		System.out.println("Updated HashMap : "+hashMap);
		/*
		 * size(), returns the number of entries in the map
		 */
		System.out.println("size() of HashMap : "+hashMap.size());
		/*
		 * replaceAll(), replace all values to lowercase
		 */
		hashMap.replaceAll((key,value) -> value.toLowerCase());
		System.out.println("Updated HashMap using toLowerCase() : "+hashMap);
	}
}