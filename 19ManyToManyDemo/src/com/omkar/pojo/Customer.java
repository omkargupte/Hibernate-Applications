package com.omkar.pojo;

import java.util.Set;

public class Customer {
	private int cid;
	private String cname;
	private String caddr;
	private long cphno;
	private Set<Product> pid;
	
	public Customer()
	{}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddr() {
		return caddr;
	}
	public void setCaddr(String caddr) {
		this.caddr = caddr;
	}
	public long getCphno() {
		return cphno;
	}
	public void setCphno(long cphno) {
		this.cphno = cphno;
	}
	public Set<Product> getPid() {
		return pid;
	}
	public void setPid(Set<Product> pid) {
		this.pid = pid;
	}
	
	
}
