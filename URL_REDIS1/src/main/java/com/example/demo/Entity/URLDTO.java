package com.example.demo.Entity;

import org.springframework.data.annotation.Id;

public class URLDTO {

	private String originalurl;
	private String name;
	@Override
	public String toString() {
		return "URLDTO [originalurl=" + originalurl + "name=" + name + "]";
	}
	public String getOriginalurl() {
		return originalurl;
	}
	public void setOriginalurl(String originalurl) {
		this.originalurl = originalurl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public URLDTO(String originalurl,String name) {
		super();
		this.originalurl = originalurl;
		this.name = name;
	}
	public URLDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
