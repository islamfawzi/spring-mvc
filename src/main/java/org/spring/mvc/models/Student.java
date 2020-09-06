package org.spring.mvc.models;

public class Student {

	private String firstname;
	private String lastname;

	public Student() {
	}

	public Student(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return String.format("Student [firstname=%s, lastname=%s]", firstname, lastname);
	}
}
