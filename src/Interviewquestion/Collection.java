package Interviewquestion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Collection {

	public static void main(String[] args) {
		//Array list
		ArrayList< String> cars= new ArrayList<>();
		cars.add("BMW");
		cars.add("Suzzkie");
		cars.add("benze");
		cars.add("RR");
		cars.add("Buiggati");
		System.out.println(cars);
		
		//copy list
		ArrayList< String> carscopy= new ArrayList<>();
		carscopy.addAll(cars);
		System.out.println(carscopy);
		
		System.out.println(cars.get(0));
		System.out.println(cars.indexOf("BMW"));
		System.out.println(cars.lastIndexOf("Buiggati"));
		//insert 3 indes la rr value replace agudu
		System.out.println(cars.set(3, null));
		System.out.println(cars);
		
		Iterator<String> carvalues=cars.iterator();
		while(carvalues.hasNext()) {
			System.out.println(carvalues.next());
			
		}
		
		LinkedList< String> carsss= new LinkedList<>()
;
		carsss.add("BMW");
		carsss.add("Suzzkie");
		carsss.add("benze");
		carsss.add("RR");
		carsss.add("Buiggati");
		System.out.println(carsss);
		System.out.println(carsss.get(0));
		System.out.println(carsss.getFirst()+carsss.getLast());
		System.out.println(carsss.removeFirst());
		System.out.println(carsss);
		System.out.println(carsss.removeLast());
		System.out.println(carsss);
		System.out.println(carsss.pollFirst());
		System.out.println(carsss);
		System.out.println(carsss.remove());
		carsss.add("BMW");
		carsss.add("Suzzkie");
		carsss.add("benze");
		carsss.add("RR");
		carsss.add("Buiggati");
		System.out.println(carsss.removeFirstOccurrence("BMW"));
		System.out.println(carsss);

	}

}
