package librarymanagement;

import java.util.ArrayList;
import java.util.*;

public class multiplevalue {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		ArrayList<Student> ob = new ArrayList<Student>();
		for(int i = 0; i <2; i++)
		{
			System.out.println("enter id");
			int id = sc.nextInt();
			System.out.println("enter name");
			String name = sc.next();
			Student s = new Student(id,name);
			ob.add(s);
			
		}
		for(Student x: ob)
		{
			System.out.println(x);
		}

	}

}
