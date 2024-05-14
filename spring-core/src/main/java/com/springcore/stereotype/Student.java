package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component			// creates obj. with default name as class name in small letter
@Component("stu") // creates obj with specified name
@Scope("prototype") // used to specify that obj will be different for different obj and will not
					// reference to same obj
public class Student {
	@Value("xyz")
	private String studName;

	@Value("Hyderabad")
	private String city;

	@Value("#{ li }")
	private List<String> address;

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student(String studName, String city) {
		super();
		this.studName = studName;
		this.city = city;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [studName=" + studName + ", city=" + city + "]";
	}

}
