package in.sp.main9066;

import java.util.List;

public class Mainstudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Studentdao x = new Studentdao();
		/*Student ob =x.getStudent(400);
		System.out.println(ob);*/
		List<Student> li = x.getAllStudent();
		for(Student y : li)
		{
			System.out.println(y);
		}
        
		Student ob2 = new Student(900,"Saziya","cse","pass");
		int j =x.insertStudent(ob2);
		if(j>0)
		{System.out.println("insertion done");}else {System.out.println("nd");}
	}

}
