import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteExample {

	public static void main(String[] args) {
		
		//List<Integer> list = new ArrayList<>();
		CopyOnWriteArrayList<Integer>  list = new CopyOnWriteArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(90);
		list.add(40);
		list.add(60);
		
		System.out.println(list);
		
		Iterator <Integer> li = list.iterator();
		
		while(li.hasNext()) {
			System.out.println(li);
			Integer i = li.next();
			if(i==40)
			list.add(50);
			System.out.println(i);
		}
		
		System.out.println(list);
		
	}
}
