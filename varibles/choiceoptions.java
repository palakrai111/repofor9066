package varibles;
import java.util.Scanner;
public class choiceoptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch1;
		int n1 =0;
		int n2 = 1;
		int n3;
		do
		{
			System.out.println("enter your choice");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("i am in case 1");
			
			for(int i =1; i <=10;i++)
			{
				n3 = n1+n2;
				System.out.print(n3+ " ");
				n1=n2;
				n2 = n3;
			}
			
			
			break;
			case 2:System.out.println("i am in case 2");
			for(int i =1;i <=10;i++)
			{
			System.out.printf("%d*%d=%d\n", 5,i,(5*i));
			}
			break;
			
			}
			
			System.out.println("press y to continue and n to exit");
			
			
			ch1 =sc.next().charAt(0);
			if(ch1 == 'n')
			{break;}
		}
		while(ch1 == 'y');
		
		

	}

}
