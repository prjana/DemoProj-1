package com.example.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Address implements Serializable{
	
	/**
	 * default serialVersionID
	 */
	private static final long serialVersionUID = 1L;
	private String addrline1;
	private String addrLine2;
	private String zipcode;
	private String state;
	
	public Address(String addrline1, String addrLine2, String zipcode, String city, String state) {
		super();
		this.addrline1 = addrline1;
		this.addrLine2 = addrLine2;
		this.zipcode = zipcode;
		this.city = city;
		this.state = state;
	}
	
	
	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private String city;
	
	public String getAddrline1() {
		return addrline1;
	}
	public void setAddrline1(String addrline1) {
		this.addrline1 = addrline1;
	}
	public String getAddrLine2() {
		return addrLine2;
	}
	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	

}
