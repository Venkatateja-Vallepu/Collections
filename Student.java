package com.cashapona.collections.jun15;

public class Student {
	/**
	 * @author venkat
	 * created Student bean class using the fields name, address, phoneNumber of private type
	 */
	private String name;
	private String address;
	private String phoneNumber;
	/**
	 * @param name
	 * @param address
	 * @param phoneNumber
	 */
	public Student(String name, String address, String phoneNumber) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}
}
		