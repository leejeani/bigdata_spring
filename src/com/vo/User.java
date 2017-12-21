package com.vo;

import java.util.ArrayList;

public class User {
	private String id;
	private String pwd;
	private String name;
	private ArrayList<Product> list;
	public User() {
	}
	public User(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	public User(String id, String pwd, String name, ArrayList<Product> list) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.list = list;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Product> getList() {
		return list;
	}
	public void setList(ArrayList<Product> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", pwd=" + pwd + ", name=" + name + ", list=" + list + "]";
	}

	
	
	
}






