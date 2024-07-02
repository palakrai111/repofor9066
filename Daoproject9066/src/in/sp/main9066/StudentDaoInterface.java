package in.sp.main9066;

import java.util.List;

public interface StudentDaoInterface 
{
	public Student getStudent(int id);
	public List<Student> getAllStudent();
	public int insertStudent(Student ob);

}
