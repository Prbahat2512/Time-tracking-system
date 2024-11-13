package com.user.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private String username;
    private String passwordHash;

    @Enumerated(EnumType.STRING)
    private Role role;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public enum Role {
        ADMIN, USER
    }

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String username, String passwordHash, Role role, Timestamp createdAt, Timestamp updatedAt) {
		super();
		this.userId = userId;
		this.username = username;
		this.passwordHash = passwordHash;
		this.role = role;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", passwordHash=" + passwordHash + ", role=" + role
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}

    // Getters and Setters
    
}

