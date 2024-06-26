package ems;

import java.util.HashSet;
import java.util.*;
public class EmployeeService 
{
	HashSet<Emloyeeentity> empset=new HashSet<Emloyeeentity>();
	Emloyeeentity ob1 = new Emloyeeentity(1,"abc");
	Emloyeeentity ob2 = new Emloyeeentity(3,"ab");
	Emloyeeentity ob3 = new Emloyeeentity(2,"a");
   EmployeeService()
   {
	   empset.add(ob1);
	   empset.add(ob2);
	   empset.add(ob3);
   }
   
   void viewemp()
   {
	   for(Emloyeeentity emp:empset) {
			System.out.println(emp);
		}
   }
   
   void searchemp()
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter id to search");
	  int id = sc.nextInt();
	  boolean found = false;
	  for(Emloyeeentity e:empset)
	  {
	  if(e.getEid()== id)
	  {
		 found = true; 
		 //System.out.println("f");
	  }
	  }
	  
	  if(found)
	  {System.out.println("found");}else {System.out.println("nf");}
   }
   
   
   public void deleteEmp() {
		System.out.println("Enter id");
		Scanner sc = new Scanner(System.in);
		int id1=sc.nextInt();
		boolean found=false;
		Emloyeeentity empdelete=null;
		for(Emloyeeentity emp:empset) {
			if(emp.getEid()==id1) {
				empdelete=emp;
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			empset.remove(empdelete);
			System.out.println("Employee deleted successfully!!");
		}
		
		
}
}