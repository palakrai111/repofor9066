package oops;

public class Overloadingex {

	public static void main(String x) 
	{
		System.out.println("i am main method with string a ");
	}
	public static void main() 
	{
		System.out.println("abc");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main("palak");
		main();

	}

}
