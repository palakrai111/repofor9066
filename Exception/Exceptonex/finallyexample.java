package Exceptonex;

public class finallyexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i = 100/0;
			System.out.println(i);
			System.out.println("no exception");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Always exceuted");
		}

	}

}
