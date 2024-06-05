package in.sp.backend;

public class loweruperase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String x = "pALak";//PalAK
        int y;
        for(int i = 0; i < x.length();i++)
        {
        	char ch = x.charAt(i);
        	if (ch>='A' && ch<='Z')
        	{
        		  y = ch + 32;
        		System.out.print((char)y);
        	}
        	else
        	{
        		 y = ch - 32;
        		 System.out.print((char)y);
        	}
        	
        }
	}

}
