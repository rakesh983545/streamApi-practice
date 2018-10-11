package com.rakesh.StreamReductionAPi;

public class Product {
	
	int id;
	String pname;
	
	
	public Product(int id, String pname) {
		super();
		this.id = id;
		this.pname = pname;
	}
	public int getId() {
		return id;
	}
	public String getPname() {
		return pname;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + "]";
	}
	
	

}
