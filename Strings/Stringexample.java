package in.sp.backend;

public class Stringexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "palak";
		String s5 = "palak";
		System.out.println(s==s5);
		char ch[] = {'a','b','c'};
		String s3 = new String(ch);
		String s2 = new String("welcome");
		System.out.println("String using new keyword"+s2);
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.indexOf('l'));
		System.out.println(s.charAt(2));
		System.out.println("array of characters"+s3);
           //A - Z ->65 T0 90
		     // a-z -> 97 to 122
		String s4 = new String("palak");
		
		System.out.println(s==s4);
		String s6 = "palaK";
		System.out.println("equals"+(s.equals(s6)));
		System.out.println("compare to"+(s.compareTo(s6)));
		char ch1[] = s.toCharArray();
		System.out.println("printing array");
		for(char cx : ch1)
		{
		   System.out.println(cx);	
		}
	String s7 = "i am palak" ;
	String s9[] = s7.split(" ");
	for(String x:s9)
	{
		System.out.println(x);
	}
	}

}
