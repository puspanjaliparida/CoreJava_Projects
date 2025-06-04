package com.nt;

import java.util.ArrayList;

import java.util.Iterator;

public class TestCollectionMethods {
    public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Collection Created.");
		System.out.println("Collection is Empty. "+al.isEmpty());
		al.add(100);
		al.add(120);
		al.add(140);
		al.add(160);
		al.add(180);
		/*System.out.println("Elements are added into Collection: ");
		//Size():Check the number of elements in Collection
		System.out.println("No. of Elements: "+al.size());
		
		//isEmpty():check whether collection contains any element
		System.out.println("Collection is empty: "+al.isEmpty());
		
		//Contains(): check whether the passed object is available in memory
		System.out.println("Element 60 is available: "+al.contains(60));
		System.out.println("Element 120 is available: "+al.contains(120));
		
		//iterator(): used to create cursor object and traverse through the collection
		Iterator itr=al.iterator();
		System.out.println("Elements in collection are: ");
		while(itr.hasNext()) {
			Integer obj=(Integer)itr.next();
			System.out.println(obj);
		}
		
		System.out.println("Elements in collection are: ");
	    Object arr[]=al.toArray();
	    for(Object o:arr) {
	    	System.out.println(o);
	    }
	    
	    //remove(int index): remove object from collection based on index if available
	    System.out.println("Removing element at index 0: ");
	    //al.remove(9);//IOOBE
	    System.out.println(al);
	    
	    //remove(Object o): remove object from collection based on passed object if available
	    System.out.println("Removing object 120: ");
	    al.remove(new Integer(120));
	    System.out.println(al);*/
	    
	    //addAll(): Add all the elements of a collection into another
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(120);
		al2.add(200);
		al2.add(300);
		al2.add(140);
		System.out.println("Elements in al: "+al);
		System.out.println("Elements in al2: "+al2);
		System.out.println("Adding all elements of al2 into al: ");
		al.addAll(al2);
		System.out.println("Elements in al: "+al);
		System.out.println("Elements in al2: "+al2);
		
		//containsAll(): check whether a collection contains all elements of another collection
		System.out.println("al contains all elements of al2: "+al.containsAll(al2));
		System.out.println("Removing an element(200) of al2 from al: ");
		al.remove(new Integer(200));
		System.out.println("Elements in al: "+al);
		System.out.println("al contains all elements of al2: "+al.containsAll(al2));
		System.out.println("Elements in al: "+al);
		System.out.println("Elements in al2: "+al2);
		
        /*retainAll(): keeps the matching elements and remove the other(but not
                       the copy of collection got from addAll().) */       
        System.out.println("Retaining elements in al: ");
        al.retainAll(al2);
        System.out.println("Elements in al: "+al);
        System.out.println("Elements in al2: "+al2);

        //removeAll():matching elements and all elements of copy are removed
        System.out.println("Remove all elements of al2 which is avaialable in al ");
        al.removeAll(al2);
        System.out.println("Elements in al: "+al);
        System.out.println("Elements in al2: "+al2);

        //clear():remove everything from the collection and make it empty.
        System.out.println("clearing elements from al.");
        al.clear();
        System.out.println("Elements in al: "+al);
        System.out.println("Elements in al2: "+al2);
        
        ArrayList<Integer> al3 = new ArrayList<Integer>();
        al3.add(101);
        al3.add(202);
        al3.add(303);
        al3.add(404);
        System.out.println("Elements in al3: "+al3);
        al3.removeIf(n->n%2==0);
        System.out.println("Elements in al3: "+al3);
	}
}
