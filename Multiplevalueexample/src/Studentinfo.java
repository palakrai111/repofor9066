import java.util.*;
public class Studentinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> a = new ArrayList<Student>();
		for(int i= 0; i<2;i++)
		{
			System.out.println("enter id");
			int id = sc.nextInt();
			System.out.println("enter name");
			String name = sc.next();
			Student b = new Student(id,name);
			a.add(b);
		}
		
		for(Student x :a)
		{
			System.out.println(x);
		}

	}

}
