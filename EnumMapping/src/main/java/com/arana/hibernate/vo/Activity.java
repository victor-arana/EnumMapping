package com.arana.hibernate.vo;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.arana.hibernate.enums.Status;

@Entity
public class Activity {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Convert(converter = StatusConverter.class)
	private Status converted;
	
	public Activity() {
	}

	public Activity(Status active) {
		this.converted = active;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Activity [id=" + id + ", converted=" + converted + "]";
	}
	
	
	
}
