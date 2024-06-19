package Exceptonex;

public class multiplcatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int a[] = new int[5];
	    a[6] = 100/0;
	    String s = null;
	    System.out.println(s.length());
	    
	    System.out.println(a[5]);
	    System.out.println("abcd");
		}
		/*catch(Exception e)
		{
			System.out.println(e);
		}
		/*catch(ArithmeticException e)
		{
			System.out.println(e);
		}*/
		catch(ArrayIndexOutOfBoundsException o)
		{
			System.out.println(o);
		}
       System.out.println("hello");
	}

}
