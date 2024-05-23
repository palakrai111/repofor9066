package varibles;

public class paindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int no = 123;
         int temp = no;
         int rev = 0;
         while(temp !=0)
         {
        	 int d = temp %10;
        	  rev = rev*10 + d;
        	  temp = temp/10;
         }
         
         if(rev == no)
         {
        	 System.out.println("palindrome");
         }
         else 
         {
        	 System.out.println("not palindrome");
         }
	}

}
