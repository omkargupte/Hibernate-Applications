package com.omkar.pojo;

import java.util.Set;

public class Product {
	private int pid;
	private String pname;
	private float pamount;
	private Set<Customer> cid;
	
	public Product()
	{}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPamount() {
		return pamount;
	}
	public void setPamount(float pamount) {
		this.pamount = pamount;
	}
	public Set<Customer> getCid() {
		return cid;
	}
	public void setCid(Set<Customer> cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pamount=" + pamount + "]";
	}
	
}
