package com.omkar.pojo;

import java.util.Set;

public class Student {
	private int rollno;
	private String sname;
	private float smarks;
	private Set<Course> cno;//To build association between 2 classses (one-to-many)
	public Student()
	{}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getSmarks() {
		return smarks;
	}
	public void setSmarks(float smarks) {
		this.smarks = smarks;
	}
	
	public Set<Course> getCno() {
		return cno;
	}
	public void setCno(Set<Course> cno) {
		this.cno = cno;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", smarks=" + smarks + "]";
	}
	
}
