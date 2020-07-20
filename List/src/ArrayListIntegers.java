import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListIntegers {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(50);
		list.add(40);
		list.add(20);

		Collections.sort(list,Collections.reverseOrder());
		
		System.out.println(list);
		
	}
}
