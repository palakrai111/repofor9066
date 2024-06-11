package varibles;

public class ArraySum {
   int sum = 0;
	
	  int sumofArray(int a[],int b[])
	  {
		  for (int i = 0; i <a.length;i++)
		  {
			  sum = sum + a[i];
		  }
		  return sum;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySum ob = new ArraySum();
		int arr[]= {10,20,30,40};
	System.out.println(ob.sumofArray(arr));
		
	}

}
