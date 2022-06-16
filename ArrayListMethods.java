package com.cashapona.collections.jun9;
	/*
	 * import java.util package for collection
	 */
	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.ListIterator;
	import java.util.Scanner;

	/** 
	 * create ArrayListRunner class used to implement ArrayList
	 *         methods
	 */
	public class ArrayListMethods {
		/*
		 * 1) It uses indexing to store the elements sequentially
		 * 
		 * 2) It allows duplicate elements
		 * 
		 * 3) It is not synchronized
		 * 
		 * 4) Elements from Arraylist can be accessed using index
		 * 
		 * 5) We can also use iterator and ListIterator to access the elements
		 * 
		 * 6) Elements in ArrayList can grow and shrink dynamically
		 */
		static ArrayList<Object> arrayList = new ArrayList<Object>();
		static Scanner scanner = new Scanner(System.in);

		/*
		 * add(), add elements to an ArrayList
		 */
		public static void addElements() {
			System.out.println("You want to add how many elements  in ArrayList : ");
			int numberOfElements = scanner.nextInt();
			for (int i = 1; i <= numberOfElements; i++) {
				System.out.println("Enter " + i + " element : ");
				Object object = scanner.next();
				arrayList.add(object);
			}
			System.out.println(arrayList);
			System.out.println("Size of the of the ArrayList:" + arrayList.size());
		}

		/*
		 * isEmpty(), check elements in ArrayList
		 */
		public static void isEmpty() {
			System.out.println("Arralist is empty : " + arrayList.isEmpty());
		}

		/*
		 * size(), count number of elements in ArrayList
		 */
		public static void sizOfArrayList() {
			if (arrayList.size() == 0) {
				System.out.println("No elements in ArrayList");
			} else {
				System.out.println("Size of ArrayList : " + arrayList.size());
			}
		}

		/*
		 * remove(int index) , remove elements in ArrayList
		 * 
		 * @param index
		 */
		public static void removeElement() {
			if (arrayList.size() == 0) {
				System.out.println("No elements in ArrayList");
			} else {
				System.out.println("Enter index element to remove : ");
				int index = scanner.nextInt();
				System.out.println("After remove ArrayList : " + arrayList.remove(index));
			}
		}

		/*
		 * get(int index), get element in AarrayList
		 */
		public static void getElements() {
			try {
				if (arrayList.size() == 0) {
					System.out.println("No elements in ArrayList");
				} else {
					System.out.println("Enter index element to get : ");
					int index = scanner.nextInt();
					System.out.println("Get " + index + " element in ArrayList  : " + arrayList.get(index));
				}
			} catch (Exception e) {
				System.out.println("Exception caught");
			}
		}

		/*
		 * set(int index, String element), update ArrayList using set method
		 */
		public static void updateElement() {
			try {
				System.out.println("Enter index element to set : ");
				int index = scanner.nextInt();
				System.out.println("Enter element to modify : ");
				String data = scanner.next();
				arrayList.set(index, data);
				iterate();
			} catch (Exception e) {
				System.out.println("Exception caught ");

			}
		}

		/*
		 * contains(), search elements using contains()
		 */
		public static void containsElement() {
			System.out.println("Enter String element to search in ArrayList : ");
			String data = scanner.next();
			if (arrayList.contains(data)) {
				System.out.println("Element " + data + " found in ArrayList");
			} else {
				System.out.println("Element " + data + " not found in ArrayList");
			}
		}

		/*
		 * iterate(), traversing elements using iterator
		 */
		public static void iterate() {
			System.out.println("ArrayList elements : ");
			Iterator<Object> it = arrayList.iterator();
			while (it.hasNext()) {
				System.out.print(it.next() + "  ");
				System.out.println();
			}
		}

		/*
		 * add(int index,Object o), add element in particlar position in ArrayList
		 */
		public static void addElementAtPosition() {
			System.out.println("Enter index to add in particular position : ");
			int index = scanner.nextInt();
			System.out.println("Enter element to add in ArrayList : ");
			Object data = scanner.next();
			arrayList.add(index, data);
			iterate();
		}

		/*
		 * clear(), remove all data in ArrayList
		 */
		public static void clear() {
			arrayList.clear();
			System.out.println("After clear, ArrayList : " + arrayList);
		}

		/*
		 * listIterator(), traversing ArrayList through listIterator
		 */
		public static void listIterator() {
			ListIterator<Object> ListIteratorObject = arrayList.listIterator();
			while (ListIteratorObject.hasNext()) {
				Object object = ListIteratorObject.next();
				System.out.print(object);
			}
		}

		/*
		 * listIterator(), element iterates in reverse order
		 */
		public static void listIteratorReverse() {
			ListIterator<Object> ListIterator = arrayList.listIterator(arrayList.size());
			while (ListIterator.hasPrevious()) {
				Object str = ListIterator.previous();
				System.out.print(str);
			}
		}

		/*
		 * traversing ArrayList using for loop
		 */
		public static void forLoop() {
			for (int i = 0; i < arrayList.size() - 1; i++) {
				System.out.print(arrayList.get(i));
			}
		}

		/*
		 * traversing ArrayList using forEach loop
		 */
		public static void forEach() {
			arrayList.forEach(a -> {
				System.out.println(a);
			});
		}

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			try (Scanner sc = new Scanner(System.in)) {
				int chioce = 0;
				while (chioce != 15) {
					System.out.println("Menu Options");
					System.out.println("1.add()");
					System.out.println("2.isEmpty()");
					System.out.println("3.size() ");
					System.out.println("4.remove()");
					System.out.println("5.get()");
					System.out.println("6.set()");
					System.out.println("7.contains()");
					System.out.println("8.iterate()");
					System.out.println("9.addElementAtPosition() ");
					System.out.println("10.clear()");
					System.out.println("11.listIterator()");
					System.out.println("12.listIteratorReverse()");
					System.out.println("13.forLoop()");
					System.out.println("14.forEach()");
					System.out.println("15.exit");
					System.out.println("Enter your chioce : ");
					chioce = sc.nextInt();
					switch (chioce) {
					case 1:
						addElements();
						break;
					case 2:
						isEmpty();
						break;
					case 3:
						sizOfArrayList();
						break;
					case 4:
						removeElement();
						break;
					case 5:
						getElements();
						break;
					case 6:
						updateElement();
						break;
					case 7:
						containsElement();
						break;
					case 8:
						iterate();
						break;
					case 9:
						addElementAtPosition();
						break;
					case 10:
						clear();
						break;
					case 11:
						listIterator();
						break;
					case 12:
						listIteratorReverse();
						break;
					case 13:
						forLoop();
						break;
					case 14:
						forEach();
						break;
					case 15:
						break;
					default:
						System.out.println("Invalid selection try again later");
					}
				}
			}

		}

}
