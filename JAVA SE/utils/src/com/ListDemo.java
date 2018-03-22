package com;
import java.util.List;
import java.util.Vector;
public class ListDemo {

	public static void main(String[] args) {
		
		
	List<Object> arr=new Vector<>();
		
		arr.add("Praveen");
		arr.add('A');
		arr.add(100);
		arr.add(65.45f);
		arr.add(83434.44);
		arr.add(65.45f);
		arr.add(65.45f);
		arr.add(0, 10000);
		arr.add(65.45f);
		arr.add(null);
		
		/*System.out.println(arr);
		System.out.println("Size: "+arr.size());
		
		System.out.println(arr.get(2));
		arr.remove(1);
		System.out.println(arr);
		System.out.println("Size: "+arr.size());
		
		arr.set(0, "Ozvitha");
		System.out.println(arr);
		System.out.println(arr.contains(83434.44)); 
		
		arr.clear();
		System.out.println(arr);
		System.out.println("Size: "+arr.size());*/
		
		// Iterations - 4 ways
		/*
		 * 1. for loop -> use this to display any order only
		 * 2. For each -> use this to display top to bottom only
		 * 3. Iterator (I) -> use this to display,remove eleement
		 * 					 while iterating
		 * 4. ListIterator (I)-> Use this to display,remove,add while
		 *                        Iterating
		 * 5. Enumerator (I) -> Use this to display for only
		 *                      synchronized classes like vector
		 */
		
		// 1. using for loop -> top to bottom
		
	/*	for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		// 1. using for loop -> bottom to top
		
		System.out.println("-------------------------");
		for(int i=arr.size()-1;i>=0;i--) {
			System.out.println(arr.get(i));
		}
		
		System.out.println("--------------------------");
		// 2. using for each -> top to bottom
		
		for(Object obj:arr) {
			System.out.println(obj);
		}
		*/
		
		// 3. Using Iterator
		
		/*Iterator<Object> it=arr.iterator();
		
		while(it.hasNext()) {
			Object obj=it.next();
			if(obj.equals("Praveen")) {
				it.remove();
				continue;
			}
			System.out.println(obj);
		}*/
		
		// 4. using ListIterator
		
		/*ListIterator<Object> li=arr.listIterator();
		
		while(li.hasNext()) {
			
			Object obj=li.next();
		
			if(obj.equals("Praveen")) {
				li.set("James");
				continue;
			}
				
			System.out.println(obj);
		}
		*/
		System.out.println(arr);
		
	/*	System.out.println("-----------------------");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		*/

	}

}
