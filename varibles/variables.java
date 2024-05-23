package varibles;

public class variables {
   int a;
   static int b;
   void locald(int c)
   {
	   System.out.println(c);
   }
   void display()
   {
	   System.out.println(a);
	  // System.out.println(c);
   }
   
   void display1()
   {
	   System.out.println(a);
	   System.out.println(b);
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variables ob1 = new variables();
		ob1.a=15;
		b = 28;
		variables ob2 = new variables();
		ob2.a=18;
		/*ob2.display1();
		ob1.display();
		ob1.display1();
		ob1.locald(15);*/
		
		int x=10;  
	//int	y = x++ + ++x;  //10 + 12=22
	//System.out.println(y);
		System.out.println(x++ + ++x);//10 (11)  (11+12)//22 + 24
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10  
		
		int i ;       //4 bytes
		double d = 20.56; //8 bytes;
		i = (int)d;
		System.out.println("i------"+ i);
		
		
		 for ( int k = 1 ; k<=3; k++)
		 {
			 for(int l = 1; l<=3;l++)
			 {
						 if(k==2 && l==2)
						 {
							 continue;
						 }
						System.out.println("bk"+k + "___"+l);
			 }
		 }

	}

}
