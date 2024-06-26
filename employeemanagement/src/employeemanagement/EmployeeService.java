package employeemanagement;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService 
{
	HashSet<Employee> hs = new HashSet<Employee>();
			
			
	Employee ob1 = new Employee(1,"abc");
	Employee ob2 = new Employee(2,"ab");
	Employee ob3 = new Employee(3,"a");
	EmployeeService()
	{
		hs.add(ob1);
		hs.add(ob2);
		hs.add(ob3);
		
	}
	void viewemp()
	{
		for(Employee x:hs)
		{
			System.out.println(x);
		}
	}
	
	void search()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id to search");
		int sid = sc.nextInt();
		boolean found = false;
		for(Employee e : hs)
		{
			if(e.id == sid)
			{
				found = true;
			}
		}
		if(found)
		{
			System.out.println("elemnt present " + sid );
		}
		else 
		{
			System.out.println("element not found");
		}
	}
	
}
