package Exceptonex;

public class userdeineduse {

	public static void use()throws UserdefinedExceptionexample
	{
		throw new UserdefinedExceptionexample("xyz");
	}
	public static void main(String[] args)
	{
		try{// TODO Auto-generated method stub
		use();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
