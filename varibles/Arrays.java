package varibles;

import java.util.Scanner;
import java.util.*;
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {6,2,3,9};
		System.out.println(a.length);
		//Arrays.sort(a);
		for(int i = 0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
        System.out.println("----for each-----");
        for(int x:a)
        {
        	System.out.println(x);
        }
        Scanner sc = new Scanner(System.in);
        int b[]= new int [3];
        System.out.println("enetr nos");
        for(int i = 0;i<a.length;i++)
		{
			b[i] = sc.nextInt();
		}
        System.out.println("display");
        for(int y:b)
        {
        	System.out.println(y);
        }
        
	}

}
