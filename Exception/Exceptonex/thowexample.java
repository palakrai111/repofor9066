package Exceptonex;

public class thowexample {
     static void validateage(int age) throws ArithmeticException
      {
    	 if(age < 18)
    	 {
    	  throw new ArithmeticException("age not valid");
    	 }
    	 System.out.println("age valid");
      }
	public static void main(String[] args) throws ArithmeticException
    
	{
		// TODO Auto-generated method stub
		try {
		validateage(15);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("exception handles");

	}

}
