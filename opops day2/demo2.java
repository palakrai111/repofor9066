package varibles;
class demo3 implements demointerface
{
	public void calsize()
	{
		System.out.println("i am cube");
	}
}
class demo2 implements demointerface
{
	public void calsize()
	{
		System.out.println("i am square");
	}
	public static void main(String[] args)
	{
		demo2 d = new demo2();
		demo3 d1 = new demo3();
		d.calsize();
		d1.calsize();
	}
	
}