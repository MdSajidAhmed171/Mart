package com.mart.model;

public class User {
	
	private long id;
    private String name;
    private Role role;
	public User(long id, String name, Role role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}
    
	public boolean isAdmin() {
        return role == Role.ADMIN;
    }
    

}
