package com.springcore.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	// annotation can be put on properties, setter method, or constructors.
	private Address addr;

	public Address getAddr() {
		return addr;
	}

	@Autowired
	public void setAddr(Address addr) {
		this.addr = addr;
		System.out.println("Setting values...");
	}

	@Autowired
	public Employee(Address addr) {
		super();
		this.addr = addr;
		System.out.println("Inside constructor!");
	}

	@Override
	public String toString() {
		return "Employee [addr=" + addr + "]";
	}

	public Employee() {
		super();
	}
}
