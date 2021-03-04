package com.tts.TechTalentTwitter.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private Long id;
    private String role;
    
    // Use this code if your lombok is not working:
    public String getRole() {
    	return role;
    }

    public void setRole(String role) {
    	this.role = role;
    }

    public Long getId() {
    	return id;
    }

    @Override
    public String toString() {
    	return "Role [id=" + id + ", role=" + role + "]";
    }
}