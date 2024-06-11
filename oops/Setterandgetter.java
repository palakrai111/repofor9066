package varibles;

public class Setterandgetter {
	int id;
	String name;
	void setId(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	int getId() 
	{
		return id;
	}
	String getName()
	{
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Setterandgetter ob = new Setterandgetter();
		ob.setId(5,"palak");
		System.out.println("student id is"+ob.getId());
   System.out.println(ob.getName());
	}

}
