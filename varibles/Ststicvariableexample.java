package varibles;

public class Ststicvariableexample {

	
	  int a=10;
	  static String clgname = "xyz";
	  
	  void display(int x)
	  {
		System.out.println("inside method"+x);
		System.out.println("inside method"+clgname);
	  }
	  
	  
	  void display2(int y)
	  {
		System.out.println(a); 
		System.out.println(clgname);
		
	  }
	  
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ststicvariableexample ob1 = new Ststicvariableexample();
		System.out.println(ob1.a);
		System.out.println(clgname);
		ob1.display(5);
		
		
		Ststicvariableexample ob2 = new Ststicvariableexample();
		ob2.a = 15;
		System.out.println(ob2.a);
		System.out.println(clgname);
		

	}

}
