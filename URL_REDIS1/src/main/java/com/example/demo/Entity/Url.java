package com.example.demo.Entity;

import java.io.Serializable;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.stereotype.Component;

@RedisHash("URL")
@Component
public class Url implements Serializable{

	@Id
	private int id;
	private String Original_Url;
	private String encoded_url;
	private String name;
	public Url(String original_Url, String encoded_url, String name) {
		super();
		this.id = id;
		Original_Url = original_Url;
		this.encoded_url = encoded_url;
		this.name = name;
	}
	public Url() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOriginal_Url() {
		return Original_Url;
	}
	public void setOriginal_Url(String original_Url) {
		Original_Url = original_Url;
	}
	public String getEncoded_url() {
		return encoded_url;
	}
	public void setEncoded_url(String encoded_url) {
		this.encoded_url = encoded_url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Url [id=" + id + ", Original_Url=" + Original_Url + ", encoded_url=" + encoded_url + ", name=" + name
				+ "]";
	}
	
	
	
}
