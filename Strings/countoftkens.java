package in.sp.backend;

public class countoftkens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "i am palak";
         int scount=0; //2
         int ccount=0; //10
         int wcount=1;  //3
         for(int i = 0;i < s.length();i++)
         {
        	 char ch = s.charAt(i);
        	 if(ch != ' ')
        	 {
        		 ccount++;
        	 }
        	 else
        	 {
        		 scount++;
        		 wcount++;
        	 }
         }
         System.out.println("space"+scount);
         System.out.println("char"+ccount);
         System.out.println("word"+wcount);

	}

}
