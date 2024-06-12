package varibles;
abstract class Student345
{
	int id ;
	String name;
	Student345(int id,String name)
	{
		this.id = id;
		this.name = name;
		
	}
	abstract void show();//abstract method
	void display()//non abstract method
	{
		System.out.println("hello");
		System.out.println(id +" "+name);
		
	}
		
}
class MathsStudent extends Student345
{
	MathsStudent(int id,String name)
	{
		super(id,name);
	}
	
	void show()
	{
		System.out.println("i am maths student");
	}
}
class ScienceStudents extends Student345
{
	ScienceStudents(int id , String name)
	{
		super(id,name);
	}
	void show()
	{
		System.out.println("i am science student");
	}
}

public class Abstractionusingclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathsStudent ob = new MathsStudent(1,"palak");
		ScienceStudents ob1 = new ScienceStudents(2,"nayan");
		ob.display();
		ob.show();
		ob1.display();
		ob1.show();

	}

}
