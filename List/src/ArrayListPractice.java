import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		List <String> list = new ArrayList<>();
		
		list.add("fun");
		list.add("bad");
		list.add("good");
	
		System.out.println(list);
		
		Iterator <String>it = list.iterator();
		/*
		 * while(it.hasNext()) { //list.remove("bad"); String t = it.next();
		 * //it.remove(); }
		 */
		Collections.sort(list);
		System.out.println(list);
	}
}
