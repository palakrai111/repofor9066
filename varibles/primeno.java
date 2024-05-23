package varibles;

public class primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag =0;
		for (int i = 3; i<=10;i++)
		{
			for (int j = 2; j<i;j++)
			{
				if(i%j==0)
				{
				flag = 0;
					break;
				}
				else
				{
					flag =1;
				}
				
			}
			if(flag == 1)
			{
				System.out.println("prime no :"+i);
			}
			
		}

	}

}
//prime no , pattern, typecasting