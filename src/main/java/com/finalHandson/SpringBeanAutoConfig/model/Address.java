package com.finalHandson.SpringBeanAutoConfig.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Address {

	@Value("${app.address.house.name}")
	private String houseNumber;
	@Value("${app.address.city}")
	private String city = "Kottayam";
	@Value("${app.address.state}")
	private String State = "Kerala";
	@Value("${app.address.code}")
	private int pincode = 669320;
	
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", city=" + city + ", State=" + State + ", pincode=" + pincode
				+ "]";
	}

}
