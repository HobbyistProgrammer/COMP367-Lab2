package com.comp303.assignment1;

/**
 * Author: Benton Le
 * Student #: 301 174 103
 * Professor: Vivek Ahuja
 * Course: COMP303 - 401
 * Assignment: Assignment1
 * Date: 02-03-2024
 */

public class Order {

	private String fname;
	private String lname;
	private String email;
	private String phoneNumber;
	private String address;
	private String address2;
	private String city;
	private String province;
	private String zip;
	private String countries;
	
	private int productNum;
	private String brand;
	private String model;
	private int orderQty;
	
	public String getFname() { return fname; }
	public void setFname(String fname) { this.fname = fname; }
	public String getLname() { return lname; }
	public void setLname(String lname) { this.lname = lname; }
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	
	public String getPhoneNumber() { return phoneNumber; }
	public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
	
	public String getAddress() { return address; }
	public void setAddress(String address) { this.address = address; }
	public String getAddress2() { return address2; }
	public void setAddress2(String address2) { this.address2 = address2; }
	public String getCity() { return city; }
	public void setCity(String city) { this.city = city; }
	public String getProvince() { return province; }
	public void setProvince(String province) { this.province = province; }
	public String getZip() { return zip; }
	public void setZip(String zip) { this.zip = zip; }
	public String getCountries() { return countries; }
	public void setCountries(String countries) { this.countries = countries; }
	
	public int getProductNum() { return productNum; }
	public void setProductNum(int productNum) { this.productNum = productNum; }
	public String getBrand() { return brand; }
	public void setBrand(String brand) { this.brand = brand; }
	public String getModel() { return model; }
	public void setModel(String model) { this.model = model; }
	public int getOrderQty() { return orderQty; }
	public void setOrderQty(int orderQty) { this.orderQty = orderQty; }
}
