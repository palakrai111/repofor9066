package oops;
class Bank
{
	int ROI()
	{
		return 0;
	}
}
class SBI extends Bank
{
	int ROI()
	{
		return 10;
	}
}
class icici extends Bank
{
	int ROI()
	{
		return 11;
	}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;
		b = new SBI();
		System.out.println(b.ROI());
		
		b = new icici();
		System.out.println(b.ROI());

	}

}
