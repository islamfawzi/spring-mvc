package org.spring.mvc.models;

import java.util.LinkedHashMap;

public class Student {

	private String firstname;
	private String lastname;
	private String country;

	private LinkedHashMap<String, String> countries;

	public Student() {

		countries = new LinkedHashMap<String, String>();
		countries.put("EG", "Egypt");
		countries.put("SA", "Saudi");
		countries.put("DE", "Germany");
		countries.put("US", "USA");
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

	public String getCountry() {
		return country != null ? countries.get(country) : country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountries() {
		return countries;
	}

	@Override
	public String toString() {
		return String.format("Student [firstname=%s, lastname=%s, country=%s]", firstname, lastname, country);
	}

}
