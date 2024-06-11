package varibles;

public class Constructorex {
	int id ;
	String name;
	String city;
	Constructorex(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	Constructorex(int id,String name,String city)
	{
		/*this.id = id;
		this.name = name;*/
		this(id,name);
		this.city = city;
	}

	void display()
	{
		System.out.println(id + name + city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorex ob1 = new Constructorex(1,"abc");
       ob1.display();
       
       Constructorex ob2 = new Constructorex(1,"abcd","vizag");
       ob2.display();
       
	}

}
