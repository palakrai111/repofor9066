package varibles;
class interfaceexample123 implements firstinterface,secondinterface
{
	public void show()
	{
		System.out.println("show method");
	}
	/*public void display()
	{
		System.out.println("inside displa method");
	}*/
}
public class interfaceclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfaceexample123 ob = new interfaceexample123();
		ob.show();
		//ob.display();
	}

}
