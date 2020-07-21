import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

final class Student{
	
	private final  int no;
	private  final String name;
	private HashMap<String, String> map;
	
	public Student(int no, String name,HashMap<String, String> x) {
		this.no = no;
		this.name = name;
		HashMap<String, String> map = new HashMap<>();
		Iterator <String> it = x.keySet().iterator();
		while(it.hasNext()) {
			String z= it.next();
			map.put(z, x.get(z));
		}
		
		this.map = map;
	}	
	
	public int getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}
	
	public HashMap<String,String> getMap(){
		return map;
	}
}


public class ImmutableExample {
	
	public static void main(String[] args) {
		int i = 10;
		HashMap <String,String> map = new HashMap<>();
		map.put("k", "Amma");
		map.put("s", "Nanna");
		Student s = new Student(i, "Sandeep",map);
		i=30;
		map.put("k", "Mother");
		System.out.println(s.getNo()+ " "+ s.getName()+ " "+ s.getMap().get("k"));
	}
}
