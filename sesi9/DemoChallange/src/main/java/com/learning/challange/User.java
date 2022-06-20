package com.learning.sax;

public class User {
	int id;
	private String name;
	private String firstname;
	private String lastname;
	
	public User() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getFirstName() {
		return firstname;
	}
	public void setFirstName(String firstname) {
		this.firstname=firstname;
	}
	
	public String getLastName() {
		return lastname;
	}
	public void setLastName(String lastname) {
		this.lastname= lastname;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[").append(id).append(":").append(firstname).append(":").append(lastname).append("]");

        return builder.toString();
	}
}