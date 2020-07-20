package com.finalHandson.SpringBeanAutoConfig.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Details {

	@Value("${app.details.name}")
	private String Name;
	@Value("${app.details.age}")
	private int age = 24;
	@Autowired
	Address address;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	 public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Details [Name=" + Name + ", age=" + age + ", address=" + address + "]";
	}

}
