import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ReadFile {

	public static void main(String[] args) {
		
		List<String> list = null;
		try {
			FileInputStream f = new FileInputStream("abc");
			ObjectInputStream o = new ObjectInputStream(f);
			list = (List) o.readObject();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (String string : list) {
			System.out.println(string);
		}
	}
	
}
