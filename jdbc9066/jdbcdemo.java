package jdbc9066;
import java.sql.*;
public class jdbcdemo {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
		String DB_URL = "jdbc:mysql://localhost:3306/studentmanagement";
		 String DB_USERNAME = "root";
		 String DB_PASSWORD = "localhost";
		 Class.forName(DB_DRIVER);
		 Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
		 System.out.println("success");
		 //String date  = "2020-12-9"
		/* String query1 = "insert into student values(?,?,?,?)";
		 PreparedStatement ps = con.prepareStatement(query1);
		 ps.setInt(1, 300);
		 ps.setString(2, "gagan");
		 ps.setString(3, "fire");
	     ps.setString(4, "pass");*/
		 
		 String query1 = "delete from student where sid = ?";
		 //update student set sname = ? where sid = ?;
		 //ps.setString(1,"nnn");
		 //ps.setInt(2,9);
		 PreparedStatement ps = con.prepareStatement(query1);
		 
	     ps.setInt(1,300);
	     int i = ps.executeUpdate();
	     if(i>0)
	     {System.out.println("deletion done");}else {System.out.println("nd");}
		/* ResultSet rs = ps.executeQuery();
		 while(rs.next())
		 {
			 System.out.println(rs.getInt(1)+ " "+rs.getString(2)+ " "+ rs.getString(3)+ " "+rs.getString(4));
		 }*/
		 con.close();

	}

}
