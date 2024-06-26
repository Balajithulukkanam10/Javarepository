package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ArrayListClass {
	
//	WebDriver
	/* ArrayList
	 * 	It implements List Interface
	 * 	Its a resizeable array
	 * 	Each ArrayList has a capacity and it will increase automatically if we add values more than the given capacity
	 * 	Initial size of ArrayList is 10 if no size is mentioned while declaring ArrayList
	 * 	ArrayList can be declared as below
	  		ArrayList li = new ArrayList(); //since it is a non-generic ArrayList, we can add any object such as Integer, String etc.,
			List list = new ArrayList();  //since it is a non-generic ArrayList, we can add any object such as Integer, String etc.,
			List<Integer> list1 = new ArrayList<Integer>(); //Generic ArrayList, we can only add Integer
			ArrayList<Integer> AI = new ArrayList<Integer>();
			ArrayList<String> AS = new ArrayList<String>(10); //Generic ArrayList, we can only add String
			ArrayList<String> AS1 = new ArrayList<String>(AS);
	 * 	Useful methods in ArrayList
	 * 		All the methods declared in Collection and List interfaces are implemented in this class and along with that we have below methods
	 * 		trimToSize();
	 * 		ensureCapacity(int minCapacity);
	 * 		grow(int minCapacity);
	 * 		grow();
	 * 		newCapacity(int minCapacity);
	 * 		hugeCapacity(int minCapacity);
	 * 		g();
	 * 			Since CLone() method returns Objects, we need to cast Object to ArrayList
	 * 		add(E e, Object[] elementData, int s);
	 * 		equalsRange(List<?> other, int from, int to) ;
	 * 		equalsArrayList(ArrayList<?> other);
	 * 		fastRemove(Object[] es, int i);
	 * 		removeRange(int fromIndex, int toIndex);
	 * 		iterator();
	 * 			hasNext();
	 * 			next();
	 * 			remove();
	 * 			forEachRemaining(Consumer<? super E> action);
	 * 			checkForComodification();
	 * 		ListIterator<E>();
	 * 			- This method returns ListIterator Class
	 * 			- it has below methods
	 * 			hasPrevious();
	 * 			nextIndex();
	 * 			previousIndex();
	 * 			previous();
	 * 			set(E e);
	 * 			add(E e);
	 * 		subList(int fromIndex, int toIndex) 
	 * 			- this method returns SubList class
	 * 			- This sublist class has all the list methods
	 * 			- and its own constructors
	 *		SplitIterator() 
	 *			- This method returns ArrayListSpliterator class
	 *			- This class has some methos such as getFense(), trySplit(),    ..
	 *
	 */
	
//	ArrayList
//	LinkedList
//	HashSet
//	LinkedHashSet
//	TreeSet
//	HashMapPractice
//	LinkedHashMap
//	TreeMap
	
	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Maruti");
		cars.add("swift");
		cars.add("Audi"); 	
		cars.add(3, "Volvo");
		cars.add("Maruti");
		cars.add("Swift");
		cars.add(null);
		cars.add(null);
		System.out.println(cars);
//		cars.add(2, "BMW"); 
//		System.out.println(cars);

		System.out.println(cars.get(0));
//		System.out.println(cars.get(20));
		System.out.println(cars.size());
		
		System.out.println("****for loop****");
		for(int i=0;i<cars.size();i++) {
			System.out.println(cars.get(i));
		}
		
		System.out.println("****for each****");
		for(String each : cars) {
			System.out.println(each);
		}
		
		System.out.println("****Contains****");
		System.out.println(cars.contains("Volvo"));
		
		
		cars.set(3, "BENZ");
		System.out.println(cars);
		
		cars.remove(1);
		System.out.println(cars);    
		
//		cars.clear();
//		System.out.println(cars);
		
		System.out.println("*********Sorting***********");
		ArrayList<String> nullCollection = new ArrayList<String>();
		nullCollection.add(null);
		cars.removeAll(nullCollection);
		System.out.println("***********After removing null values************");
		System.out.println(cars);
		System.out.println("*************After sorting************");
		Collections.sort(cars); 
		System.out.println(cars);
		System.out.println("***********************");
		
		ArrayList<String> cars1 = (ArrayList<String>)cars.clone(); 
		System.out.println(cars1);
		
		System.out.println("******forEach method******");
		cars1.forEach(eachCars1 -> System.out.println(eachCars1)); //lambda expression
		
		System.out.println("******forEachRemaining method******");
		Iterator carsIterator = cars1.iterator();
		carsIterator.forEachRemaining(eachCars -> System.out.println(eachCars));
		
		System.out.println("******Using Iterator********");
		Iterator<String> iterator = cars.iterator();
		while(iterator.hasNext()) {
			String carname = iterator.next(); // this is like get(i)
			System.out.println(carname);
		}
		
		System.out.println("******Using ListIterator********");
//		List<String> coolStringList = Arrays.asList("Java", "Scala", "Groovy");
		List<String> coolStringList = new ArrayList<String>();
		coolStringList.add("Java");
		coolStringList.add("Scala");
		coolStringList.add("Groovy");
		
		
		ListIterator <String> listIterator = coolStringList.listIterator();
		System.out.println("++++" +listIterator.hasNext());
		System.out.println("&&&&&&&&&"+listIterator.next());
		
//		ListIterator <String> listIterator1 = coolStringList.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		
		System.out.println("++++" +listIterator.hasPrevious());
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
//			String name3 = listIterator.previous();
//			System.out.println(name3);
		}
		
		Spliterator<String> splitIterator = coolStringList.spliterator();
		System.out.println("sathyaaaaaaaa");
		System.out.println(splitIterator.estimateSize());
		System.out.println(splitIterator.ORDERED);
		
		
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("Shiva");
		list.add(0.1f);
		System.out.println(list);
		
	}
}
