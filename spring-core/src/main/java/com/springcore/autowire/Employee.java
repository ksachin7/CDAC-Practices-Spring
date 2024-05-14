package com.springcore.autowire;

public class Employee {
	private Address addr;

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
		System.out.println("Setting values...");
	}

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
