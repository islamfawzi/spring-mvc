package org.spring.mvc.models;

import java.util.LinkedHashMap;

public class Student {

	private String firstname;
	private String lastname;
	private String country;
	private String favoritelanguage;
	
	private LinkedHashMap<String, String> countries;
	private LinkedHashMap<String, String> favoritelanguages;

	public Student() {

		countries = new LinkedHashMap<String, String>();
		countries.put("EG", "Egypt");
		countries.put("SA", "Saudi");
		countries.put("DE", "Germany");
		countries.put("US", "USA");
		
		
		favoritelanguages = new LinkedHashMap<String, String>();
		favoritelanguages.put("Java", "Java");
		favoritelanguages.put("C#", "C#");
		favoritelanguages.put("PHP", "PHP");
		favoritelanguages.put("Ruby", "Ruby");
		favoritelanguages.put("Angular", "Angular");
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

	public String getFavoritelanguage() {
		return favoritelanguage;
	}

	public void setFavoritelanguage(String favoritelanguage) {
		this.favoritelanguage = favoritelanguage;
	}

	/** populate countries drop down menu **/
	public LinkedHashMap<String, String> getCountries() {
		return countries;
	}

	/** populate favorite languages radio buttons **/
	public LinkedHashMap<String, String> getFavoritelanguages() {
		return favoritelanguages;
	}

	@Override
	public String toString() {
		return String.format("Student [firstname=%s, lastname=%s, country=%s]", firstname, lastname, country);
	}

}
