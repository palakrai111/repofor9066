package varibles;
class Employee1
{
	String company = "abc";
	void show()
	{
		System.out.println("i am superclass show");
	}
}
class parttimeEmployee extends Employee1
{
	String company = "def";
	void show()
	{
		super.show();
		System.out.println(company);
		System.out.println(super.company);
	}
}
public class Superkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parttimeEmployee a = new parttimeEmployee();
		a.show();
	}

}
