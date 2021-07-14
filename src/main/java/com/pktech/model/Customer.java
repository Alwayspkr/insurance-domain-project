package com.pktech.model;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "insurance_customer")
public class Customer {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="customer_id")
	private Long customerId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="second_name")
	private String secondName;
	@Column(name="email_id")
	private String emailId;
	@Column(name="phone_number")
	private long phoneNumber;
	@Column(name="address")
	private String address;
	@Column(name="pincode")
	private int pinCode;
	
	
public Customer() {
	}



public Customer(String firstName, String secondName, String emailId, long phoneNumber, String address, int pinCode) {
	this.firstName = firstName;
	this.secondName = secondName;
	this.emailId = emailId;
	this.phoneNumber = phoneNumber;
	this.address = address;
	this.pinCode = pinCode;
}



public Long getCustomerId() {
	return customerId;
}


public void setCustomerId(Long customerId) {
	this.customerId = customerId;
}


public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getSecondName() {
	return secondName;
}


public void setSecondName(String secondName) {
	this.secondName = secondName;
}


public String getEmailId() {
	return emailId;
}


public void setEmailId(String emailId) {
	this.emailId = emailId;
}


public long getPhoneNumber() {
	return phoneNumber;
}


public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public int getPinCode() {
	return pinCode;
}


public void setPinCode(int pinCode) {
	this.pinCode = pinCode;
}



	
	
}
