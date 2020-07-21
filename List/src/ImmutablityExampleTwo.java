final class Studente {

private final int rollNo;
private final String name;
private final Address address;

public Studente(int rollNo,String name,Address x){
this.name=name;
this.rollNo = rollNo;
Address address = new Address(x.getStreetName(), x.streetNo);
this.address= address;
}

public int getRollNo(){
return rollNo;
}

public String getName(){
return name;
}

public Address getAddress(){
return address;

}

}

class Address{
	public String streetName;
	public int streetNo;
	
	public Address(String streetName, int streetNo) {
		super();
		this.streetName = streetName;
		this.streetNo = streetNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public int getStreetNo() {
		return streetNo;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}
	

}

public class ImmutablityExampleTwo {
	
	public static void main(String[] args) {
		
		Address a = new Address("som",10);
		Studente s = new Studente(1,"Kes",a);
		
		a.setStreetName("mamidikuduru");
		
		System.out.println(s.getName()+ " "+s.getRollNo()+ " "+s.getAddress().getStreetName()+" "+ s.getAddress().getStreetNo());
	}
	
}
