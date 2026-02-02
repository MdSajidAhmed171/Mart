package com.mart.model;

public class User {
	
	private long id;
    private String name;
    private Role role;
	public User(long id, String name, Role role) {
		this.id = id;
		setName(name);
        setRole(role);
	}
    
	public boolean isAdmin() {
        return role == Role.ADMIN;
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("User name cannot be empty");
        }
		this.name = name;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		if (role == null) {
            throw new IllegalArgumentException("Role cannot be NULL");
        }
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
    

}
