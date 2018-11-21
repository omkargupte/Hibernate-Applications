package com.omkar.pojo;

public class Course {
	private int cno;
	private String cname;
	public  Course()
	{
		
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Course [cno=" + cno + ", cname=" + cname + "]";
	}
	
}
