package in.sp.backend;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "nayank";
		String rev = "";
		for(int i = x.length()-1;i>=0;i--)
		{
			rev = rev + x.charAt(i);
		}
         System.out.println(rev);
         if(x.equals(rev))
         {System.out.println("equals");}
         else 
         {
        	 System.out.println("not equals");
         }
	}

}
