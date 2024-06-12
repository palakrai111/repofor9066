package varibles;
abstract class Student
{
	int id;
	String name;
	//String city;
	Student(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	void dispaly()
	{
		System.out.println("i am in student class");
		System.out.println(id +" "+name);
	}
    abstract public void marks();
}
class Student1 extends Student
{
	//String city ;
	Student1(int id ,String name)
	{
	super(id,name);
	//this.city = city;
	}
  public void marks()
	{
	  System.out.println("out of 100");
	}
}
class Student2 extends Student
{
	Student2(int id ,String name)
	{
	super(id,name);
	}
  public void marks()
	{
	  System.out.println("out of 200");
	}
}
public class Abstractionusingclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//student s = new Student(1,"avc");
		Student2 ob = new Student2(1,"palak");
		Student1 ob1 = new Student1(2,"gaurik");
		ob.dispaly();
		ob.marks();
		ob1.dispaly();
		ob1.marks();

		
	}

}
