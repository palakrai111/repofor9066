package in.sp.main9066;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class Studentdao implements StudentDaoInterface
{

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		Student ob = null;
		try {
		Connection con = dbcon1.getCon();
		PreparedStatement ps = con.prepareStatement("select * from student where sid =?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
	     if(rs.next())
	     {
	    	 int id1 = rs.getInt(1);
	    	 String name = rs.getString(2);
	    	 String dep = rs.getString(3);
	    	 String status = rs.getString(4);
	    	 ob = new Student(id1,name , dep, status);
	     }else
	     {System.out.println("not found");}
		
		}catch(Exception e)
		{System.out.println(e);}
		
		return ob;
	}

	@Override
	public List<Student> getAllStudent() 
	{
		List<Student> li = new ArrayList<Student>();
		Student ob = null;
		try {
		Connection con = dbcon1.getCon();
		PreparedStatement ps = con.prepareStatement("select * from student");
		
		ResultSet rs = ps.executeQuery();
	     while(rs.next())
	     {
	    	 int id1 = rs.getInt(1);
	    	 String name = rs.getString(2);
	    	 String dep = rs.getString(3);
	    	 String status = rs.getString(4);
	    	 ob = new Student(id1,name , dep, status);
	    	 li.add(ob);
	     }
		
		}catch(Exception e)
		{System.out.println(e);}

		return li;
	}

	@Override
	public int insertStudent(Student ob) {
		// TODO Auto-generated method stub
		int i =0;
		try {
			Connection con = dbcon1.getCon();
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?)");
			
			ps.setInt(1,ob.getSid());
			ps.setString(2,ob.getSname());
			ps.setString(3,ob.getDepartment());
			ps.setString(4,ob.getStatus());
			 i = ps.executeUpdate();
		
		
		
	}catch(Exception e)
		{System.out.println(e);}
		return i;
}
}