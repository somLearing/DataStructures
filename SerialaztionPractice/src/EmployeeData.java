import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class EmployeeData {

	public static void main(String[] args) {
		
	List <String> list = new ArrayList<>();
	
	list.add("Funny");
	list.add("Be Happy");
	list.add("Cool");
	
	try {
		FileOutputStream f = new FileOutputStream("abc");
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(list);
		o.close();
		f.close();
	}
	
	catch(FileNotFoundException f) {
		f.printStackTrace();
	}
	catch(IOException e) {
		e.printStackTrace();
	}	
		
	}
}
