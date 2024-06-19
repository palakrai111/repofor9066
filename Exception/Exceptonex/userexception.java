package Exceptonex;

public class userexception {

	static void vaidateage(int age)throws userdefinedexception
	{
		if(age < 18)
		{
			throw new userdefinedexception("invalid age ud");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			vaidateage(17);
		}catch(userdefinedexception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
