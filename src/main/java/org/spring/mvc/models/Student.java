package org.spring.mvc.models;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String firstname;  // input
	private String lastname;  // input
	private String country;   // drop down menu
	private String favoritelanguage;  // radio button
	private String[] operationSystems; 	// checkboxes
	
	/** for countries drop down menu **/
	private LinkedHashMap<String, String> countries;
	
	/** for favorite languages radio buttons **/
	private LinkedHashMap<String, String> favoritelanguages;
	
	/** for operating systems checkboxes **/
	private LinkedHashMap<String, String> opSys;

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
		
		opSys = new LinkedHashMap<String, String>();
		opSys.put("Windows", "Windows");
		opSys.put("Linux", "Linux");
		opSys.put("Redhat", "Redhat");
		opSys.put("Mac", "Mac");
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname.trim();
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

	public String[] getOperationSystems() {
		return operationSystems;
	}

	public void setOperationSystems(String[] operationSystems) {
		this.operationSystems = operationSystems;
	}

	/** populate countries drop down menu **/
	public LinkedHashMap<String, String> getCountries() {
		return countries;
	}

	/** populate favorite languages radio buttons **/
	public LinkedHashMap<String, String> getFavoritelanguages() {
		return favoritelanguages;
	}
	
	/** populate operating systems checkboxes **/
	public LinkedHashMap<String, String> getOpSys() {
		return opSys;
	}

	@Override
	public String toString() {
		return String.format("Student [firstname=%s, lastname=%s, country=%s]", firstname, lastname, country);
	}

}
