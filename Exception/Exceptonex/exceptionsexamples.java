package Exceptonex;

public class exceptionsexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		try {
			/*String s = null;
			System.out.println(s.length());
		int i = 100/0;*/
			/*int a[] = new int [5];
			a[6] = 100/0;*/
			
			String  s = "abc";
			int i = Integer.parseInt(s);
			System.out.println(i);
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		System.out.println("exception occoured");
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		System.out.println("exception occoured");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		System.out.println("exception occoured");
		}
		System.out.println("exception is handledS");
	}
   
}
