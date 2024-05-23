package varibles;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 16;
		int z = b>>3;
		System.out.println("right shift" + z);
		int c = a|b;
		System.out.println("biwise"+c);
		boolean x = (a<b)?true:false;
		System.out.println("min"+x);
		int h =1;
		switch(h)
		{
		case 1: System.out.println("first");
		        break;
		case 2:System.out.println("sec");
		        break;
		case 3:System.out.println("third");
		     break;
		}
		

	}

}
