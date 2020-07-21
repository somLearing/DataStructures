import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
}

public class EmployeeData {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		Employee e1 = new Employee(10,"Sandeep");
		Employee e2 = new Employee(50,"Kesari");
		
		list.add(e1);
		list.add(e2);
		
		Collections.sort(list,new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().length()-o2.getName().length();
			} 
			
		});
		
		for (Employee employee : list) {
			System.out.println(employee.getId() + " " + employee.getName());
		}
		
	}
}
