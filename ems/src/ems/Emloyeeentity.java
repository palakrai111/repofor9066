package ems;

public class Emloyeeentity 
{ int eid ;
public Emloyeeentity(int eid, String name) {
	//super();
	this.eid = eid;
	this.name = name;
}
String name;
  public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Emloyeeentity [eid=" + eid + ", name=" + name + "]";
}


}
