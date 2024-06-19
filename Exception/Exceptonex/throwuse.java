package Exceptonex;

public class throwuse {

	
	static void vaidateage(int age) throws ArithmeticException
	{
		if(age < 18)
		{
			throw new ArithmeticException("invalid age");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		vaidateage(17);
		}catch(Exception e)
		{
			System.out.println(e);
		}
       System.out.println("done");
	}

}
