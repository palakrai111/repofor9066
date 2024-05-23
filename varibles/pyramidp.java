package varibles;

public class pyramidp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=3;i++)
		{
			for (int j = 1; j<=3; j++)
			{
				//System.out.print("*"+" ");
				
				if(i==2 && j==2)
				{
					continue;
				}
				System.out.println(i + " "+ j);
			}
			//System.out.println();
		}

	}

}
