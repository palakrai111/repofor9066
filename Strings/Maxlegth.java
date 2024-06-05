package in.sp.backend;

import java.util.Scanner;

public class Maxlegth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a string");
		String s= sc.nextLine();
		int n = s.length(); int res = 0, 
				curr_len = 0;
		for (int i = 0; i < n; i++)
		{
		if (s.charAt(i) != ' ') 
			{curr_len++;}
		else
		{ res = Math.max(res, curr_len); 
		curr_len = 0;
		}
		}
		//System.out.print(Math.max(res, curr_len));
		System.out.print(res);
		
		

	}

}
