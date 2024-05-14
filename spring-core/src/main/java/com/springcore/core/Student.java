package com.springcore.core;

public class Student {
	private int sid;
	private String studName;
	private String studAddress;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudAddress() {
		return studAddress;
	}

	public void setStudAddress(String studAddress) {
		this.studAddress = studAddress;
	}

	public Student(int sid, String studName, String studAddress) {
		super();
		this.sid = sid;
		this.studName = studName;
		this.studAddress = studAddress;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", studName=" + studName + ", studAddress=" + studAddress + "]";
	}

}
