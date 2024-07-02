package in.sp.main9066;

public class Student
{
	int sid;
	String sname;
	String department;
	String status;
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", department=" + department + ", status=" + status + "]";
	}

	public Student(int sid, String sname, String department, String status) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.department = department;
		this.status = status;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
