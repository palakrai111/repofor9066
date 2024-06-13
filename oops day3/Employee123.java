package oops;

public class Employee123 {

	 String name;
	 Address adr;
	 Employee123(String name,Address adr)
	 {
		 this.name = name;
		 this.adr = adr;
		 
	 }
	 void display()
	 {
		 System.out.println(name + " "+adr.city+" "+adr.country);
		 
	 }
	public static void main(String[] args) {
		Address a = new Address("vzag","india");
		Employee123 e = new Employee123("abc",a);
		e.display();

	}

}
