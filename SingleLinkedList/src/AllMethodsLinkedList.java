import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class AllMethodsLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(10);
		list.add(30);
		System.out.println(list);
		
		list.addFirst(60);
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);
		
		if(list.contains(10))
		System.out.println(list);
		
		//Iterator and listIterator
		ListIterator le = list.listIterator();
		while(le.hasNext()) {
			System.out.println(le.next());
		}
		
		while(le.hasPrevious())
		System.out.println(le.previous());
		
		//subList
		System.out.println(list.subList(0, 1));
		
	}
	
	
}
