package varibles;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 153;
		int temp = no;
		double sum = 0;
		while(temp>0)
		{
			int d = temp % 10;
			sum = sum +Math.pow(d, 3);
			temp = temp/10;
			
		}
		if (no == sum)
		{
			System.out.println("Arm");
		}
		else 
		{
			System.out.println("nArm");
		}

	}

}
